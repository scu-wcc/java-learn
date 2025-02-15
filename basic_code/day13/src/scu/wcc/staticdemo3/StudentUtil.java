package scu.wcc.staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxStudentAge(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();

        int len = list.size();
        for (int i = 1; i < len; i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge > maxAge){
                maxAge = tempAge;
            }
        }
        return maxAge;
    }
}
