package com.zihan.blog.core.business.service;


import com.github.pagehelper.PageInfo;
import com.zihan.blog.core.business.entity.ArticleLook;
import com.zihan.blog.core.business.vo.ArticleLookConditionVO;
import com.zihan.blog.core.framework.object.AbstractService;

/**
 * 文章浏览记录
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface BizArticleLookService extends AbstractService<ArticleLook, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<ArticleLook> findPageBreakByCondition(ArticleLookConditionVO vo);
}
