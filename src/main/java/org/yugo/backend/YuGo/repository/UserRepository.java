package org.yugo.backend.YuGo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yugo.backend.YuGo.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
