package org.clever.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.model.exception.BusinessException;
import org.clever.common.server.service.BaseService;
import org.clever.common.utils.mapper.BeanMapper;
import org.clever.core.dto.request.DictAddDto;
import org.clever.core.dto.request.DictQueryDto;
import org.clever.core.dto.request.DictUpdateDto;
import org.clever.core.entity.Dict;
import org.clever.core.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
        return PageHelper
                .startPage(dictQueryDto.getPageNo(), dictQueryDto.getPageSize())
                .doSelectPageInfo(() -> dictMapper.queryDict(dictQueryDto));
    }

    @Transactional
    public Dict addDict(DictAddDto dictAddDto) {
        Dict dict = BeanMapper.mapper(dictAddDto, Dict.class);
        dict.setCreateBy("");
        dict.setCreateDate(new Date());
        dictMapper.insertSelective(dict);
        return dict;
    }

    public Dict getDict(String dictType, String dictKey) {
        return dictMapper.getByDictKey(dictType, dictKey);
    }

    @Transactional
    public Dict updateDict(String dictType, String dictKey, DictUpdateDto dictUpdateDto) {
        Dict dict = dictMapper.getByDictKey(dictType, dictKey);
        if (dict == null) {
            throw new BusinessException(String.format("字典信息不存在[dictType=%1$s] [dictKey=%2$s]", dictType, dictKey));
        }
        BeanMapper.copyTo(dictUpdateDto, dict);
        dictMapper.updateByPrimaryKeySelective(dict);
        dict = dictMapper.selectByPrimaryKey(dict.getId());
        return dict;
    }

    @Transactional
    public Dict delDict(String dictType, String dictKey) {
        Dict dict = dictMapper.getByDictKey(dictType, dictKey);
        if (dict == null) {
            throw new BusinessException(String.format("字典信息不存在[dictType=%1$s] [dictKey=%2$s]", dictType, dictKey));
        }
        dictMapper.delete(dict);
        return dict;
    }
}
