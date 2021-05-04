package com.felipeosilva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeosilva.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
