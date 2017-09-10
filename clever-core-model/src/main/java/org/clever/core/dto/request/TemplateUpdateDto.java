package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:04 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TemplateUpdateDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("模版名称，不能重复")
    @Length(max = 255)
    private String name;

    @ApiModelProperty("模版内容")
    private String content;

    @ApiModelProperty("模版语言")
    @Length(max = 50)
    private String locale;

    @ApiModelProperty("模版说明")
    @Length(max = 100)
    private String description;
}