package org.clever.core.service;

import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.dto.request.MDictAddDto;
import org.clever.core.dto.request.MDictQueryDto;
import org.clever.core.dto.request.MDictUpdateDto;
import org.clever.core.entity.MDict;
import org.clever.core.mapper.MDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:42 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class MDictService extends BaseService {

    @Autowired
    private MDictMapper mDictMapper;

    public PageInfo<MDict> queryMDict(MDictQueryDto mDictQueryDto) {
        return null;
    }

    public MDict addMDict(MDictAddDto mDictAddDto) {
        return null;
    }

    public MDict getMDict(String fullPath) {
        return null;
    }

    public MDict updateMDict(String fullPath, MDictUpdateDto mDictUpdateDto) {
        return null;
    }

    public MDict delMDict(String fullPath) {
        return null;
    }
}
