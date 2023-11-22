package com.hong.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.stream.Collectors;

class User implements Comparable<User>{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
public class SetTest {
    public static void main(String[] args) {
        TreeMap<User,String> treeMap = new TreeMap<>();
        //需要實現Comparable,String Integer 本身就已實現  會自動排序
        User u1 = new User();
        treeMap.put(u1,"1");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("3");
        hashSet.add("2");

        System.out.println(treeMap);

        System.out.println(hashSet);
    }
}
