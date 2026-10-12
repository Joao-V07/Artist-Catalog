package com.artistCatalog.artist_catalog.Controllers;
import com.artistCatalog.artist_catalog.Models.Album;
import com.artistCatalog.artist_catalog.Models.Music;
import com.artistCatalog.artist_catalog.Services.MusicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums/{albumId}/musics")
public class MusicController {
    private final MusicService service;

    public MusicController(MusicService service) {
        this.service = service;
    }

    @GetMapping
    public List<Music> findByAlbumId(@PathVariable long albumId) {
        return service.findByAlbumId(albumId);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        service.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody Music music, @PathVariable long albumId) {
        service.save(music, albumId);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Music musicDetails) {
        service.update(id, musicDetails);
    }
}
