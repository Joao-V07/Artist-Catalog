package com.artistCatalog.artist_catalog.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "artistId")
    private Artist artist;

    private String name;

    private String genre;

    private int releaseYear;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Music> musics = new ArrayList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
