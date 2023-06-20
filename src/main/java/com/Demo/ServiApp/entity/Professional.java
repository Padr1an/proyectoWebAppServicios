package com.Demo.ServiApp.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professional extends User {
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    
    private boolean certificate;
    
    private double stars;
    
    @ManyToMany
    private List<Service> services = new ArrayList<>();
    
    @OneToMany
    private List<Task> tasks = new ArrayList<>();
    
}
