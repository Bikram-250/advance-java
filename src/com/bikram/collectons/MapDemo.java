/*package com.bikram.collectons;

import java.util.*;

public class MapDemo {
    //Map is a collection in <key, value>pair
    //key is a unique element

    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"One");
        m1.put(4,"Four");
        m1.put(3,"Three");
        m1.put(2,"Two");
        m1.put(2,"TWO");
        System.out.println(m1);

        LinkedHashMap<Integer,String> prize= new LinkedHashMap<>();
        prize.put(3,"Bronge");
        prize.put(2,"Silver");
        prize.put(1,"First");

        System.out.println("Element with key 1"+prize.get(1));
        System.out.println("Element with key 2"+prize.get(3));

        TreeMap<String, String> m3 = new TreeMap<>();
        m3.put("NP", "Nepal");
        m3.put("AUS","Australia");
        m3.put("JPN","Japan");
        //using enanched for loop

        for(Map.Entry<String ,String> entry :m3.entrySet()){
            System.out.println("Key:"+entry.getKey()+",value : "+ entry.getValue());
        }
        Map<Integer,Map<String ,String >> country_list= new HashMap<>();
        country_list.put(1,m3);

        Map<Integer ,Employee> emp_map =new HashMap<>();
        emp_map.put(12345,new Employee());
        emp_map.put(36125,new Employee());

        emp_map.get(12345).name ="Gopal";
        emp_map.get(36125).name="Nirmal";
        for(Map.Entry<Integer,Employee> entry:emp_map.entrySet(){
            System.out.println(entry.getValue().name);
        }

    }
}*/
