package org.clever.core.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.BaseEntity;
import org.clever.common.model.request.QueryByPage;

import javax.validation.constraints.Pattern;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-04 23:40 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConfigQueryDto extends QueryByPage {
    private static final long serialVersionUID = 1L;

    /**
     * 配置键
     */
    private String configKey;

    /**
     * 配置数据值
     */
    private String configValue;

    /**
     * 配置组名称
     */
    private String configGroup;

    /**
     * 是否支持在线配置生效（0：否；1：是）
     */
    @Pattern(regexp = "[" + BaseEntity.YES + BaseEntity.NO + "]")
    private String hotSwap;

}
