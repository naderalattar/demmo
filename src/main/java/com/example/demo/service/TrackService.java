package com.example.demo.service;

import com.example.demo.Repo.TrackRepo;
import com.example.demo.entity.Track;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.Account;

import java.util.Optional;

@Service

public class TrackService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    TrackRepo trackRepo;

    @Transactional
    public ResponseEntity<?> save(Track track){
        Track savedTrack=trackRepo.save(track);
//        savedTrack.setTotalHoures(20);
//        Track reattachedEtity= entityManager.merge(track);
//        reattachedEtity.setTotalHoures(90);
//        entityManager.detach(track);
//        entityManager.merge(track);
//        track.setTotalHoures(65);

//        track.setTotalHoures(80);
        return new ResponseEntity<>(savedTrack, HttpStatus.CREATED);
    }

    @Transactional
    public ResponseEntity<?> updateTrack(Track track){

        Track oldTrack= trackRepo.findById(track.getId()).get();
        oldTrack.setTotalHoures(track.getTotalHoures());
        oldTrack.setName(track.getName());
        Track savedTrack= trackRepo.save(oldTrack);
        System.out.println("master");

        return new ResponseEntity<>(savedTrack, HttpStatus.CREATED);
    }

    public void addNewAccount(Account account){
        System.out.println("adding account with name : "+account.name +" and age : "+account.getAge());
    }

    public void addNewAccount2(Account account){
        System.out.println("adding account 2 method with name : "+account.name +" and age : "+account.getAge());;
    }


    public void set(){
        System.out.println("inside setter method of track service");
    }
}



