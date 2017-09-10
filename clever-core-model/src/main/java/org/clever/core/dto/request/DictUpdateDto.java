package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:57 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DictUpdateDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("字典键")
    @Length(max = 100)
    private String dictKey;

    @ApiModelProperty("字典数据值")
    @Length(max = 255)
    private String dictValue;

    @ApiModelProperty("字典分类")
    @Length(max = 100)
    private String dictType;

    @ApiModelProperty("字典描述")
    @Length(max = 500)
    private String description;

    @ApiModelProperty("排序(升序)")
    private Integer sort;
}

