package com.zihan.blog.core.business.service;


import com.github.pagehelper.PageInfo;
import com.zihan.blog.core.business.entity.UpdateRecorde;
import com.zihan.blog.core.business.vo.UpdateRecordeConditionVO;
import com.zihan.blog.core.framework.object.AbstractService;

/**
 * 更新记录
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface SysUpdateRecordeService extends AbstractService<UpdateRecorde, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<UpdateRecorde> findPageBreakByCondition(UpdateRecordeConditionVO vo);
}
