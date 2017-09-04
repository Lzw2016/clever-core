package org.clever.core.controller;

import com.github.pagehelper.Page;
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
@RequestMapping("/core")
@RestController
public class ConfigController extends BaseController {

    @GetMapping("/configs")
    public Page<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return null;
    }

    @PostMapping("/configs")
    public Config addConfig(@RequestBody @Validated ConfigAddDto configAddDto) {
        return null;
    }

    @GetMapping("/configs/{configKey}")
    public Config getConfig(@PathVariable("configKey") String configKey) {
        return null;
    }

    @PutMapping("/configs/{configKey}")
    public Config updateConfig(@PathVariable("configKey") String configKey, @RequestBody @Validated ConfigUpdateDto configUpdateDto) {
        return null;
    }

    @DeleteMapping("/configs/{configKey}")
    public Config delConfig(@PathVariable("configKey") String configKey) {
        return null;
    }
}
