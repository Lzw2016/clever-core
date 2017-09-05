package org.clever.core.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.request.BaseRequest;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 21:01 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MDictQueryDto extends BaseRequest {
    private static final long serialVersionUID = 1L;
}
