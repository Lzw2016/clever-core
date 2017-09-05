package org.clever.core.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.DataEntity;

import javax.persistence.Table;

/**
 * 字典
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 15:09 <br/>
 */
@Table(name = "core_dict")
@EqualsAndHashCode(callSuper = true)
@Data
public class Dict extends DataEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 字典键
     */
    private String dictKey;

    /**
     * 字典数据值
     */
    private String dictValue;

    /**
     * 字典分类
     */
    private String dictType;

    /**
     * 字典描述
     */
    private String description;

    /**
     * 排序
     */
    private Integer sort;
}
