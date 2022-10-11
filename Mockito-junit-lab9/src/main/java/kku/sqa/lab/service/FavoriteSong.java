package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.MusicService;

public class FavoriteSong {
	
private MusicService musicservice;
    
    public FavoriteSong(MusicService musicservice) {
        super();
        this.musicservice = musicservice;
    }
    
    //get only music that include in rock genre
    public List<String> getMusic(String name){
        List<String> sendlist = new ArrayList<String>();
        List<String> alllist = musicservice.getMusic(name);
        
        for (String song:alllist) {
                if(name =="Rock") {
                    if(song.contains("Got The Life")) {
                        sendlist.add(song);
                    }    
                }
                else if(name == "Dance") {
                    if(song.contains("Boom Boom Pow")) {
                        sendlist.add(song);
                    }
                }else if(name=="Running") {
                    if(song.contains("Don't Stop Believin")) {
                        sendlist.add(song);
                    }
                }
                
            }
        
        return sendlist;
    }
    
}
