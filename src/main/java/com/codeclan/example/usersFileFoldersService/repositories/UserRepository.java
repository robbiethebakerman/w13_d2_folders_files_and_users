package com.codeclan.example.usersFileFoldersService.repositories;

import com.codeclan.example.usersFileFoldersService.models.User;
import com.codeclan.example.usersFileFoldersService.projections.EmbedForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
