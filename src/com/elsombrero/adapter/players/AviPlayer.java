package com.elsombrero.adapter.players;

import com.elsombrero.adapter.interfaces.AdvancedPlayer;

public class AviPlayer implements AdvancedPlayer {

    @Override
    public void playAvi(String file) {
        System.out.println("Playing AVI: " + file);
    }

    @Override
    public void playMp4(String file) {}

}
