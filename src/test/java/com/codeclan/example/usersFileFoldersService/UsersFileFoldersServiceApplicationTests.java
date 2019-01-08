package com.codeclan.example.usersFileFoldersService;

import com.codeclan.example.usersFileFoldersService.models.File;
import com.codeclan.example.usersFileFoldersService.models.Folder;
import com.codeclan.example.usersFileFoldersService.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFileFoldersServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUser() {
		User user = new User("Robbie");
		Folder folder = new Folder("Docs", user);
		File file = new File("Tax Returns", "docx", 3.4, folder);

		user.addFolder(folder);
		folder.addFile(file);

		assertEquals(1, user.getFolders().size());
		assertEquals(1, folder.getFiles().size());
	}
}

