package com.artistCatalog.artist_catalog.Services;
import com.artistCatalog.artist_catalog.Models.Album;
import com.artistCatalog.artist_catalog.Repositories.AlbumRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository repository;

    private AlbumService (AlbumRepository repository) {
        this.repository = repository;
    }

    public List<Album> findAll(){
        return repository.findAll();
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Album album) {
        repository.save(album);
    }

    public void update(long id, Album albumDetails) {
        Album album = repository.findById(id).orElseThrow(()-> new RuntimeException("Album not found"));

        album.setName(albumDetails.getName());
        album.setGenre(albumDetails.getGenre());
        album.setReleaseYear(albumDetails.getReleaseYear());
        album.setArtist(albumDetails.getArtist());
        album.setMusics(albumDetails.getMusics());
    }
}
