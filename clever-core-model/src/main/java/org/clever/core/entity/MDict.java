package org.clever.core.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.DataEntity;

import javax.persistence.Table;

/**
 * 树结构字典
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 15:12 <br/>
 */
@Table(name = "core_mdict")
@EqualsAndHashCode(callSuper = true)
@Data
public class MDict extends DataEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 父级编号
     */
    private Long parentId;

    /**
     * 树结构的全路径用“-”隔开
     */
    private String fullPath;

    /**
     * 字典名称
     */
    private String mdictKey;

    /**
     * 字典值
     */
    private String mdictValue;

    /**
     * 字典类型
     */
    private String mdictType;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序
     */
    private Integer sort;
}
