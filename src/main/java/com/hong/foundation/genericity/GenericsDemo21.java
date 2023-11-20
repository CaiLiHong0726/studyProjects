package com.hong.foundation.genericity;

class InfoDemo21<T>{
    private T var ;        // 定义泛型变量
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
    public String toString(){    // 直接打印
        return this.var.toString() ;
    }
}


public class GenericsDemo21 {
    public static void main(String[] args) {
        InfoDemo21<String> i1 = new InfoDemo21<String>() ;        // 声明String的泛型对象
        InfoDemo21<Object> i2 = new InfoDemo21<Object>() ;        // 声明Object的泛型对象
        i1.setVar("hello") ;
        i2.setVar(new Object()) ;
        fun(i1) ;
        fun(i2) ;

    }
    public static void fun(InfoDemo21<? super String> temp){    // 只能接收String或Object类型的泛型，String类的父类只有Object类
        System.out.print(temp + ", ") ;
    }

}

