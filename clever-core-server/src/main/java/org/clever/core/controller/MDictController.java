package org.clever.core.controller;

import io.swagger.annotations.Api;
import org.clever.common.server.controller.BaseController;
import org.clever.core.service.MDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
