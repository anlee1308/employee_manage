package com.example.demo.model;

//public class EmployeeModel {
//}
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeModel implements Serializable {
    /**
     *
     */
@Getter
    private static final long serialVersionUID = 1L;
    private String fullname;
    private int age;
    private int sex;
    private String position;
    private int moneyperhour;
    private int team;
    private String imageURL;
    private Date Created_At;
    private String email;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    public Contact(){
        id=0;
    }
    public Contact(int id,String name, int age, Date dob, String email) {
        this.id =id;
        this.fullname =name;
        this.age =age;
        this.email =email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}