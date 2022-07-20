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
public class StudentDemo {
    public static void main(String[] args) {
      
        StudentTelescopic1 st = new StudentTelescopic1("kamal");
        System.out.println(st);
        
        StudentTelescopic2 st2 = new StudentTelescopic2("kamala");
        System.out.println(st2);
        
        
        Student.Builder builder = new Student.Builder("Samal");
        Student s = builder.add("Matara").age(12).build();
        
        System.out.println(s);

    }
    
    
 
}
