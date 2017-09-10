package org.clever.core.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.DictAddDto;
import org.clever.core.dto.request.DictQueryDto;
import org.clever.core.dto.request.DictUpdateDto;
import org.clever.core.entity.Dict;
import org.clever.core.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:46 <br/>
 */
@Api(description = "字典管理")
@RequestMapping("/core")
@RestController
public class DictController extends BaseController {

    @Autowired
    private DictService dictService;

    @ApiOperation("分页查询字典")
    @GetMapping("/dicts")
    public PageInfo<Dict> queryDict(DictQueryDto dictQueryDto) {
        return dictService.queryDict(dictQueryDto);
    }

    @ApiOperation("新增字典")
    @PostMapping("/dicts")
    public Dict addDict(@RequestBody @Validated DictAddDto dictAddDto) {
        return dictService.addDict(dictAddDto);
    }

    @ApiOperation("获取字典")
    @GetMapping("/dicts/{dictType}/{dictKey}")
    public Dict getDict(@PathVariable("dictType") String dictType, @PathVariable("dictKey") String dictKey) {
        return dictService.getDict(dictType, dictKey);
    }

    @ApiOperation("更新字典")
    @PutMapping("/dicts/{dictType}/{dictKey}")
    public Dict updateDict(@PathVariable("dictType") String dictType, @PathVariable("dictKey") String dictKey, @RequestBody @Validated DictUpdateDto dictUpdateDto) {
        return dictService.updateDict(dictType, dictKey, dictUpdateDto);
    }

    @ApiOperation("删除字典")
    @DeleteMapping("/dicts/{dictType}/{dictKey}")
    public Dict delDict(@PathVariable("dictType") String dictType, @PathVariable("dictKey") String dictKey) {
        return dictService.delDict(dictType, dictKey);
    }
}
