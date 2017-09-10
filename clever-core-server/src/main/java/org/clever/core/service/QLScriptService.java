package org.clever.core.service;

import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.dto.request.QLScriptAddDto;
import org.clever.core.dto.request.QLScriptQueryDto;
import org.clever.core.dto.request.QLScriptUpdateDto;
import org.clever.core.entity.QLScript;
import org.clever.core.mapper.QLScriptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }

    public QLScript addQLScrip(QLScriptAddDto qlScriptAddDto) {
        return null;
    }

    public QLScript getQLScrip(String name) {
        return null;
    }

    public QLScript updateQLScrip(String name, QLScriptUpdateDto qlScriptUpdateDto) {
        return null;
    }

    public QLScript delQLScrip(String name) {
        return null;
    }
}
