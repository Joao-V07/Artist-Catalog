package com.artistCatalog.artist_catalog.Repositories;

import com.artistCatalog.artist_catalog.Models.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
