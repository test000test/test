//package com.example.registrationform.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.util.Set;
//
//@Entity
//@Table(name = "users_roles")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Role implements GrantedAuthority {
//    @Id
//    private Long id;
//    private String name;
//    @Transient
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;
//
//    @Override
//    public String getAuthority() {
//        return getName();
//    }
//}
