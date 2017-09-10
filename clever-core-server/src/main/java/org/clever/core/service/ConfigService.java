package org.clever.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.model.exception.BusinessException;
import org.clever.common.server.service.BaseService;
import org.clever.common.utils.mapper.BeanMapper;
import org.clever.core.dto.request.ConfigAddDto;
import org.clever.core.dto.request.ConfigQueryDto;
import org.clever.core.dto.request.ConfigUpdateDto;
import org.clever.core.entity.Config;
import org.clever.core.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    public PageInfo<Config> queryConfig(ConfigQueryDto configQueryDto) {
        return PageHelper
                .startPage(configQueryDto.getPageNo(), configQueryDto.getPageSize())
                .doSelectPageInfo(() -> configMapper.queryConfig(configQueryDto));
    }

    @Transactional
    public Config addConfig(ConfigAddDto configAddDto) {
        Config config = BeanMapper.mapper(configAddDto, Config.class);
        config.setCreateBy("");
        config.setCreateDate(new Date());
        configMapper.insertSelective(config);
        return config;
    }

    public Config getConfig(String configKey) {
        return configMapper.getByConfigKey(configKey);
    }

    @Transactional
    public Config updateConfig(String configKey, ConfigUpdateDto configUpdateDto) {
        Config config = configMapper.getByConfigKey(configKey);
        if (config == null) {
            throw new BusinessException(String.format("配置信息不存在[configKey=%1$s]", configKey));
        }
        BeanMapper.copyTo(configUpdateDto, config);
        configMapper.updateByPrimaryKeySelective(config);
        config = configMapper.selectByPrimaryKey(config.getId());
        return config;
    }

    @Transactional
    public Config delConfig(String configKey) {
        Config config = configMapper.getByConfigKey(configKey);
        if (config == null) {
            throw new BusinessException(String.format("配置信息不存在[configKey=%1$s]", configKey));
        }
        configMapper.delete(config);
        return config;
    }
}
