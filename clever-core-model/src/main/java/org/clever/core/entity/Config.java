package org.clever.core.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.DataEntity;

import javax.persistence.Table;

/**
 * 系统配置
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 14:38 <br/>
 */
@Table(name = "core_config")
@EqualsAndHashCode(callSuper = true)
@Data
public class Config extends DataEntity {
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
    private Character hotSwap;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序(升序)
     */
    private Integer sort;
}
