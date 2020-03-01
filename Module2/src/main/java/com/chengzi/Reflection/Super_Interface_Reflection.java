package com.chengzi.Reflection;

public class Super_Interface_Reflection {

    public static void main(String[] args){

        Class string_class=String.class;
        Class super_class=string_class.getSuperclass();
        Class[] interface_class=string_class.getInterfaces();
        System.out.println(string_class);
        //获取直接父类
        System.out.println(super_class);
        //获取直接实现的接口
        for(Class i:interface_class){
            System.out.println(i);
        }


    }



}
