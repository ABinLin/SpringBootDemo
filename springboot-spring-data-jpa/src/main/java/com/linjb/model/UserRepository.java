package com.linjb.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);

    List<User> findByUsernameAndAge(String username, Integer age);

    @Query("from User u where u.username=:username")
    List<User> findUserByName(@Param("username") String username);
    
    @Query("from User u where u.username like :username")
    List<User> findByUsernameLike(@Param("username") String username);

}
