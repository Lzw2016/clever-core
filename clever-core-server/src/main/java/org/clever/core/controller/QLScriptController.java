package org.clever.core.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.QLScriptAddDto;
import org.clever.core.dto.request.QLScriptQueryDto;
import org.clever.core.dto.request.QLScriptUpdateDto;
import org.clever.core.entity.QLScript;
import org.clever.core.service.QLScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:50 <br/>
 */
@Api(description = "数据库脚本管理")
@RequestMapping("/core")
@RestController
public class QLScriptController extends BaseController {

    @Autowired
    private QLScriptService qlScriptService;

    @ApiOperation("分页查询数据库脚本")
    @GetMapping("/qlscrip" + JSON_SUFFIX)
    public PageInfo<QLScript> queryQLScrip(QLScriptQueryDto qlScriptQueryDto) {
        return qlScriptService.queryQLScrip(qlScriptQueryDto);
    }

    @ApiOperation("新增数据库脚本")
    @PostMapping("/qlscrip" + JSON_SUFFIX)
    public QLScript addQLScrip(@RequestBody @Validated QLScriptAddDto qlScriptAddDto) {
        return qlScriptService.addQLScrip(qlScriptAddDto);
    }

    @ApiOperation("获取数据库脚本")
    @GetMapping("/qlscrip/{name}" + JSON_SUFFIX)
    public QLScript getQLScrip(@PathVariable("name") String name) {
        return qlScriptService.getQLScrip(name);
    }

    @ApiOperation("更新数据库脚本")
    @PutMapping("/qlscrip/{name}" + JSON_SUFFIX)
    public QLScript updateQLScrip(@PathVariable("name") String name, @RequestBody @Validated QLScriptUpdateDto qlScriptUpdateDto) {
        return qlScriptService.updateQLScrip(name, qlScriptUpdateDto);
    }

    @ApiOperation("删除数据库脚本")
    @DeleteMapping("/qlscrip/{name}" + JSON_SUFFIX)
    public QLScript delQLScrip(@PathVariable("name") String name) {
        return qlScriptService.delQLScrip(name);
    }
}
