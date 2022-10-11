package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MusicService;
import kku.sqa.lab.data.stub.MusicPortal;

class FSongStubTest {

	@Test
	void FSongStub_withStub() {
		MusicService musicservice = new MusicPortal();
		FavoriteSong favoritesong = new FavoriteSong(musicservice);
		
		List<String> songlist = favoritesong.getMusic("Rock");
		
		System.out.println("This is Stub Test\n"+songlist.get(0));
		System.out.println("Rattanaporn Suandokmai 633020559-4\n");
		
		assertEquals(1, songlist.size());
	}

}

