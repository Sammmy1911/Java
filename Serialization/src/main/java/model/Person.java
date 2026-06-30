package model;

import javax.print.attribute.standard.PagesPerMinute;

public class Person {
    private String name;
    private int age;
    private int cc;

    public Person (String name, int age, int cc){
        this.name = name;
        this.age = age;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getCc(){
        return age;
    }

    public void setname (String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cc=" + cc +
                '}';
    }


    public int compareTo(Person o){
        //Primer criterio
        

    }
}
