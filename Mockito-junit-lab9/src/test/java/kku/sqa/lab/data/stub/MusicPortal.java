package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MusicService;

public class MusicPortal implements MusicService {

    public List<String> getMusic(String name) {
        
        //First Line is "Rock" playlist
        //Second Line is "Dance" playlist
        //Third Line is "Running" playlist
        
        return Arrays.asList("Got The Life, It's My Life, Bad Wolves, beabadoobee, All Time Low"
                            ,"Sweet Caroline, 1999, Boom Boom Pow, Jessie’s Girl, The Time"
                            ,"Harder Better Faster Stronger, Don't Stop Believin', Shut Up and Dance, The Pretender, Sandstorm");
    }
    
}

