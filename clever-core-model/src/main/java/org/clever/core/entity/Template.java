package org.clever.core.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.DataEntity;

/**
 * 模版数据表
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-6-17 15:10 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Template extends DataEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 模版名称，不能重复
     */
    private String name;

    /**
     * 模版内容
     */
    private String content;

    /**
     * 模版语言
     */
    private String locale;

    /**
     * 模版说明
     */
    private String description;
}
