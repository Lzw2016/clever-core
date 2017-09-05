package org.clever.core.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.BaseEntity;
import org.clever.common.model.request.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-04 23:13 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConfigAddDto extends BaseRequest {
    private static final long serialVersionUID = 1L;

    /**
     * 配置键
     */
    @NotEmpty
    @Length(max = 255)
    private String configKey;

    /**
     * 配置数据值
     */
    @NotEmpty
    @Length(max = 255)
    private String configValue;

    /**
     * 配置组名称
     */
    private String configGroup;

    /**
     * 是否支持在线配置生效（0：否；1：是）
     */
    @NotNull
    @Pattern(regexp = "[" + BaseEntity.YES + BaseEntity.NO + "]")
    private String hotSwap;

    /**
     * 描述
     */
    @Length(max = 500)
    private String description;

    /**
     * 排序(升序)
     */
    private Integer sort;

}
