package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:01 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLScriptAddDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("脚本类型，可取：SQL、HQL")
    @NotEmpty
    @Pattern(regexp = "SQL|HQL")
    private String scriptType;

    @ApiModelProperty("查询脚本，可以使用模版技术拼接")
    @NotEmpty
    @Length(max = 18000)
    private String script;

    @ApiModelProperty("脚本名称，使用包名称+类名+方法名")
    @NotEmpty
    @Length(max = 100)
    private String name;

    @ApiModelProperty("脚本功能说明")
    @Length(max = 1000)
    private String description;
}
