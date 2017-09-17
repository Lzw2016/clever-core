package org.clever.core.client;

import com.github.pagehelper.PageInfo;
import org.clever.common.client.BaseClient;
import org.clever.core.Constant;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.entity.Config;
import org.clever.core.fallback.ConfigFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/15 20:00 <br/>
 */
@FeignClient(name = Constant.SERVER_NAME, fallback = ConfigFallback.class)
public interface ConfigClient extends BaseClient {

    /**
     * 分页查询配置
     */
    @GetMapping("/configs" + JSON_SUFFIX)
    PageInfo<Config> queryConfig(ConfigQueryDto configQueryDto);

    @GetMapping("/configs/{configKey}" + JSON_SUFFIX)
    Config getConfig(@PathVariable("configKey") String configKey);
}
