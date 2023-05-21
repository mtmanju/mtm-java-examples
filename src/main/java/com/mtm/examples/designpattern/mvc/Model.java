package com.mtm.examples.designpattern.mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public List<Movie> getMovieData() {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("The Godfather", "crime|drama", 9));
        movies.add(new Movie("The Hangover", "comedy|drama", 7));
        movies.add(new Movie("The Grudge", "horror|mystery", 5));
        movies.add(new Movie("Step Up 2", "music|romance", 6));
        return movies;

    }
}
