package com.elsombrero.adapter;

import com.elsombrero.adapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(MediaType type, String file) throws Exception {
        if(type == MediaType.MP3) System.out.println("Play MP3: " + file);
        else{
            adapter = new MediaAdapter(type);
            adapter.play(type, file);
        }
    }

}
