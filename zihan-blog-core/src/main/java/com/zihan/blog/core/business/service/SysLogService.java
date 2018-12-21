package com.zihan.blog.core.business.service;


import com.github.pagehelper.PageInfo;
import com.zihan.blog.core.business.entity.Log;
import com.zihan.blog.core.business.vo.LogConditionVO;
import com.zihan.blog.core.framework.object.AbstractService;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
 * @date 2018/01/09 17:40
 * @since 1.0
 */
public interface SysLogService extends AbstractService<Log, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Log> findPageBreakByCondition(LogConditionVO vo);
}
