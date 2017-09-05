package org.clever.core.controller;

import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.ConfigAddDto;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.dto.request.ConfigUpdateDto;
import org.clever.core.entity.Config;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-04 23:30 <br/>
 */
@Api("配置信息管理")
@RequestMapping("/core")
@RestController
public class ConfigController extends BaseController {

    @ApiOperation("分页查询")
    @GetMapping("/configs")
    public Page<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return null;
    }

    @ApiOperation("新增配置")
    @PostMapping("/configs")
    public Config addConfig(@RequestBody @Validated ConfigAddDto configAddDto) {
        return null;
    }

    @ApiOperation("获取配置")
    @GetMapping("/configs/{configKey}")
    public Config getConfig(@PathVariable("configKey") String configKey) {
        return null;
    }

    @ApiOperation("更新配置")
    @PutMapping("/configs/{configKey}")
    public Config updateConfig(@PathVariable("configKey") String configKey, @RequestBody @Validated ConfigUpdateDto configUpdateDto) {
        return null;
    }

    @ApiOperation("删除配置")
    @DeleteMapping("/configs/{configKey}")
    public Config delConfig(@PathVariable("configKey") String configKey) {
        return null;
    }
}
