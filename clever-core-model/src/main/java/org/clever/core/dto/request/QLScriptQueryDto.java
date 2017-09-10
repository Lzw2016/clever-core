package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.QueryByPage;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:02 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLScriptQueryDto extends QueryByPage {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("脚本类型，可取：SQL、HQL")
    private String scriptType;

    @ApiModelProperty("脚本名称，使用包名称+类名+方法名")
    private String name;
}
