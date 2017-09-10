package org.clever.core.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.clever.common.server.controller.BaseController;
import org.clever.core.dto.request.MDictAddDto;
import org.clever.core.dto.request.MDictQueryDto;
import org.clever.core.dto.request.MDictUpdateDto;
import org.clever.core.entity.MDict;
import org.clever.core.service.MDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:49 <br/>
 */
@Api(description = "多级字典管理")
@RequestMapping("/core")
@RestController
public class MDictController extends BaseController {

    @Autowired
    private MDictService mDictService;

    @ApiOperation("分页查询多级字典")
    @GetMapping("/mdicts")
    public PageInfo<MDict> queryMDict(MDictQueryDto mDictQueryDto) {
        return mDictService.queryMDict(mDictQueryDto);
    }

    @ApiOperation("新增多级字典")
    @PostMapping("/mdicts")
    public MDict addMDict(@RequestBody @Validated MDictAddDto mDictAddDto) {
        return mDictService.addMDict(mDictAddDto);
    }

    @ApiOperation("获取多级字典")
    @GetMapping("/mdicts/{fullPath}")
    public MDict getMDict(@PathVariable("fullPath") String fullPath) {
        return mDictService.getMDict(fullPath);
    }

    @ApiOperation("更新多级字典")
    @PutMapping("/mdicts/{fullPath}")
    public MDict updateMDict(@PathVariable("fullPath") String fullPath, @RequestBody @Validated MDictUpdateDto mDictUpdateDto) {
        return mDictService.updateMDict(fullPath, mDictUpdateDto);
    }

    @ApiOperation("删除多级字典")
    @DeleteMapping("/mdicts/{fullPath}")
    public MDict delMDict(@PathVariable("fullPath") String fullPath) {
        return mDictService.delMDict(fullPath);
    }
}
