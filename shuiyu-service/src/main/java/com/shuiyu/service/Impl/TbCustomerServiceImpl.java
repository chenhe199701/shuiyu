package com.shuiyu.service.Impl;


import com.itcast.domain.Customer;
import com.shuiyu.domain.Result;
import com.shuiyu.domain.TbCustomer;
import com.shuiyu.mapper.TbCustomerMapper;
import com.shuiyu.service.TbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 *客户类的Service层的实现类
 */
@Service
@Transactional
public class TbCustomerServiceImpl implements TbCustomerService {

    //注入Dao层
    @Resource
    private TbCustomerMapper tbCustomerMapper;

    //保存客户的方法
    @Override
    public void saveCustomer(TbCustomer customer) {
        //调用方法
        tbCustomerMapper.insertSelective(customer);

    }


    //根据手机号查询用户
    @Override
    public Customer getCustomerByPhoneName(String phoneName) {
        //调用方法
        return tbCustomerMapper.getCustomerByPhoneName(phoneName);
    }



    //发送注册验证码的方法 ：
    @Override
    public void sendMessage(String phoneName) {


    }

}
