package io.jboot.admin.service.api;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.admin.service.entity.model.PoliticalStatus;

import java.util.List;

public interface PoliticalStatusService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public PoliticalStatus findById(Object id);


    /**
     * find all model
     *
     * @return all <PoliticalStatus
     */
    public List<PoliticalStatus> findAll();

    /**
     * find all model
     * @param model 政治面貌
     * @return all <PoliticalStatus>
     */
    public List<PoliticalStatus> findAll(PoliticalStatus model);

    /**
     * 分页查询 政治面貌 信息
     * @param model 政治面貌
     * @return 页
     */
    public Page<PoliticalStatus> findPage(PoliticalStatus model, int pageNumber, int pageSize);

    /**
     * 根据名称查询 政治面貌 信息
     * @param name
     * @return
     */
    public PoliticalStatus findByName(String name);


    /**
     * 项目阶段 是否存在
     * @param name
     * @return 存在返回-true，否则返回false
     */
    public boolean isExisted(String name);

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
    public boolean delete(PoliticalStatus model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(PoliticalStatus model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(PoliticalStatus model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(PoliticalStatus model);


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