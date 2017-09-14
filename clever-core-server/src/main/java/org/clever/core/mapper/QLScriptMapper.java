package org.clever.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.clever.common.server.mapper.CustomMapper;
import org.clever.core.dto.request.QLScriptQueryDto;
import org.clever.core.entity.QLScript;

import java.util.List;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:35 <br/>
 */
public interface QLScriptMapper extends CustomMapper<QLScript> {

    List<QLScript> queryQLScrip(QLScriptQueryDto qlScriptQueryDto);

    QLScript getByName(@Param("name") String name);

}
