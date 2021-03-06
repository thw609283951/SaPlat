package io.jboot.admin.controller.app;

import com.jfinal.plugin.activerecord.Page;
import io.jboot.admin.base.common.RestResult;
import io.jboot.admin.base.exception.BusinessException;
import io.jboot.admin.base.interceptor.NotNullPara;
import io.jboot.admin.base.rest.datatable.DataTable;
import io.jboot.admin.base.web.base.BaseController;
import io.jboot.admin.service.api.*;
import io.jboot.admin.service.entity.model.FileProject;
import io.jboot.admin.service.entity.model.Files;
import io.jboot.admin.service.entity.model.UserRole;
import io.jboot.admin.support.auth.AuthUtils;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.List;

/**
 * -----------------------------
 *
 * @author LiuChuanJin
 * @version 2.0
 *          -----------------------------
 * @date 10:05 2018/8/4
 */
@RequestMapping("/app/track")
public class TrackController extends BaseController {

    @JbootrpcService
    private FileProjectService fileProjectService;

    @JbootrpcService
    private ProjectService projectService;

    @JbootrpcService
    private UserService userService;

    @JbootrpcService
    private ProjectFileTypeService projectFileTypeService;

    @JbootrpcService
    private FilesService filesService;

    @JbootrpcService
    private UserRoleService userRoleService;

    @JbootrpcService
    private RoleService roleService;

    public void index() {

    }

    /**
     * 风险跟踪管理登记表-表格渲染
     */
    @NotNullPara({"id", "fileTypeID"})
    public void fileTable() {
        Long id = getParaToLong("id");
        Long fileTypeID = getParaToLong("fileTypeID");
        FileProject model = new FileProject();
        model.setFileTypeID(fileTypeID);
        model.setProjectID(id);
        model.setIsEnable(true);
        int pageNumber = getParaToInt("pageNumber", 1);
        int pageSize = getParaToInt("pageSize", 30);
        Page<FileProject> page = fileProjectService.findPage(model, pageNumber, pageSize);
        for (int i = 0; i < page.getList().size(); i++) {
            page.getList().get(i).setCreateUserName(userService.findById(page.getList().get(i).getCreateUserID()).getName());
            page.getList().get(i).setName(projectFileTypeService.findById(page.getList().get(i).getFileTypeID()).getName());
        }
        renderJson(new DataTable<FileProject>(page));
    }

    /**
     * 风险跟踪管理登记表-项目-页面
     */
    public void toRiskTrack() {
        render("riskTrack.html");
    }

    /**
     * 风险跟踪管理登记表-页面
     */
    @NotNullPara("projectID")
    public void toRiskTrackManagement() {
        Long projectFileTypeID = projectFileTypeService.findByName("风险跟踪管理登记表").getId();
        List<UserRole> list = userRoleService.findListByUserId(AuthUtils.getLoginUser().getId());
        boolean mRole = false, fRole = false;
        for (UserRole u : list) {
            if (roleService.findById(u.getRoleID()).getName().equals("管理机构")) {
                mRole = true;
            } else if (roleService.findById(u.getRoleID()).getName().equals("服务机构")) {
                fRole = true;
            }
        }
        setAttr("mRole", mRole).setAttr("fRole", fRole).
                setAttr("projectFileTypeID", projectFileTypeID).setAttr("projectID", getParaToLong("projectID")).render("riskTrackingManagement.html");
    }

    /**
     * 风险跟踪管理登记表-删除
     */
    @NotNullPara({"id", "fileID"})
    public void deleteRiskTrackingMessage() {
        FileProject fileProject = fileProjectService.findById(getParaToLong("id"));
        Files files = filesService.findById(getParaToLong("fileID"));
        if (files != null && fileProject != null) {
            fileProject.setIsEnable(false);
            files.setIsEnable(false);
            if (!fileProjectService.update(fileProject, files)) {
                renderJson(RestResult.buildError("删除失败"));
                throw new BusinessException("删除失败");
            }
        }
    }

    /**
     * 跟踪资料移交表-页面
     */
    public void toTrackData() {
        Long projectFileTypeID = projectFileTypeService.findByName("跟踪资料移交表").getId();
        List<UserRole> list = userRoleService.findListByUserId(AuthUtils.getLoginUser().getId());
        boolean mRole = false, fRole = false;
        for (UserRole u : list) {
            if (roleService.findById(u.getRoleID()).getName().equals("管理机构")) {
                mRole = true;
            } else if (roleService.findById(u.getRoleID()).getName().equals("服务机构")) {
                fRole = true;
            }
        }
        setAttr("mRole", mRole).setAttr("fRole", fRole).
                setAttr("projectFileTypeID", projectFileTypeID).render("trackingDataTransfer.html");
    }

    /**
     * 备案资料移交表-页面
     */
    public void toRecordData() {
        Long projectFileTypeID = projectFileTypeService.findByName("备案资料移交表").getId();
        List<UserRole> list = userRoleService.findListByUserId(AuthUtils.getLoginUser().getId());
        boolean mRole = false, fRole = false;
        for (UserRole u : list) {
            if (roleService.findById(u.getRoleID()).getName().equals("管理机构")) {
                mRole = true;
            } else if (roleService.findById(u.getRoleID()).getName().equals("服务机构")) {
                fRole = true;
            }
        }
        setAttr("mRole", mRole).setAttr("fRole", fRole).
                setAttr("projectFileTypeID", projectFileTypeID).render("recordDataTransfer.html");
    }


}

