package com.Demo.ServiApp.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
    
}
