package demo01.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合中的元素进行过滤，只要以“张”开头的元素，储存到一个新的集合中
        List<String> listA = new ArrayList<String>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }

        //对listA集合进行过滤，只要姓名长度为3的人，存储到新的集合中
        List<String> listB = new ArrayList<String>();
        for (String s : listA) {
            if(s.length()==3){
                listB.add(s);
            }
        }

        //遍历list B集合
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
