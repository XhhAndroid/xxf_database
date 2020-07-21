package com.xxf.database.demo;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * @Description: java描述
 * @Author: XGod
 * @CreateDate: 2020/7/18 17:37
 */
@Entity
public class TestBean {
    @Id(assignable = true)
    private long _id;
    String name;
    String msg;

    @Override
    public String toString() {
        return "TestBean{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}'+"\n";
    }

    public TestBean() {

    }

    public TestBean(long _id,String name, String msg) {
        this._id = _id;
        this.name=name;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }
}
