package com.shuiyu.mapper;

import com.itcast.domain.Customer;
import com.shuiyu.domain.TbCustomer;
import com.shuiyu.domain.TbCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 客户类的Dao层的接口
 */
public interface TbCustomerMapper {

    //保存客户的方法
    int insert(TbCustomer record);

    //保存客户的方法 ：进行属性的null值的判断
    int insertSelective(TbCustomer record);

    //根据手机号查询用户
    Customer  getCustomerByPhoneName(String phoneName);

}