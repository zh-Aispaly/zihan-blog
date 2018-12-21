package com.zihan.blog.core.business.service;


import com.github.pagehelper.PageInfo;
import com.zihan.blog.core.business.entity.ArticleLove;
import com.zihan.blog.core.business.vo.ArticleLoveConditionVO;
import com.zihan.blog.core.framework.object.AbstractService;

/**
 * 文章点赞
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface BizArticleLoveService extends AbstractService<ArticleLove, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<ArticleLove> findPageBreakByCondition(ArticleLoveConditionVO vo);
}
