package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.projections.EmbedForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
