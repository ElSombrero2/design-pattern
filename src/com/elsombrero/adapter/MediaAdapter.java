package com.elsombrero.adapter;

import com.elsombrero.adapter.interfaces.AdvancedPlayer;
import com.elsombrero.adapter.interfaces.MediaPlayer;
import com.elsombrero.adapter.players.AviPlayer;
import com.elsombrero.adapter.players.Mp4Player;

public class MediaAdapter implements MediaPlayer {

    private AdvancedPlayer advancedPlayer;

    public MediaAdapter(MediaType type) throws Exception {
        if(type == MediaType.MP4) advancedPlayer = new Mp4Player();
        else if(type == MediaType.AVI) advancedPlayer = new AviPlayer();
        throw new Exception("Bad Format");
    }

    @Override
    public void play(MediaType type, String file)  {
        if(type == MediaType.MP4) advancedPlayer.playMp4(file);
        else advancedPlayer.playAvi(file);
    }

}
