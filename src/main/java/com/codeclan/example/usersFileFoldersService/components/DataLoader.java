package com.codeclan.example.usersFileFoldersService.components;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.models.User;
import com.codeclan.example.usersFileFoldersService.repositories.FileRepository;
import com.codeclan.example.usersFileFoldersService.repositories.FolderRepository;
import com.codeclan.example.usersFileFoldersService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user = new User("Donald_Trump");
        userRepository.save(user);
        Folder docs = new Folder("Docs", user);
        folderRepository.save(docs);
        Folder pics = new Folder("Pictures", user);
        folderRepository.save(pics);
        File taxReturns = new File("Tax Returns", "docx", 3.4, docs);
        fileRepository.save(taxReturns);
        File ivankaPic = new File("Picture of Ivanka on knee", "jpeg", 300, pics);
        fileRepository.save(ivankaPic);
    }
}
