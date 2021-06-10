package com.nagarro.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springboot.entity.User;

/**
 * @author chahat
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
