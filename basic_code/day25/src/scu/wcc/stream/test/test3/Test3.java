package scu.wcc.stream.test.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();

        List<Actor> actors = null;

        Collections.addAll(manList,"杨过,18","张三丰,25","林峰,44","白居易,26","杜甫,36","李白,28");
        Collections.addAll(womanList,"李清照,28","杨子,23","章子怡,64","杨冰冰,21","方子,19","杨言,51");

        Stream<String> man = manList.stream()
                .filter(s -> s.split(",")[0].length() ==3)
                .limit(2);
        Stream<String> woman = womanList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        actors = Stream.concat(man, woman)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(actors);


    }
}
