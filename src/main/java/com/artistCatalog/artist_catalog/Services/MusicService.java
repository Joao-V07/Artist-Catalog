package com.artistCatalog.artist_catalog.Services;
import com.artistCatalog.artist_catalog.Models.Album;
import com.artistCatalog.artist_catalog.Models.Music;
import com.artistCatalog.artist_catalog.Repositories.AlbumRepository;
import com.artistCatalog.artist_catalog.Repositories.MusicRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {
    private final MusicRepository repository;
    private final AlbumRepository albumRepository;

    private MusicService(MusicRepository repository, AlbumRepository albumRepository) {
        this.repository = repository;
        this.albumRepository = albumRepository;
    }

    public List<Music> findByAlbumId(long albumId){
        return repository.findByAlbumId(albumId);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Music music, long albumId) {
        Album album = albumRepository.findById(albumId).orElseThrow(() -> new RuntimeException("Album not found"));
        music.setAlbum(album);
        repository.save(music);
    }

    public void update(Long id, Music musicDetails) {
        Music music = repository.findById(id).orElseThrow(() -> new RuntimeException("Music not found"));

        music.setName(musicDetails.getName());
        music.setReleaseYear(musicDetails.getReleaseYear());
        music.setAlbum(musicDetails.getAlbum());
    }
}
