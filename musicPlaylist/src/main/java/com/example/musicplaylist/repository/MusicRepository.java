package com.example.musicplaylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.musicplaylist.model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

}
