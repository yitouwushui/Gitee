package com.yitouwushui.gitee;

/**
 * Created by ding on 2017/11/24.
 */
public class Student {

    private String age;
    private String name;
    private String phone;

    public Student(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String age;
        private String name;
        private String phone;
        public Builder() {
        }
        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
