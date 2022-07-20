/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author kawee
 */
public class Student {
    private final String std;
    private final int id;
    private final int age;
    private final String add;

    public Student(Builder builder)
    {
        this.std = builder.std;
        this.id = builder.id;
        this.age = builder.age;
        this.add = builder.add;
    }

    static class Builder{
        
    private String std;
    private int id;
    private int age;
    private String add;
    
    public Student build()
    {
        return new Student(this);
    }

    public Builder(String std)
    {
        this.std = std;
    }
    
    public Builder id(int id)
    {
        this.id = id;
        return this;
    }
    
    public Builder age(int age)
    {
        this.age = age;
        return this;
    }
    
    public Builder add(String add)
    {
        this.add = add;
        return this;
    }
         
    }

    @Override
    public String toString() {
        return "Student{" + "std=" + std + ", id=" + id + ", age=" + age + ", add=" + add + '}';
    }
    
}
