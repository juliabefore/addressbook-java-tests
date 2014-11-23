package com.example.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Random;

import org.testng.annotations.Test;

import com.example.fw.Folders;

public class TestFolderRemoval extends TestBase{
	@Test
	public void testFolderRemoval(){  
		Folders oldFolders = app.getFolderHelper().getFolders();
		
		int index = 1;
		
		app.getFolderHelper().deleteFolder(index);
		Folders newFolders = app.getFolderHelper().getFolders();
	//	assertThat(newFolders, equalTo(oldFolders.without(index)));
	}
}
