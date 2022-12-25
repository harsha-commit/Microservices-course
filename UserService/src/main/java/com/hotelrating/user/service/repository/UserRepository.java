package com.hotelrating.user.service.repository;


import com.hotelrating.user.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Entity, ID
public interface UserRepository extends JpaRepository<User, String> {
}
