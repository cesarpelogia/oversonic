package com.oversonic.client.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.oversonic.client.domain.MusicDTO;
import com.oversonic.client.repository.MusicRepository;

public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public void createMusic(MusicDTO newMusic) {
        musicRepository.save(newMusic);
    }
}
