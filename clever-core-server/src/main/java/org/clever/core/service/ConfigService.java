package org.clever.core.service;

import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.service.BaseService;
import org.clever.core.dto.request.ConfigAddDto;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.dto.request.ConfigUpdateDto;
import org.clever.core.entity.Config;
import org.clever.core.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-03 22:02 <br/>
 */
@Slf4j
@Transactional(readOnly = true)
@Service
public class ConfigService extends BaseService {

    @Autowired
    private ConfigMapper configMapper;

    public Page<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return null;
    }

    public Config addConfig(ConfigAddDto configAddDto) {
        return null;
    }

    public Config getConfig(String configKey) {
        return null;
    }

    public Config updateConfig(String configKey, ConfigUpdateDto configUpdateDto) {
        return null;
    }

    public Config delConfig(String configKey) {
        return null;
    }
}
