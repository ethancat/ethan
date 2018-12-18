package com.ethanwy.ethan.common.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体抽象类
 * @author Ethan
 * @date 2018/12/18
 */
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1667904076318224175L;

    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
