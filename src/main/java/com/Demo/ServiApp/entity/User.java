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
}
