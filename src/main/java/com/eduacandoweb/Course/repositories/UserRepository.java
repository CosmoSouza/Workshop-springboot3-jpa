package com.eduacandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
