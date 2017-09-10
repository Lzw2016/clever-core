package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:00 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MDictAddDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("父级编号")
    @NotNull
    private Long parentId;

    @ApiModelProperty("树结构的全路径用“-”隔开")
    @NotEmpty
    @Length(max = 255)
    private String fullPath;

    @ApiModelProperty("字典名称")
    @NotEmpty
    @Length(max = 100)
    private String mdictKey;

    @ApiModelProperty("字典值")
    @NotEmpty
    @Length(max = 255)
    private String mdictValue;

    @ApiModelProperty("字典类型")
    @NotEmpty
    @Length(max = 255)
    private String mdictType;

    @ApiModelProperty("描述")
    @Length(max = 500)
    private String description;

    @ApiModelProperty("排序")
    private Integer sort;
}
