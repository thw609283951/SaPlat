package io.jboot.admin.service.entity.model;

import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BaseFileProject;

/**
 * Generated by Jboot.
 */
@Table(tableName = "file_project", primaryKey = "id")
public class FileProject extends BaseFileProject<FileProject> {

    private String createUserName;

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }



}
