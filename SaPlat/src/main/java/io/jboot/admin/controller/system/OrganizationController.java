package io.jboot.admin.controller.system;

import com.jfinal.aop.Before;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.admin.base.common.RestResult;
import io.jboot.admin.base.exception.BusinessException;
import io.jboot.admin.base.interceptor.NotNullPara;
import io.jboot.admin.base.rest.datatable.DataTable;
import io.jboot.admin.base.web.base.BaseController;
import io.jboot.admin.service.api.FileFormService;
import io.jboot.admin.service.api.OrganizationService;
import io.jboot.admin.service.entity.model.FileForm;
import io.jboot.admin.service.entity.model.Organization;
import io.jboot.admin.service.entity.status.system.DataStatus;
import io.jboot.admin.validator.system.OrganizationValidator;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.Date;

/**
 * 组织管理
 *
 * @author rainsLM
 */
@RequestMapping("/system/organization")
public class OrganizationController extends BaseController {

    @JbootrpcService
    private OrganizationService organizationService;

    @JbootrpcService
    private FileFormService fileFormService;

    /**
     * index
     */
    public void index() {
        render("main.html");
    }

    /**
     * res表格数据
     */
    public void tableData() {
        int pageNumber = getParaToInt("pageNumber", 1);
        int pageSize = getParaToInt("pageSize", 30);

        Organization organization = new Organization();
        organization.setName(getPara("name"));

        Page<Organization> page = organizationService.findPage(organization, pageNumber, pageSize);
        for (Organization organization1 : page.getList()) {
            FileForm fileForm=fileFormService.findFirstByTableNameAndRecordIDAndFileName("organization","营业执照",organization1.getId());
            if(fileForm!=null) {
                organization1.setRemark(fileForm.getFileID().toString());
            }
            else {
                organization1.setRemark("not fileID");
            }
        }
        renderJson(new DataTable<Organization>(page));
    }

    /**
     * 显示更新页面
     */
    @NotNullPara({"id"})
    public void update() {
        Long id = getParaToLong("id");
        Organization organization = organizationService.findById(id);
        setAttr("organization", organization).render("update.html");
    }

    /**
     * 提交更新数据
     */
    @Before({POST.class, OrganizationValidator.class})
    public void postUpdate() {
        Organization organization = getBean(Organization.class, "organization");
        Organization oid = organizationService.findById(organization.getId());
        if (oid == null) {
            throw new BusinessException("组织不存在");
        }
        if (!organizationService.update(organization)) {
            throw new BusinessException("组织更新失败");
        }
        renderJson(RestResult.buildSuccess());
    }

    /**
     * 停用组织
     */
    @NotNullPara({"id"})
    public void unuse() {
        Long id = getParaToLong("id");
        Organization organization = organizationService.findById(id);
        if (organization == null) {
            throw new BusinessException("组织对象不存在");
        }
        organization.setStatus(DataStatus.UNUSED);
        organization.setRemark("禁用组织");
        organization.setLastAccessTime(new Date());
        if (!organizationService.update(organization)) {
            throw new BusinessException("禁用失败");
        }
        renderJson(RestResult.buildSuccess());
    }

    /**
     * 启用组织
     */
    @NotNullPara({"id"})
    public void use() {
        Long id = getParaToLong("id");
        Organization organization = organizationService.findById(id);
        if (organization == null) {
            throw new BusinessException("组织对象不存在");
        }
        organization.setStatus(DataStatus.USED);
        organization.setRemark("启用组织");
        organization.setLastAccessTime(new Date());
        if (!organizationService.update(organization)) {
            throw new BusinessException("启用失败");
        }
        renderJson(RestResult.buildSuccess());
    }

    /**
     * 查看证书文件
     */
    @NotNullPara({"id"})
    public void certificate() {
        Long id = getParaToLong("id");
        Organization organization = organizationService.findById(id);
        String path = organization.getCertificate();
        setAttr("certificate", path).render("view.html");
    }
}
