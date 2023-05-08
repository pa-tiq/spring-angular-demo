package com.dantas.backend.repository;

import org.springframework.stereotype.Repository;

import com.dantas.backend.models.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
