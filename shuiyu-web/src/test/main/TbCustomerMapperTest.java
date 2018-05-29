import com.shuiyu.domain.TbCustomer;
import com.shuiyu.mapper.TbCustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 客户类Dao接口的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TbCustomerMapperTest {

      //注入Dao
    @Resource
    private TbCustomerMapper tbCustomerMapper;


    //测试保存客户的方法
    @Test
    public  void testSaveCustomer(){

        //创建客户
        TbCustomer customer = new TbCustomer();
        customer.setId("112323223211");
        customer.setPassword("1234");
        customer.setBirthday(new Date());
        customer.setCity("杭州");
        customer.setGender("男");
        customer.setHeight(167);
        customer.setPhoneName("128384343421");
        customer.setNickname("大梦千古");
        customer.setQq("1363451332");
        customer.setWeibo("zhanShen_weibo_Z");
        customer.setWeixin("zhanShen_weixin_Z");
        customer.setWeight(40.0);

        System.out.println("测试中注入Dao:" + tbCustomerMapper);

        //调用方法 ，进行保存
        tbCustomerMapper.insertSelective(customer);
    }

}
