package com.shuiyu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户的实体类 , 实现序列化
 */
public class TbCustomer implements Serializable {

    private String id; //用户的id , 自动生成

    private String phoneName;//用户的账号名 ， 是用户的手机号

    private String password;//用户的密码

    private String nickname;//用户的昵称

    private String headPicture;//用户的头像路径

    private String gender;//用户的性别

    private Integer height;//用户的身高

    private Double weight;//用户的体重

    private Date birthday;//用户的出生日期

    private String city;//用户的所在城市

    private String sleepvoicePath; //用户的音频保存路径

    private String qq;//用户的QQ

    private String weibo;//用户的微博

    private String weixin;//用户的微信
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSleepvoicePath() {
        return sleepvoicePath;
    }

    public void setSleepvoicePath(String sleepvoicePath) {
        this.sleepvoicePath = sleepvoicePath == null ? null : sleepvoicePath.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    //重写toString()方法
    @Override
    public String toString() {
        return "TbCustomer{" +
                "id='" + id + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headPicture='" + headPicture + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", sleepvoicePath='" + sleepvoicePath + '\'' +
                ", qq='" + qq + '\'' +
                ", weibo='" + weibo + '\'' +
                ", weixin='" + weixin + '\'' +
                '}';
    }
}