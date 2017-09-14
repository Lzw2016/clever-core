package org.clever.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.model.exception.BusinessException;
import org.clever.common.server.service.BaseService;
import org.clever.common.utils.mapper.BeanMapper;
import org.clever.core.dto.request.TemplateAddDto;
import org.clever.core.dto.request.TemplateQueryDto;
import org.clever.core.dto.request.TemplateUpdateDto;
import org.clever.core.entity.Template;
import org.clever.core.mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:45 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class TemplateService extends BaseService {

    @Autowired
    private TemplateMapper templateMapper;

    public PageInfo<Template> queryTemplate(TemplateQueryDto templateQueryDto) {
        return PageHelper
                .startPage(templateQueryDto.getPageNo(), templateQueryDto.getPageSize())
                .doSelectPageInfo(() -> templateMapper.queryTemplate(templateQueryDto));
    }

    @Transactional
    public Template addTemplate(TemplateAddDto templateAddDto) {
        Template template = BeanMapper.mapper(templateAddDto, Template.class);
        template.setCreateBy("");
        template.setCreateDate(new Date());
        templateMapper.insertSelective(template);
        return template;
    }

    public Template getTemplate(String name) {
        return templateMapper.getByName(name);
    }

    @Transactional
    public Template updateTemplate(String name, TemplateUpdateDto templateUpdateDto) {
        Template template = templateMapper.getByName(name);
        if (template == null) {
            throw new BusinessException(String.format("模版不存在[name=%1$s]", name));
        }
        BeanMapper.copyTo(templateUpdateDto, template);
        templateMapper.updateByPrimaryKeySelective(template);
        template = templateMapper.selectByPrimaryKey(template.getId());
        return template;
    }

    @Transactional
    public Template delTemplate(String name) {
        Template template = templateMapper.getByName(name);
        if (template == null) {
            throw new BusinessException(String.format("模版不存在[name=%1$s]", name));
        }
        templateMapper.delete(template);
        return template;
    }
}
