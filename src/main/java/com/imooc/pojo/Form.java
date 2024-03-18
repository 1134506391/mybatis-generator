package com.imooc.pojo;

import javax.persistence.*;

public class Form {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 表单内容
     */
    private String content;

    /**
     * 表单名字
     */
    private byte[] name;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取表单内容
     *
     * @return content - 表单内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置表单内容
     *
     * @param content 表单内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取表单名字
     *
     * @return name - 表单名字
     */
    public byte[] getName() {
        return name;
    }

    /**
     * 设置表单名字
     *
     * @param name 表单名字
     */
    public void setName(byte[] name) {
        this.name = name;
    }
}