package org.clever.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.clever.common.server.mapper.CustomMapper;
import org.clever.core.dto.request.MDictQueryDto;
import org.clever.core.entity.MDict;

import java.util.List;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:30 <br/>
 */
public interface MDictMapper extends CustomMapper<MDict> {

    List<MDict> queryMDict(MDictQueryDto mDictQueryDto);

    MDict getByFullPath(@Param("fullPath") String fullPath);

    List<MDict> findByType(@Param("mdictType") String mdictType);
}
