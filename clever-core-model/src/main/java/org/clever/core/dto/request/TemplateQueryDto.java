package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.QueryByPage;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:03 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TemplateQueryDto extends QueryByPage {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("模版名称，不能重复")
    private String name;

    @ApiModelProperty("模版语言")
    private String locale;
}