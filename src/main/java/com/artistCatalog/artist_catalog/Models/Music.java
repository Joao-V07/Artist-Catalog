package com.artistCatalog.artist_catalog.Models;


import jakarta.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "albumId")
    private Album album;

    private String name;

    private int releaseYear;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
