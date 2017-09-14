package org.clever.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.model.exception.BusinessException;
import org.clever.common.server.service.BaseService;
import org.clever.common.utils.mapper.BeanMapper;
import org.clever.core.dto.request.QLScriptAddDto;
import org.clever.core.dto.request.QLScriptQueryDto;
import org.clever.core.dto.request.QLScriptUpdateDto;
import org.clever.core.entity.QLScript;
import org.clever.core.mapper.QLScriptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:44 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class QLScriptService extends BaseService {

    @Autowired
    private QLScriptMapper qlScriptMapper;

    public PageInfo<QLScript> queryQLScrip(QLScriptQueryDto qlScriptQueryDto) {
        return PageHelper
                .startPage(qlScriptQueryDto.getPageNo(), qlScriptQueryDto.getPageSize())
                .doSelectPageInfo(() -> qlScriptMapper.queryQLScrip(qlScriptQueryDto));
    }

    @Transactional
    public QLScript addQLScrip(QLScriptAddDto qlScriptAddDto) {
        QLScript qlScript = BeanMapper.mapper(qlScriptAddDto, QLScript.class);
        qlScript.setCreateBy("");
        qlScript.setCreateDate(new Date());
        qlScriptMapper.insertSelective(qlScript);
        return qlScript;
    }

    public QLScript getQLScrip(String name) {
        return qlScriptMapper.getByName(name);
    }

    @Transactional
    public QLScript updateQLScrip(String name, QLScriptUpdateDto qlScriptUpdateDto) {
        QLScript qlScript = qlScriptMapper.getByName(name);
        if (qlScript == null) {
            throw new BusinessException(String.format("数据库脚本不存在[name=%1$s]", name));
        }
        BeanMapper.copyTo(qlScriptUpdateDto, qlScript);
        qlScriptMapper.updateByPrimaryKeySelective(qlScript);
        qlScript = qlScriptMapper.selectByPrimaryKey(qlScript.getId());
        return qlScript;
    }

    @Transactional
    public QLScript delQLScrip(String name) {
        QLScript qlScript = qlScriptMapper.getByName(name);
        if (qlScript == null) {
            throw new BusinessException(String.format("数据库脚本不存在[name=%1$s]", name));
        }
        qlScriptMapper.delete(qlScript);
        return qlScript;
    }
}
