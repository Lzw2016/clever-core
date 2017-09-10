package org.clever.core.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;
import org.clever.common.model.request.QueryByPage;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:56 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DictQueryDto extends QueryByPage {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("字典键")
    private String dictKey;

    @ApiModelProperty("字典数据值")
    private String dictValue;

    @ApiModelProperty("字典分类")
    private String dictType;
}
