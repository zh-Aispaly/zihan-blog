package com.zihan.blog.core.persistence.mapper;

import com.zihan.blog.core.business.vo.LogConditionVO;
import com.zihan.blog.core.persistence.beans.SysLog;
import com.zihan.blog.core.plugin.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
 * @date 2018/01/09 17:45
 * @since 1.0
 */
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysLog> findPageBreakByCondition(LogConditionVO vo);
}
