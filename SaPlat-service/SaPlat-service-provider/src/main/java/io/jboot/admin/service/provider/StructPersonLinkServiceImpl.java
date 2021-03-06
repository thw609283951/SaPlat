package io.jboot.admin.service.provider;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import io.jboot.admin.service.api.StructPersonLinkService;
import io.jboot.admin.service.entity.model.StructPersonLink;
import io.jboot.aop.annotation.Bean;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.db.model.Columns;
import io.jboot.service.JbootServiceBase;
import org.apache.jute.compiler.generated.Rcc;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Bean
@Singleton
@JbootrpcService
public class StructPersonLinkServiceImpl extends JbootServiceBase<StructPersonLink> implements StructPersonLinkService {

    @Override
    public List<StructPersonLink> findByStructId(Long orgStructureId) {
        return DAO.findListByColumn("structID", orgStructureId);
    }

    /**
     * 架构人员列表
     *
     * @param orgStructureId
     * @return
     */
    @Override
    public Map<String, Object> findByStructIdAndUsername(Long orgStructureId) {
        List<Record> list = Db.find("SELECT person.ID,person.personID,user.name,person.structID,person.createUserID,person.createTime,person.isEnable FROM `struct_person_link` as person,`sys_user` as user where person.personID = user.userID and person.structID = ?", orgStructureId);
        Map<String, Object> map = new ConcurrentHashMap<String, Object>();
        map.put("code", "0");
        map.put("msg", "");
        map.put("count", list.size());
        map.put("data", list);
        return map;
    }

    @Override
    public Map<String, Object> findStructureListByPersonID(Long personID) {
        List<Record> list = Db.find("select person.*,struct.name from `struct_person_link` person, `org_structure` struct where person.structID = struct.id and person.personID = ?", personID);
        //构造layui表格数据格式
        Map<String, Object> map = new ConcurrentHashMap<String, Object>();
        map.put("code", "0");
        map.put("msg", "");
        map.put("count", list.size());
        map.put("data", list);
        return map;
    }

    @Override
    public List<StructPersonLink> findByStructIdAndUserID(Long structID, Long userID) {
        Columns columns = Columns.create();
        columns.eq("structID", structID);
        columns.eq("personID", userID);
        return DAO.findListByColumns(columns.getList());
    }

    /**
     * 个人群体 - 我加入的架构列表
     * @param pageNumber
     * @param pageSize
     * @param personID
     * @return
     */
    @Override
    public Page<Record> findStructListPageByPersonID(int pageNumber, int pageSize, Long personID) {
        SqlPara sqlPara = Db.getSqlPara("app-OrgStruct.myStructure");
        //添加参数
        sqlPara.addPara(personID);
        Page<Record> page = Db.paginate(pageNumber,pageSize,sqlPara);
        return page;
    }

    /**
     * 组织管理  -  架构人员列表
     * @param pageNumber
     * @param pageSize
     * @param orgStructureId
     * @return
     */
    @Override
    public Page<Record> findPersonListByStructId(int pageNumber,int pageSize, Long orgStructureId){
        SqlPara sqlPara = Db.getSqlPara("app-OrgStruct.StructurePersonList");
        //添加参数
        sqlPara.addPara(orgStructureId);
        Page<Record> page = Db.paginate(pageNumber,pageSize,sqlPara);
        return page;
    }
}


