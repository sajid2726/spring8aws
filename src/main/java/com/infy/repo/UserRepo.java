package com.infy.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
