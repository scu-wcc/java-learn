package scu.wcc.homework.homework4;
/*
    学生信息系统：
        增加、删除、更新学生信息。
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stuArr = new  Student[3];
        stuArr[0]=new Student(1,"张三",18);
        stuArr[1]=new Student(2,"李四",31);
        stuArr[2]=new Student(3,"王五",28);

        Student stu4 = new Student(4,"王麻子",24);


        if(contain(stuArr,stu4.getID())){
            System.out.println("当前id已存在，请勿重复输入！！！");
        }else{
            stuArr = addStudent(stuArr,stu4);
            printArrInfo(stuArr);
        }

        int deleteID=3;
        if(!contain(stuArr,deleteID)){
            System.out.println("当前id不存在，无法删除");
        }else{
            deleStudent(stuArr,deleteID);
            printArrInfo(stuArr);
        }

        int updateID = 5;
        if(!contain(stuArr,updateID)){
            System.out.println("当前id不存在，无法更改");
        }else{
            updateStudent(stuArr,updateID);
            printArrInfo(stuArr);
        }

    }

    public static boolean contain(Student[] stuArr, int id){
        int len = stuArr.length;
        for (int i =0;i<len; i++){
            if(stuArr[i]!=null) {
                if (stuArr[i].getID() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Student[] addStudent(Student[] stuArr, Student stu){
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i] == null){
                stuArr[i] = stu;
                return stuArr;
            }
        }
        Student[] newArr = new   Student[stuArr.length+1];
        for (int i = 0; i < stuArr.length; i++) {
            newArr[i] = stuArr[i];
        }
        newArr[stuArr.length] = stu;
        return newArr;
    }

    public static int deleStudent(Student[] stuArr, int id){
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i]!=null) {
                if (stuArr[i].getID() == id) {
                    stuArr[i] = null;
                    return i;
                }
            }
        }
        return -1;
    }

    public static void updateStudent(Student[] stuArr, int id){
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i]!=null){
                if(stuArr[i].getID() == id){
                    int age = stuArr[i].getAge();
                    stuArr[i].setAge(age+1);
                }
            }
        }
    }

    public static void printArrInfo(Student[] stuArr){
        for (int i = 0; i < stuArr.length; i++) {
            if(stuArr[i]!=null){
            System.out.println("学号："+stuArr[i].getID()+", 姓名："+stuArr[i].getName()+", 年龄："+stuArr[i].getAge());
            }
        }
        System.out.println("-----------------------------------------------------------");
    }
}
