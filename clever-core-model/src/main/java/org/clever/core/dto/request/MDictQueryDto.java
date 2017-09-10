package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.QueryByPage;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:01 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MDictQueryDto extends QueryByPage {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("父级编号")
    private Long parentId;

    @ApiModelProperty("树结构的全路径用“-”隔开")
    private String fullPath;

    @ApiModelProperty("字典名称")
    private String mdictKey;

    @ApiModelProperty("字典值")
    private String mdictValue;

    @ApiModelProperty("字典类型")
    private String mdictType;
}
