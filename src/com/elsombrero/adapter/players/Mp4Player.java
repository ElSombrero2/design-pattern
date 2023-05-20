package com.elsombrero.adapter.players;

import com.elsombrero.adapter.interfaces.AdvancedPlayer;

public class Mp4Player implements AdvancedPlayer {

    @Override
    public void playAvi(String file) {}

    @Override
    public void playMp4(String file) {
        System.out.println("Playing Mp4 : " + file);
    }

}
