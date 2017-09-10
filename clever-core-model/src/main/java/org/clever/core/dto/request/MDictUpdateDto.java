package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:00 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MDictUpdateDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("父级编号")
    private Long parentId;

    @ApiModelProperty("字典名称")
    @Length(max = 100)
    private String mdictKey;

    @ApiModelProperty("字典值")
    @Length(max = 255)
    private String mdictValue;

    @ApiModelProperty("字典类型")
    @Length(max = 255)
    private String mdictType;

    @ApiModelProperty("描述")
    @Length(max = 500)
    private String description;

    @ApiModelProperty("排序")
    private Integer sort;
}
