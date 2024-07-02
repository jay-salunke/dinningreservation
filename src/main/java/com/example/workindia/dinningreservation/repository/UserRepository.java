package com.example.workindia.dinningreservation.repository;

import com.example.workindia.dinningreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<User,Integer>{

    public User findByUsername(String username);

}
