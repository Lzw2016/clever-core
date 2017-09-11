package org.clever.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.model.exception.BusinessException;
import org.clever.common.server.service.BaseService;
import org.clever.common.utils.mapper.BeanMapper;
import org.clever.core.dto.request.MDictAddDto;
import org.clever.core.dto.request.MDictQueryDto;
import org.clever.core.dto.request.MDictUpdateDto;
import org.clever.core.entity.MDict;
import org.clever.core.mapper.MDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Objects;

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
        return PageHelper
                .startPage(mDictQueryDto.getPageNo(), mDictQueryDto.getPageSize())
                .doSelectPageInfo(() -> mDictMapper.queryMDict(mDictQueryDto));
    }

    @Transactional
    public MDict addMDict(MDictAddDto mDictAddDto) {
        MDict mDict = BeanMapper.mapper(mDictAddDto, MDict.class);
        if (!Objects.equals(mDict.getParentId(), -1L)) {
            // 字典类型要与父节点一致
            MDict parentMDict = mDictMapper.selectByPrimaryKey(mDict.getParentId());
            if (parentMDict == null) {
                throw new BusinessException("上级字典不存在");
            }
            mDict.setFullPath("");
        }

        mDict.setCreateBy("");
        mDict.setCreateDate(new Date());
//        mDict.setFullPath(parentMDict.getFullPath() + MDict.FULL_PATH_SPLIT);
        return null;
    }

    public MDict getMDict(String fullPath) {
        return null;
    }

    @Transactional
    public MDict updateMDict(String fullPath, MDictUpdateDto mDictUpdateDto) {
        return null;
    }

    @Transactional
    public MDict delMDict(String fullPath) {
        return null;
    }
}
