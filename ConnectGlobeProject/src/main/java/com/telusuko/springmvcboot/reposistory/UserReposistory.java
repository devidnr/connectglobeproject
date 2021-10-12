package com.telusuko.springmvcboot.reposistory;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.telusuko.springmvcboot.models.UserModel;

public interface UserReposistory extends JpaRepository<UserModel,Integer>{
	 UserModel findById(int userId);
	 @Query("SELECT u FROM registration u WHERE u.email = :email")
	    public UserModel getUserByUsername(@Param("email") String email);

		/*
		 * @Query("SELECT u FROM registration u WHERE u.userId = :userId") public
		 * UserModel getUserByRole(@Param("roles") int userId);
		 */
	UserModel findByEmail(String email);
}
