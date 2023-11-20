package com.hong.foundation.genericity;

class InfoNumber<T extends Number>{
    private T var ;        // 定义泛型变量

    public T getVar() {
        return this.var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "info{" +
                "var=" + var +
                '}';
    }
}
public class demo1 {
    public static void main(String[] args) {
        InfoNumber<Integer> i1 = new InfoNumber<Integer>() ;        // 声明Integer的泛型对象
    }
}
