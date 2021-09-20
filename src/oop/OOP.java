/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author sherb
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassB student1 = new ClassB(0, "Mahmoud", 25, true);
        student1.setName("Sherbeny");
        student1.getStudentInfo();
        System.out.println(student1.getYearOfBirth());
        System.out.println(student1.calculateExpectedGraduate(student1.getYearOfBirth()));
        
    }
    
}
