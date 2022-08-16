package com.mabrur.security.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor
public class Role {
     
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
 
}
