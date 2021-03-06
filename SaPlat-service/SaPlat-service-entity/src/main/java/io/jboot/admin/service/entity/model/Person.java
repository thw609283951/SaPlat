package io.jboot.admin.service.entity.model;

import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BasePerson;

/**
 * Generated by Jboot.
 */
@Table(tableName = "person", primaryKey = "id")
public class Person extends BasePerson<Person> {
    public void setPower(java.lang.String power) {
        set("power", power);
    }

    public java.lang.String getPower() {
        return getStr("power");
    }

}
