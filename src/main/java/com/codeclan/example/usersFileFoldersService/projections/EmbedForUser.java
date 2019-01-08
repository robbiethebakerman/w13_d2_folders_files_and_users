package com.codeclan.example.usersFileFoldersService.projections;

import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForUser", types = User.class)
public interface EmbedForUser {

    String getName();
    List<Folder> getFolders();
}
