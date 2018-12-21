package com.zihan.blog.core.persistence.mapper;

import com.zihan.blog.core.business.vo.LinkConditionVO;
import com.zihan.blog.core.persistence.beans.SysLink;
import com.zihan.blog.core.plugin.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface SysLinkMapper extends BaseMapper<SysLink> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysLink> findPageBreakByCondition(LinkConditionVO vo);
}
