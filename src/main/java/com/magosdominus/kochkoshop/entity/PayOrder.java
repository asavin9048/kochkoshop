package com.magosdominus.kochkoshop.entity;

import javax.persistence.*;

@Entity
public class PayOrder {
    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    String orderReference;
    String email;
    String phone;
    String age;
}
