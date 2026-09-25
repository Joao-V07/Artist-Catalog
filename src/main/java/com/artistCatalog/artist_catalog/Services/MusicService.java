package com.artistCatalog.artist_catalog.Services;
import com.artistCatalog.artist_catalog.Models.Music;
import com.artistCatalog.artist_catalog.Repositories.MusicRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {
    private final MusicRepository repository;

    private MusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public List<Music> findAll(){
        return repository.findAll();
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Music music) {
        repository.save(music);
    }

    public void update(Long id, Music musicDetails) {
        Music music = repository.findById(id).orElseThrow(() -> new RuntimeException("Music not found"));

        music.setName(musicDetails.getName());
        music.setReleaseYear(musicDetails.getReleaseYear());
    }
}
