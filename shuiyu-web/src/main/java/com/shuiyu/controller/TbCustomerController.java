package com.shuiyu.controller;

import com.shuiyu.domain.Result;
import com.shuiyu.domain.TbCustomer;
import com.shuiyu.service.TbCustomerService;
import com.shuiyu.utils.PhoneFormatCheckUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 客户类的Controller
 */
@RestController
@RequestMapping("/customer")
public class TbCustomerController {

    //注入Service
     @Autowired
    private TbCustomerService tbCustomerService;


    //返回到注册页面的方法
    @RequestMapping("/input")
    public String input() {

        System.out.println("执行跳转的方法。。。。。");
        return "register";//注册的页面
    }

    //保存用户的方法
    @RequestMapping(value = "/saveCustomer" , method = RequestMethod.POST,
    consumes = "application/json")
    public Result saveCustomer(@RequestBody TbCustomer customer ,String smscode) {

        System.out.println("页面传入的客户：" + customer);
        System.out.println("页面传入的验证码 ：" + smscode);

        try {
            //调用保存的方法
            tbCustomerService.saveCustomer(customer);
            return  new Result(true , "注册成功");
        } catch (Exception ex) {
            ex.printStackTrace();
           //return "error";//返回失败的错误页面
            return   new Result(false ,"注册失败");
        }

        // return "success";//返回注册成功的页面---》返回登录页面
    }


     //登录的方法
    @RequestMapping("/login")
    public  String  login(){


        return "";
    }

    //发送短信的方法
    @RequestMapping("/sendMessage")
    public  Result  sendMessage(String phoneName){

        System.out.println("进行短信验证码的发送。。。。。。。" + phoneName);

       //先判断手机号码的格式是否正确
        if(!PhoneFormatCheckUtils.isPhoneLegal(phoneName)){

            System.out.println("您的手机号格式不正确");

            return  new Result(false ,"请您输入正确的手机号");
        }

        //先判断此手机号是否在数据库中存在
        return  null;
    }


}
