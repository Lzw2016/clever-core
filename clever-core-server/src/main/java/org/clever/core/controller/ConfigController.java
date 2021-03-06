package org.clever.core.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.ConfigAddDto;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.dto.request.ConfigUpdateDto;
import org.clever.core.entity.Config;
import org.clever.core.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-04 23:30 <br/>
 */
@Api(description = "配置信息管理")
@RequestMapping("/core")
@RestController
public class ConfigController extends BaseController {

    @Autowired
    public ConfigService configService;

    @ApiOperation("分页查询配置")
    @GetMapping("/configs" + JSON_SUFFIX)
    public PageInfo<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return configService.queryConfig(configQueryDto);
    }

    @ApiOperation("新增配置")
    @PostMapping("/configs" + JSON_SUFFIX)
    public Config addConfig(@RequestBody @Validated ConfigAddDto configAddDto) {
        return configService.addConfig(configAddDto);
    }

    @ApiOperation("获取配置")
    @GetMapping("/configs/{configKey}" + JSON_SUFFIX)
    public Config getConfig(@PathVariable("configKey") String configKey) {
        return configService.getConfig(configKey);
    }

    @ApiOperation("更新配置")
    @PutMapping("/configs/{configKey}" + JSON_SUFFIX)
    public Config updateConfig(@PathVariable("configKey") String configKey, @RequestBody @Validated ConfigUpdateDto configUpdateDto) {
        return configService.updateConfig(configKey, configUpdateDto);
    }

    @ApiOperation("删除配置")
    @DeleteMapping("/configs/{configKey}" + JSON_SUFFIX)
    public Config delConfig(@PathVariable("configKey") String configKey) {
        return configService.delConfig(configKey);
    }
}
