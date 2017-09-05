package org.clever.core.service;

import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.dto.request.DictAddDto;
import org.clever.core.dto.request.DictQueryDto;
import org.clever.core.dto.request.DictUpdateDto;
import org.clever.core.entity.Dict;
import org.clever.core.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:40 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class DictService extends BaseService {

    @Autowired
    private DictMapper dictMapper;

    public PageInfo<Dict> queryDict(DictQueryDto dictQueryDto) {
        return null;
    }

    public Dict addDict(DictAddDto dictAddDto) {
        return null;
    }

    public Dict getDict(String dictKey) {
        return null;
    }

    public Dict updateDict(String dictKey, DictUpdateDto dictUpdateDto) {
        return null;
    }

    public Dict delDict(String dictKey) {
        return null;
    }
}
