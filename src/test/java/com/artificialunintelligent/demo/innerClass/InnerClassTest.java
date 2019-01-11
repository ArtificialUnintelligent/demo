package com.artificialunintelligent.demo.innerClass;

import com.artificialunintelligent.demo.ArtificialUnintelligentApplicationTests;
import com.artificialunintelligent.demo.innerClass.Company.Staff;
import org.junit.Test;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 2:42 PM 2019/1/8
 */
public class InnerClassTest extends ArtificialUnintelligentApplicationTests{

    @Test
    public void membershipInnerClass(){
        Body body = new Body("两只胳膊", "两条腿", "血");
        Body.Heart heart = body.new Heart();
        heart.work();

        Company.Staff staff = new Staff();
        staff.work("张三");
    }

}
