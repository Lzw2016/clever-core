package org.clever.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.clever.common.server.mapper.CustomMapper;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.entity.Config;

import java.util.List;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-03 18:34 <br/>
 */
public interface ConfigMapper extends CustomMapper<Config> {

    List<Config> queryConfig(ConfigQueryDto configQueryDto);

    Config getByConfigKey(@Param("configKey") String configKey);
}
