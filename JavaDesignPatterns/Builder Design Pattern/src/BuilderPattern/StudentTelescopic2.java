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
public class StudentTelescopic2 {
    
    String std;
    int id;
    int age;
    String add;

    public StudentTelescopic2(String std, int id, int age, String add) {
        this.std = std;
        this.id = id;
        this.age = age;
        this.add = add;
    }

    public StudentTelescopic2(String std, int id, int age) {
        this(std, id, age, null);
    }

    public StudentTelescopic2(String std, int id) {
        this.std = std;
        this.id = id;
    }

    public StudentTelescopic2(String std) {
        this.std = std;
    }


    @Override
    public String toString() {
        return "StudentTelescopic2{" + "std=" + std + ", id=" + id + ", age=" + age + ", add=" + add + '}';
    }
    
    
    
    
}
