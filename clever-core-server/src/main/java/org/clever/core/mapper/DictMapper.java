package org.clever.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.clever.common.server.mapper.CustomMapper;
import org.clever.core.dto.request.DictQueryDto;
import org.clever.core.entity.Dict;

import java.util.List;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:23 <br/>
 */
public interface DictMapper extends CustomMapper<Dict> {

    List<Dict> queryDict(DictQueryDto dictQueryDto);

    Dict getByDictKey(@Param("dictType") String dictType, @Param("dictKey") String dictKey);
}
