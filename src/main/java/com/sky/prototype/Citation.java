package com.sky.prototype;

import java.io.*;

public class Citation implements Cloneable, Serializable {
    private String name;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Citation() {
    }

    public Citation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                '}';
    }

    public Object deepClone(){
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try{
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return  ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Citation citation = (Citation) super.clone();
        // 对引用类型 进行clone方法处理
//        citation.student = (Student) citation.getStudent().clone();
        return citation;
    }
}
