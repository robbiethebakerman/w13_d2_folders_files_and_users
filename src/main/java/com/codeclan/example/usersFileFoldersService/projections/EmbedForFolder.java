package com.codeclan.example.usersFileFoldersService.projections;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForFolder", types = Folder.class)
public interface EmbedForFolder {

    String getTitle();
    List<File> getFiles();
    User getUser();
}
