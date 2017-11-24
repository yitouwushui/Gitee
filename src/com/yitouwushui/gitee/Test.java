package com.yitouwushui.gitee;

/**
 * Created by ding on 2017/11/24.
 */
public class Test {

    public static void main(String args[]){
        Student.Builder builder = new Student.Builder()
                .setAge("1")
                .setName("2")
                .setPhone("3");
        Student student = builder.build();
        System.out.print(student.toString());
    }
}
