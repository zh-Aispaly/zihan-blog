package com.zihan.blog.core.persistence.mapper;

import com.zihan.blog.core.persistence.beans.SysConfig;
import com.zihan.blog.core.plugin.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface SysConfigMapper extends BaseMapper<SysConfig> {

    SysConfig get();

    Map<String, Object> getSiteInfo();
}
