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
public class StudentTelescopic1 {
    String std;
    int id;
    int age;
    String add;

    public StudentTelescopic1(String std) {
        this.std = std;
    }

    public StudentTelescopic1(String std, int id) {
        this(std);
        this.id = id;
    }

    public StudentTelescopic1(String std, int id, int age) {
        this(std, id);
        this.age = age;
    }

    public StudentTelescopic1(String std, int id, int age, String add) {
        this(std, id, age);
        this.add = add;
    }

    @Override
    public String toString() {
        return "StudentTelescopic1{" + "std=" + std + ", id=" + id + ", age=" + age + ", add=" + add + '}';
    }

   
    
    
    
    
}
