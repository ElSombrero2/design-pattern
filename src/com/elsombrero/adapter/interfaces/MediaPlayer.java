package com.elsombrero.adapter.interfaces;

import com.elsombrero.adapter.MediaType;

public interface MediaPlayer {
    void play(MediaType type, String file) throws Exception;
}
