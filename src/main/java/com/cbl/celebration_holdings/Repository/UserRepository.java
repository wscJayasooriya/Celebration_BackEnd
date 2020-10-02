package com.cbl.celebration_holdings.Repository;

import com.cbl.celebration_holdings.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
