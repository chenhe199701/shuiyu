package com.shuiyu.service;


import com.itcast.domain.Customer;
import com.shuiyu.domain.TbCustomer;

/**
 * 客户类的Service层的接口
 */
public interface TbCustomerService {

     //保存用户的方法 ： 参数-----> Customer类
    public void saveCustomer(TbCustomer customer);


    //根据手机号查询用户的方法
    public Customer  getCustomerByPhoneName(String phoneName);

    //发送短信验证码的方法 : 参数---> 手机号
    public void sendMessage(String  phoneName);

}
