/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.test1.controller;

import co.edu.usta.test1.logic.Faculty;
import co.edu.usta.test1.logic.Student;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 *
 * @author suare
 */
public class StudentController {
    
    private Student student;

    public StudentController() {
        this.student = new Student();
    }
    
    public void setStudentID(String id) {
        this.student.setId(Integer.parseInt(id));
    }
    
    public String getID() {
        return String.valueOf(this.student.getId());
    }
    
    public void setStudentName(String name) {
        this.student.setName(name);
    }
    
    public String getStudentName(){
        return this.student.getName();
    }
    
    public void setlastName(String lastName) {
        this.student.setLastName(lastName);
    }
    
    public String getlastName(){
        return this.student.getLastName();
    }
    
    public void setWeight(String weight) {
        this.student.setWeight(Float.parseFloat(weight));
    }
    
    public String getWeight(){
        return String.valueOf(this.student.getWeight());
    }
    
    public void setHeight(String height) {
        this.student.setHeight(Float.parseFloat(height));
    }
    
    public String getHeight(){
        return String.valueOf(this.student.getHeight());
    }
    
    public void setBornDate(String bornDate)throws Exception {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(bornDate);
        this.student.setBornDate(date);
    }
    
    public String getBornDate(){ 
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        return date.format(this.student.getBornDate());
    }   
    
    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("f")) {
            this.student.setGender(true);
        }
        this.student.setGender(false);
    }
    
    public String getGender(){
        if(this.student.getGender()==true) {
            return "Femenino";
        }
        return "Masculino";
    }
    
    public void setCode(String code) {
        this.student.setCode(code);
    }
    
    public String getCode(){
        return this.student.getCode();
    }
    
    public void setFacultyId(String id){
       Faculty myFaculty = new Faculty();
       myFaculty.setId(Integer.parseInt(id));
       myFaculty.setName(this.student.getFaculty().getName());
       this.student.setFaculty(myFaculty);
    }

    public String getFacultyId() {
        return String.valueOf(this.student.getFaculty().getId());
    }    

    public void setFacultyName(String name){
       Faculty myFaculty = new Faculty();
       myFaculty.setName(name);
       myFaculty.setId(this.student.getFaculty().getId());
       this.student.setFaculty(myFaculty);
    }

    public String getFacultyName() {
        return this.student.getFaculty().getName();
    }
    
    @Override
    public String toString() {
        return this.student.toString();
    }
    
    
    
}
