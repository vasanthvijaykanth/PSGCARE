package com.journal.journal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.journal.journal.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
