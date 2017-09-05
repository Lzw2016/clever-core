package org.clever.core.service;

import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/5 20:45 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class TemplateService extends BaseService {

    @Autowired
    private TemplateMapper templateMapper;
}
