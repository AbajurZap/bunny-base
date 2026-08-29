package br.edu.iffar.alegrete.bunnybase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "usuario")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
private Long id;

private String name;
private String email;
private String password;
private Long  rank;
    

public User(){}

public User(Long Id, String name, String email, String password, Long rank){

this.id = Id;
this.name = name;
this.email = email;
this.password = password;
this.rank = rank;


}

public Long getId() {
    return id;
}

public String getName() {
    return name;

}

public String getEmail() {
    return email;

}

public String getPassword() {
    return password;

}


public Long getRank() {
    return rank;   


}










}