package com.dbProject.BarberShop.Clients;

import com.dbProject.BarberShop.Services.Services;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_clients")
public class Clients {
private String name;
private String email;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private long phone;

//private Services services;

    public Clients() {

    }

    public Clients(String name, String email, Long id, long phone) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
