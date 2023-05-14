package com.mtm.demo.designpattern.mvc;

import java.util.List;

public class View {

    public void display(List<Movie> movies) {
        System.out.println("************************************");
        System.out.println("\t Movies to Watch ");
        System.out.println("************************************");
        System.out.println("| Movie Name | Movie Type | Rating |");
        System.out.println("************************************");
        for (Movie movie : movies) {
            System.out.println(movie.name + "\t" + movie.type + "\t" + movie.rating);
        }
        System.out.println("*************************************");
    }
}
