package com.Demo.ServiApp.entity;

import com.Demo.ServiApp.enumeration.RoleEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable{
    
    protected static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    @Column(nullable = false)
    protected String name;
    
    @Column(nullable = false)
    protected String lastName;
    
    @Enumerated(value = EnumType.STRING)
    protected RoleEnum role;
    
    @Column(nullable = false)
    protected Long idNumber;
    
    @Column(nullable = false)
    protected String email;
    
    @Column(nullable = false)
    protected String password;
    
    @Column(nullable = false)
    protected String phone;
    
    @Column(nullable = false)
    protected String address;
    
    @Column
    protected String neighboorhood;
    
    @Column(nullable = false)
    protected String city;
    
    //protected List<comment> comment = new arraysList();
    @Column(nullable = false)
    protected String imagenName;
    
    @CreationTimestamp
    protected Date createAt;
    
    @UpdateTimestamp
    protected Date updateAt;
    
    @Column(nullable = false)
    protected Boolean active;
    
    public User(String name, String lastName, String role, Long idNumber, String email, String password,
            String phone, String address, String neighboorhood, String city, String image){
        this.name = name;
        this.lastName = lastName;
        this.role = RoleEnum.valueOf(role);
        this.idNumber = idNumber;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.neighboorhood = neighboorhood;
        this.city = city;
        this.imagenName = image;
        this.active = true;
    }
    
    public void updateUserData(String email, String password, String phone, String address, 
            String neighboorhood, String city, String image) {
        if (email != null || !email.isEmpty()) {
            this.email = email;
        }
        if (password != null || !email.isEmpty()) {
            this.password = password;
        }
        if (phone != null || !email.isEmpty()) {
            this.phone = phone;
        }
        if (address != null || !email.isEmpty()) {
            this.address = address;
        }
        if (neighboorhood != null || !email.isEmpty()) {
            this.neighboorhood = neighboorhood;
        }
        if (city != null || !email.isEmpty()) {
            this.city = city;
        }
        if (image != null || !email.isEmpty()) {
            this.imagenName = image;
        }
    }
    
    public void deactivateUser(){
        this.active = false;
    }
    
    public void activateUser(){
        this.active = true;
    }
    
}
