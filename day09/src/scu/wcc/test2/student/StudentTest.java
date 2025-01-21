package scu.wcc.test2.student;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stuArr = new Student[3];
        Student stu1 = new Student(1,"张三",18);
        Student stu2 = new Student(2,"李四",19);
        Student stu3 = new Student(3,"王五",20);

        stuArr[0] = stu1;
        stuArr[1] = stu2;
        stuArr[2] = stu3;

        Student stu4 = new Student(4,"老六",30);

        if(contains(stuArr,stu4.getId())){
            System.out.println("当前id已存在，请勿重复录入。");
        }else{
            int count=getCount(stuArr);

            if(count == stuArr.length){
                stuArr = createArr(stuArr);
                stuArr[count] = stu4;
                printArr(stuArr);
            }else{
                addStudent(stuArr,stu4);
                printArr(stuArr);
            }
        }
        if(deleteStudent(stuArr,3) == -1){
            System.out.println("当前id不存在，请重新输入。");
        }else{
            System.out.println("删除成功！");
            printArr(stuArr);
        }

        if(updateStudent(stuArr,4) == -1){
            System.out.println("当前id不存在，请重新输入。");
        }else{
            System.out.println("更新成功！");
            printArr(stuArr);
        }

    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!= null){
                if(arr[i].getId()==id){
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }

    public static Student[] createArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr){

        for (Student stu : arr) {
            if(stu!=null) {
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }

    public static void addStudent(Student[] arr, Student stu){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                arr[i] = stu;
                return;
            }
        }
    }

    public static int deleteStudent(Student[] arr, int id ){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    arr[i] =null;
                    return i;
                }
            }

        }
        return -1;
    }

    public static int updateStudent(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    arr[i].setAge(arr[i].getAge()+1);
                    return i;
                }
            }

        }
        return -1;
    }
}
