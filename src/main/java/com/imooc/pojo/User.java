package com.imooc.pojo;

import javax.persistence.*;

public class User {
    /**
     * 用户编号
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String addr;

    /**
     * 身份证号
     */
    private String card;

    /**
     * 0代表未结婚，1代表已结婚
     */
    private Boolean married;

    /**
     * 薪水
     */
    private Float salary;

    /**
     * 获取用户编号
     *
     * @return id - 用户编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户编号
     *
     * @param id 用户编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取地址
     *
     * @return addr - 地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置地址
     *
     * @param addr 地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取身份证号
     *
     * @return card - 身份证号
     */
    public String getCard() {
        return card;
    }

    /**
     * 设置身份证号
     *
     * @param card 身份证号
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * 获取0代表未结婚，1代表已结婚
     *
     * @return married - 0代表未结婚，1代表已结婚
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * 设置0代表未结婚，1代表已结婚
     *
     * @param married 0代表未结婚，1代表已结婚
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * 获取薪水
     *
     * @return salary - 薪水
     */
    public Float getSalary() {
        return salary;
    }

    /**
     * 设置薪水
     *
     * @param salary 薪水
     */
    public void setSalary(Float salary) {
        this.salary = salary;
    }
}