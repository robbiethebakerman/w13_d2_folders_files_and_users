package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
