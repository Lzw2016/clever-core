package org.clever.core.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.TemplateAddDto;
import org.clever.core.dto.request.TemplateQueryDto;
import org.clever.core.dto.request.TemplateUpdateDto;
import org.clever.core.entity.Template;
import org.clever.core.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:52 <br/>
 */
@Api(description = "模版管理")
@RequestMapping("/core")
@RestController
public class TemplateController extends BaseController {

    @Autowired
    private TemplateService templateService;

    @ApiOperation("分页查询模版")
    @GetMapping("/template")
    public PageInfo<Template> queryTemplate(TemplateQueryDto templateQueryDto) {
        return templateService.queryTemplate(templateQueryDto);
    }

    @ApiOperation("新增模版")
    @PostMapping("/template")
    public Template addTemplate(@RequestBody @Validated TemplateAddDto templateAddDto) {
        return templateService.addTemplate(templateAddDto);
    }

    @ApiOperation("获取模版")
    @GetMapping("/template/{name}")
    public Template getTemplate(@PathVariable("name") String name) {
        return templateService.getTemplate(name);
    }

    @ApiOperation("更新模版")
    @PutMapping("/template/{name}")
    public Template updateTemplate(@PathVariable("name") String name, @RequestBody @Validated TemplateUpdateDto templateUpdateDto) {
        return templateService.updateTemplate(name, templateUpdateDto);
    }

    @ApiOperation("删除模版")
    @DeleteMapping("/template/{name}")
    public Template delTemplate(@PathVariable("name") String name) {
        return templateService.delTemplate(name);
    }
}
