package com.example.demo.Repo;

import com.example.demo.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepo extends JpaRepository<Track,Integer> {
}
