package com.hong.foundation.genericity;

interface Info<T>{ // 在接口上定义泛型
    public T getVar();// 定义抽象方法，抽象方法的返回值就是泛型类型

}

class InfoImpl<T> implements Info<T>{  // 定义泛型接口的子类
    private T var ;             // 定义属性
    public InfoImpl(T var){     // 通过构造方法设置属性内容
        this.setVar(var) ;
    }
    public void setVar(T var){
        this.var = var ;
    }
    @Override
    public T getVar(){
        return this.var ;
    }


}
public class GenericsDemo24 {
    public static void main(String[] args) {
        Info<String> i = new InfoImpl<String>("汤姆") ;  // 通过子类实例化对象
        System.out.println("内容：" + i.getVar()) ;


    }
}