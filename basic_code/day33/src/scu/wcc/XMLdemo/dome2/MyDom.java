package scu.wcc.XMLdemo.dome2;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyDom {
    public static void main(String[] args) throws DocumentException {
        ArrayList<Person> list =new ArrayList<>();

        //获取dom解析器，使用SAX逐行读取，直至获取整个文件
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("basic_code/day33/src/scu/wcc/XMLdemo/dome2/persons.xml"));

/*        //打印读取到的文件
        System.out.println(document);*/

        //一层层的解析Document
        Element rootElement = document.getRootElement();
        //System.out.println(rootElement.getName());
        //获取子标签
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            Attribute id = element.attribute("id");
            String idValue = id.getValue();


            Element name = element.element("name");
            String nameValue = name.getText();


            Element age = element.element("age");
            String ageValue = age.getText();
            int agInt = Integer.parseInt(ageValue);

            Element gender = element.element("gender");
            String genderValue = gender.getText();

            list.add(new Person(idValue,nameValue,agInt,genderValue));

        }

        list.stream().forEach(System.out::println);



    }
}
