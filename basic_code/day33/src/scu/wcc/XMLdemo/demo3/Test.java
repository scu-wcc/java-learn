package scu.wcc.XMLdemo.demo3;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws DocumentException {
        ArrayList<User> list =new ArrayList<>();

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("basic_code/day33/src/scu/wcc/XMLdemo/demo3/users.xml"));

        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        for (Element element : elements) {
            Attribute id = element.attribute("id");
            String idText = id.getText();

            Element name = element.element("name");
            String nameText = name.getText();

            Element password = element.element("password");
            String passwordText = password.getText();

            Element userid = element.element("userid");
            String useridText = userid.getText();

            Element phone = element.element("phone");
            String phoneText = phone.getText();

            Element flag = element.element("flag");
            String flagText = flag.getText();

            //System.out.println(idText+", "+nameText+", "+passwordText+", "+useridText+", "+passwordText+", "+flagText);
            list.add(new User(idText,nameText,passwordText,useridText,phoneText,"true".equals(flagText)));
        }
        System.out.println(list);

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        int index;

        if((index = getIndex(list,name))>=0){
            User user = list.get(index);
            if(user.getPassword().equals(password)){
                System.out.println("登陆成功");
            }else{
                System.out.println("密码错误");
            }
        }else{
            System.out.println("当前用户不存在");
        }


    }

    public static int getIndex(ArrayList<User> list,String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
