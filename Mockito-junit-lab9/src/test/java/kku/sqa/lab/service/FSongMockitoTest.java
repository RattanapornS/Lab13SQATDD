package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MusicService;

class FSongMockitoTest {

	private List<String> songlist;

	@Test
	void FSongMockito_withMockito() {

	MusicService musicservice = mock(MusicService.class);
	List<String> songlist = Arrays.asList("Got The Life, It's My Life, Bad Wolves, beabadoobee, All Time Low"
            ,"Sweet Caroline, 1999, Boom Boom Pow, Jessie’s Girl, The Time"
            ,"Harder Better Faster Stronger, Don't Stop Believin', Shut Up and Dance, The Pretender, Sandstorm");

	when(musicservice.getMusic("Rock")).thenReturn(songlist);
	
	FavoriteSong favoritesong = new FavoriteSong(musicservice);
	List<String> rocksonglist = favoritesong.getMusic("Rock");

	System.out.println("This is Mockito Test\n"+rocksonglist.get(0));
	System.out.println("Rattanaporn Suandokmai 633020559-4\n");
	
	assertEquals(1, rocksonglist.size());

	}
}
