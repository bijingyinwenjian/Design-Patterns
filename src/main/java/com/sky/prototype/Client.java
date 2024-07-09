package com.sky.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("三好学生");
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        Citation clone = (Citation) citation.deepClone();
        clone.setName("五好学生");
        Student student1 = clone.getStudent();
        student1.setName("李四");
        citation.show();
        clone.show();
        System.out.println(student == student1);
        System.out.println(citation.getStudent());
        System.out.println(clone.getStudent());
    }
}
