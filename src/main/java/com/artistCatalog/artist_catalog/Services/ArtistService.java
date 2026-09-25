package com.artistCatalog.artist_catalog.Services;
import com.artistCatalog.artist_catalog.Models.Artist;
import com.artistCatalog.artist_catalog.Repositories.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository repository;

    private ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public List<Artist> findAll() {
        return repository.findAll();
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Artist artist){
        repository.save(artist);
    }

    public void update(long id, Artist artistDetails) {
        Artist artist = repository.findById(id).orElseThrow(()-> new RuntimeException("Artist not found"));

        artist.setName(artistDetails.getName());
        artist.setDebutYear(artistDetails.getDebutYear());
        artist.setGenre(artistDetails.getGenre());
    }
}
