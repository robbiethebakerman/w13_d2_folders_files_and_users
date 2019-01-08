package com.codeclan.example.usersFileFoldersService;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.models.User;
import com.codeclan.example.usersFileFoldersService.repositories.FileRepository;
import com.codeclan.example.usersFileFoldersService.repositories.FolderRepository;
import com.codeclan.example.usersFileFoldersService.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFileFoldersServiceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUser() {
		User user = new User("Robbie");
		userRepository.save(user);
		Folder folder = new Folder("Docs", user);
		folderRepository.save(folder);
		File file = new File("Tax Returns", "docx", 3.4, folder);
		fileRepository.save(file);

		user.addFolder(folder);
		userRepository.save(user);
		folder.addFile(file);
		folderRepository.save(folder);

		assertEquals(1, user.getFolders().size());
		assertEquals(1, folder.getFiles().size());
	}
}

