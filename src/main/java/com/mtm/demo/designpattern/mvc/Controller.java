package com.mtm.demo.designpattern.mvc;

import java.util.List;

public class Controller {

    public void displayMovies() {
        Model model = new Model();
        View view = new View();

        List<Movie> movies = model.getMovieData();
        view.display(movies);
    }
}
