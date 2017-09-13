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
import java.util.List;
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
        MDict parentMDict = null;
        if (!Objects.equals(mDict.getParentId(), MDict.ROOT_PARENT_ID)) {
            // 字典类型要与父节点一致
            parentMDict = mDictMapper.selectByPrimaryKey(mDict.getParentId());
            if (parentMDict == null) {
                throw new BusinessException("上级字典不存在");
            }
            if (!Objects.equals(mDict.getMdictType(), parentMDict.getMdictType())) {
                throw new BusinessException("字典类型要与上级字典一致");
            }
        }
        mDict.setFullPath("");
        mDict.setCreateBy("");
        mDict.setCreateDate(new Date());
        mDictMapper.insertSelective(mDict);
        if (parentMDict != null) {
            mDict.setFullPath(parentMDict.getFullPath() + MDict.FULL_PATH_SPLIT + mDict.getId());
        } else {
            mDict.setFullPath(mDict.getId().toString());
        }
        mDictMapper.updateByPrimaryKeySelective(mDict);
        return mDict;
    }

    public MDict getMDict(String fullPath) {
        return mDictMapper.getByFullPath(fullPath);
    }

    public List<MDict> findByType(String mdictType) {
        return mDictMapper.findByType(mdictType);
    }

    @Transactional
    public MDict updateMDict(String fullPath, MDictUpdateDto mDictUpdateDto) {
        MDict mDict = mDictMapper.getByFullPath(fullPath);
        if (mDict == null) {
            throw new BusinessException(String.format("字典信息不存在[fullPath=%1$s]", fullPath));
        }
        BeanMapper.copyTo(mDictUpdateDto, mDict);
        mDictMapper.updateByPrimaryKeySelective(mDict);
        mDict = mDictMapper.selectByPrimaryKey(mDict.getId());
        return mDict;
    }

    @Transactional
    public MDict delMDict(String fullPath) {
        MDict mDict = mDictMapper.getByFullPath(fullPath);
        if (mDict == null) {
            throw new BusinessException(String.format("字典信息不存在[fullPath=%1$s]", fullPath));
        }
        mDictMapper.delete(mDict);
        return mDict;
    }
}
