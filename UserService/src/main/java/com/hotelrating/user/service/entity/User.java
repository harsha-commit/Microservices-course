package com.hotelrating.user.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel_users") // table name in the database: user
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME", length = 20)
    private String name;
    @Column(name="EMAIL")
    private String email;
}
