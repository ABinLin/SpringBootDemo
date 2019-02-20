package com.linjb.model.s;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin,Integer>{

	List<UserLogin> findByUsername(String username);
}
