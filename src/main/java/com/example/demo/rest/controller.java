package com.example.demo.rest;

import com.example.demo.Repo.TrackRepo;
import com.example.demo.entity.Track;
import com.example.demo.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    TrackService trackService;

    @PostMapping(path = "/save")
    public ResponseEntity<?> saveTrack(@RequestBody Track track){
        return trackService.save(track);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<?> update(@RequestBody Track track){

        return trackService.updateTrack(track);
    }
}
