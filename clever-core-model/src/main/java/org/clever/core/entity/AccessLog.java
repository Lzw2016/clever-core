package org.clever.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.clever.common.model.entity.IdEntity;

import java.util.Date;

/**
 * 系统访问日志
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 15:19 <br/>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AccessLog extends IdEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 请求时间
     */
    private Date requestTime;

    /**
     * 请求URI
     */
    private String requestUri;

    /**
     * 操作方式,POST、GET...
     */
    private String method;

    /**
     * 请求参数数据
     */
    private String params;

    /**
     * 请求处理时间
     */
    private Long processTime;

    /**
     * 客户端的IP地址
     */
    private String remoteAddr;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 是否有异常（0：否；1：是）
     */
    private Character hasException;
    /**
     * 异常信息
     */
    private String exceptionInfo;
}
