package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
