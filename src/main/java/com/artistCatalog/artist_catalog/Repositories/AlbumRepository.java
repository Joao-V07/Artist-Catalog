package com.artistCatalog.artist_catalog.Repositories;

import com.artistCatalog.artist_catalog.Models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
