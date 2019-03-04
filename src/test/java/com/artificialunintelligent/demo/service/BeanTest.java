package com.artificialunintelligent.demo.service;

import com.artificialunintelligent.demo.ArtificialUnintelligentApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 12:36 PM 2019/2/13
 */
public class BeanTest extends ArtificialUnintelligentApplicationTests{

    @Test
    public void testBean(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource(""));
//        bf.getBean()
    }
}
