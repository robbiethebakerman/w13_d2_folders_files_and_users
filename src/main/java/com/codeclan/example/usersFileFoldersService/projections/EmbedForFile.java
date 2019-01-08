package com.codeclan.example.usersFileFoldersService.projections;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForFile", types = File.class)
public interface EmbedForFile {

    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
