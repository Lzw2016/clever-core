package org.clever.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.clever.common.server.mapper.CustomMapper;
import org.clever.core.dto.request.TemplateQueryDto;
import org.clever.core.entity.Template;

import java.util.List;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:38 <br/>
 */
public interface TemplateMapper extends CustomMapper<Template> {

    List<Template> queryTemplate(TemplateQueryDto templateQueryDto);

    Template getByName(@Param("name") String name);
}
