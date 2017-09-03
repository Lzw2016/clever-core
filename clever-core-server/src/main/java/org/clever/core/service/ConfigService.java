package org.clever.core.service;

import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-03 22:02 <br/>
 */
@Slf4j
@Service
public class ConfigService extends BaseService {

    @Autowired
    private ConfigMapper configMapper;

}
