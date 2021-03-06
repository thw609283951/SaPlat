package io.jboot.admin.service.entity.status.system;

import io.jboot.admin.base.common.BaseStatus;

/**
 * -----------------------------
 *
 * @author LiuChuanjin
 * @version 2.0
 *          -----------------------------
 * @date 15:44 2018/7/14
 */
public class ProjectStatus extends BaseStatus {

    /**
     * 取消审核请求
     */
    public final static String CANCEL_VERIFY = "0";
    /**
     * 审核失败
     */
    public final static String NOT_VERIFY = "1";
    /**
     * 审核通过
     */
    public final static String IS_VERIFY = "2";
    /**
     * 审核中
     */
    public final static String VERIFIING = "3";
    /**
     * 评估中
     */
    public final static String REVIEW = "4";
    /**
     * 审查中
     */
    public final static String REVIEWED = "5";
    /**
     * 立项中
     */
    public final static String BUILDING = "6";
    /**
     * 审查完成
     */
    public final static String CHECKED = "7";

    public ProjectStatus() {
        add(CANCEL_VERIFY, "取消审核");
        add(NOT_VERIFY, "审核失败");
        add(IS_VERIFY, "审核成功");
        add(VERIFIING, "审核中");
        add(REVIEW, "评估中");
        add(REVIEWED, "审查中");
        add(BUILDING, "立项中");
        add(CHECKED, "审查完成");
    }

    private static ProjectStatus me;

    public static ProjectStatus me() {
        if (me == null) {
            me = new ProjectStatus();
        }
        return me;
    }

}