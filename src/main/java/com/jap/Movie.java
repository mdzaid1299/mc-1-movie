package com.jap;

public class Movie {
    private final int movieId;
    private final String movieName;
    private final String genre;
    private final String releaseDate;

    // create getter and setter for all the above attributes


    //complete the parameterized constructor
    public Movie(int movieId, String movieName, String genre, String releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
