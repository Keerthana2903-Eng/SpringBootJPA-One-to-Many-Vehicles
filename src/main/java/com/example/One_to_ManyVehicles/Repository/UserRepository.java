package com.example.One_to_ManyVehicles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_ManyVehicles.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
