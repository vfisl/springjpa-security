package com.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.AppUser;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Integer>{

	AppUser findByUsername(String username);
}
