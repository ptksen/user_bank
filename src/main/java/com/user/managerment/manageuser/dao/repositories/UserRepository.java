package com.user.managerment.manageuser.dao.repositories;

import com.user.managerment.manageuser.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
