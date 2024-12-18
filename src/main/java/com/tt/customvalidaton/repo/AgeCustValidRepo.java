package com.tt.customvalidaton.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tt.customvalidaton.model.User;

@Repository
public interface AgeCustValidRepo extends JpaRepository<User, Integer> {

}
