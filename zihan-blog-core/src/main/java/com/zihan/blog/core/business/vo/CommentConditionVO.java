package com.zihan.blog.core.business.vo;

import com.zihan.blog.core.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommentConditionVO extends BaseConditionVO {
	private Long userId;
	private Long sid;
	private Long pid;
	private String qq;
	private String email;
	private String url;
	private String status;
}

