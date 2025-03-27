package scu.wcc.mythread.exercise.exercise6;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCall implements Callable<Student> {

    Student s = new Student();

    @Override
    public Student call() throws Exception {

        System.out.println(new Random().nextInt(100));

        return s;
    }
}
