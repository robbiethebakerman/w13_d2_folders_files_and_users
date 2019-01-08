package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.projections.EmbedForFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
