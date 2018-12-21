package com.zihan.blog.admin.controller;

import com.github.pagehelper.PageInfo;
import com.zihan.blog.core.business.annotation.BussinessLog;
import com.zihan.blog.core.business.entity.Template;
import com.zihan.blog.core.business.enums.ResponseStatus;
import com.zihan.blog.core.business.service.SysTemplateService;
import com.zihan.blog.core.business.vo.TemplateConditionVO;
import com.zihan.blog.core.framework.object.PageResult;
import com.zihan.blog.core.framework.object.ResponseVO;
import com.zihan.blog.core.util.ResultUtil;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模板管理
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/24 14:37
 * @since 1.0
 */
@RestController
@RequestMapping("/template")
public class RestTemplateController {
    @Autowired
    private SysTemplateService templateService;

    @RequiresPermissions("templates")
    @PostMapping("/list")
    public PageResult list(TemplateConditionVO vo) {
        PageInfo<Template> pageInfo = templateService.findPageBreakByCondition(vo);
        return ResultUtil.tablePage(pageInfo);
    }

    @RequiresPermissions("template:add")
    @PostMapping(value = "/add")
    @BussinessLog("添加模板")
    public ResponseVO add(Template template) {
        templateService.insert(template);
        return ResultUtil.success("成功");
    }

    @RequiresPermissions(value = {"template:batchDelete", "template:delete"}, logical = Logical.OR)
    @PostMapping(value = "/remove")
    @BussinessLog("删除模板")
    public ResponseVO remove(Long[] ids) {
        if (null == ids) {
            return ResultUtil.error(500, "请至少选择一条记录");
        }
        for (Long id : ids) {
            templateService.removeByPrimaryKey(id);
        }
        return ResultUtil.success("成功删除 [" + ids.length + "] 个模板");
    }

    @RequiresPermissions("template:get")
    @PostMapping("/get/{id}")
    @BussinessLog("获取模板详情")
    public ResponseVO get(@PathVariable Long id) {
        return ResultUtil.success(null, this.templateService.getByPrimaryKey(id));
    }

    @RequiresPermissions("template:edit")
    @PostMapping("/edit")
    @BussinessLog("编辑模板")
    public ResponseVO edit(Template template) {
        try {
            templateService.updateSelective(template);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error("模板修改失败！");
        }
        return ResultUtil.success(ResponseStatus.SUCCESS);
    }

}
