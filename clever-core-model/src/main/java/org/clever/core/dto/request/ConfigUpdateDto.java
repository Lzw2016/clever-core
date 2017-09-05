package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.BaseEntity;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-04 23:28 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConfigUpdateDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("配置数据值")
    @Length(max = 255)
    private String configValue;

    @ApiModelProperty("是否支持在线配置生效")
    @Pattern(regexp = "[" + BaseEntity.YES + BaseEntity.NO + "]")
    private String hotSwap;

    @ApiModelProperty("描述")
    @Length(max = 500)
    private String description;

    @ApiModelProperty("排序(升序)")
    private Integer sort;
}
