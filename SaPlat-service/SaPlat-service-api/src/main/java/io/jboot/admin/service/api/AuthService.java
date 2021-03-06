package io.jboot.admin.service.api;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.admin.service.entity.model.Auth;
import io.jboot.admin.service.entity.model.User;

import java.util.List;

public interface AuthService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public Auth findById(Object id);


    /**
     * find all model
     *
     * @return all <Auth
     */
    public List<Auth> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);

    /**
     * 根据用户查询认证信息
     * @param user 用户
     * @return 认证信息
     */
    public Auth findByUser(User user);

    /**
     * 根据用户和权限查询认证
     * @param user 用户
     * @param role 权限
     * @return 认证信息
     */
    public Auth findByUserAndRole(User user,long role);

    /**
     * 通过用户和类型查找权限
     * @param user 用户
     * @param typeStatus 类型
     * @return 结果
     */
    public List<Auth> findByUserAndType(User user, String typeStatus);


    /**
     * 根据用户id和认证状态查询认证信息以获得认证角色
     *
     * @param userId 用户id
     * @param status
     * @return 认证信息
     */
    public Auth findByUserIdAndStatus(Long userId, String status);

    /**
     * 根据用户id和认证状态以及认证类型查询认证信息以列表形式存储
     *
     * @param userId 用户id
     * @param status
     * @param type
     * @return 认证信息
     */
    public List<Auth> findListByUserIdAndStatusAndType(Long userId, String status, String type);

    /**
     * 根据用户id和认证状态以及认证类型查询认证信息
     *
     * @param userId 用户id
     * @param status
     * @param type
     * @return 认证信息
     */
    public Auth findByUserIdAndStatusAndType(Long userId, String status, String type);

    /**
     * 根据用户id和认证状态查询认证信息以列表形式存储
     *
     * @param userId 用户id
     * @param status
     * @return 认证信息
     */
    public List<Auth> findByUserIdAndStatusToList(Long userId, String status);

    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(Auth model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(Auth model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(Auth model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(Auth model);


    /**
     * 分页查询角色审核信息
     * @param auth pageNumber pageSize 审核
     * @return 页
     */
    public Page<Auth> findPage(Auth auth, int pageNumber, int pageSize);


    public void join(Page<? extends Model> page, String joinOnField);
    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);
    public void join(Page<? extends Model> page, String joinOnField, String joinName);
    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField);
    public void join(List<? extends Model> models, String joinOnField, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField, String joinName);
    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);
    public void join(Model model, String joinOnField);
    public void join(Model model, String joinOnField, String[] attrs);
    public void join(Model model, String joinOnField, String joinName);
    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);
    public void keep(List<? extends Model> models, String... attrs);
}