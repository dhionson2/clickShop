package com.clickshop.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clickshop.shop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
