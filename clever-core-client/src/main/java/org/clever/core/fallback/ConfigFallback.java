package org.clever.core.fallback;

import com.github.pagehelper.PageInfo;
import org.clever.core.client.ConfigClient;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.entity.Config;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/15 21:16 <br/>
 */
public class ConfigFallback implements ConfigClient {
    
    @Override
    public PageInfo<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return null;
    }
}
