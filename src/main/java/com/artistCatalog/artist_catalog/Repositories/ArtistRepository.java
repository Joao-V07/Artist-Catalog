package com.artistCatalog.artist_catalog.Repositories;

import com.artistCatalog.artist_catalog.Models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
