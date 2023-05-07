/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.test1.logic;

/**
 *
 * @author suare
 */
public class Student extends Person{

    private String code;
    private Faculty faculty;

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student:" + super.toString()+", code:"+this.code+", faculty"+this.faculty.toString();
    }
    
        
    
}
