package org.clever.core.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.DataEntity;

/**
 * 数据库脚本
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 15:16 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLScript extends DataEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 脚本类型:SQL
     */
    public static final String TYPE_SQL = "SQL";
    /**
     * 脚本类型:HQL
     */
    public static final String TYPE_HQL = "HQL";

    /**
     * 脚本类型，可取："SQL"、"HQL"
     */
    private String scriptType;

    /**
     * 查询脚本，可以使用模版技术拼接
     */
    private String script;

    /**
     * 脚本名称，使用包名称+类名+方法名
     */
    private String name;

    /**
     * 脚本功能说明
     */
    private String description;
}
