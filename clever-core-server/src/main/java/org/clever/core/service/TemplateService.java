package org.clever.core.service;

import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.dto.request.TemplateAddDto;
import org.clever.core.dto.request.TemplateQueryDto;
import org.clever.core.dto.request.TemplateUpdateDto;
import org.clever.core.entity.Template;
import org.clever.core.mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }

    public Template addTemplate(TemplateAddDto templateAddDto) {
        return null;
    }

    public Template getTemplate(String name) {
        return null;
    }

    public Template updateTemplate(String name, TemplateUpdateDto templateUpdateDto) {
        return null;
    }

    public Template delTemplate(String name) {
        return null;
    }
}
