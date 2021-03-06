package io.jboot.admin.service.api;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import io.jboot.admin.service.entity.model.StructPersonLink;

import java.util.List;
import java.util.Map;

public interface StructPersonLinkService {
    /**
     * 查询加入架构的用户列表
     * 根据架构ID查询
     * @param orgStructureId
     * @return
     */
    public Page<Record> findPersonListByStructId(int pageNumber,int pageSize,Long orgStructureId);
    /**
     * 个人群体 - 我加入的架构
     * 根据用户personId查询用户已经加入的架构
     * @param pageNumber
     * @param pageSize
     * @param personID
     * @return
     */
    public Page<Record> findStructListPageByPersonID(int pageNumber, int pageSize, Long personID);
    /**
     * 根据用户ID以及架构ID查询用户是否已经是架构成员
     * 防止用户重复加入架构的情况
     * @return
     */
    public List<StructPersonLink> findByStructIdAndUserID(Long structID, Long userID);
    /**
     * 架构人员列表
     * @param orgStructureId
     * @return
     */
    public Map<String,Object> findByStructIdAndUsername(Long orgStructureId);

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public StructPersonLink findById(Object id);


    /**
     * find all model
     *
     * @return all <StructPersonLink
     */
    public List<StructPersonLink> findAll();

    /**
     * 个人群体 - 我加入的架构
     *根据用户id查询用户加入的架构
     * @param personID
     * @return
     */
    public Map<String,Object> findStructureListByPersonID(Long personID);

    /**
     * find List<model> by orgStructureId
     *
     * @param orgStructureId
     * @return
     */
    public List<StructPersonLink> findByStructId(Long orgStructureId);

    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(StructPersonLink model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(StructPersonLink model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(StructPersonLink model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(StructPersonLink model);


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