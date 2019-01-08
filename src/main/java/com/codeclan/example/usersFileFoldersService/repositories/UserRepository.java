package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
