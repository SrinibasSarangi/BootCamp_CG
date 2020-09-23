package com.cg.iter.FlightManagementSystem.repository;

import com.cg.iter.FlightManagementSystem.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);


}
