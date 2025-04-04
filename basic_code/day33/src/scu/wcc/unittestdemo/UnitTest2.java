package scu.wcc.unittestdemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class UnitTest2 {
    @Before
    public void beforeMethod() throws IOException {
        File src = new File("myTest.txt");
        src.createNewFile();

    }

    @Test
    public void method(){


    }

    @After
    public void afterMethod(){
        System.out.println("After");
    }
}
