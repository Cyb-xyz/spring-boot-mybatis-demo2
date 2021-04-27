package com.xyz.entity;

import java.io.Serializable;

/**
 * @Auther: 小宇宙
 * @Date: 2021-04-26 15:20
 */
public class Student implements Serializable {

    private int id;
    private String name;//姓名
    private int age;//年龄
    private String sex;//性别
    private String address;
    private int math;
    private int english;
    private String data_date;

    public Student() {
    }

    public Student(String name, int age, String sex, String address, int math, int english, String data_date) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.math = math;
        this.english = english;
        this.data_date = data_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String getData_date() {
        return data_date;
    }

    public void setData_date(String data_date) {
        this.data_date = data_date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", data_date='" + data_date + '\'' +
                '}';
    }
}
