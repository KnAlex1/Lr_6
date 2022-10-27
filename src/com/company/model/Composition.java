package com.company.model;

public class Composition {
    private String title;
    private String genre;
    private String author;
    private int songDurationInSecond;



    public Composition(String title, String genre, String author, int songDurationInSecond) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.songDurationInSecond = songDurationInSecond;
    }

    public Composition() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSongDurationInSecond() {
        return songDurationInSecond;
    }

    public void setSongDurationInSecond(int songDurationInSecond) {
        this.songDurationInSecond = songDurationInSecond;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", songDurationInSecond=" + songDurationInSecond +
                '}';
    }
}
