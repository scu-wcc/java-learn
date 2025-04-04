package scu.wcc.unittestdemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTest {

    @Before
    public void beforeMethod(){
        System.out.println("Before");
    }

    @Test
    public void method(){
        Test1 t = new Test1();
        int result = t.add(10, 0);

        System.out.println(result);
        Assert.assertEquals("add方法出错",result,10);

    }

    @After
    public void afterMethod(){
        System.out.println("After");
    }

}
