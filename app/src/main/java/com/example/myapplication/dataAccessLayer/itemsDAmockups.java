package com.example.myapplication.dataAccessLayer;

import java.util.ArrayList;
import java.util.List;

public class itemsDAmockups {
    public List<Movie> getAllMovies(){
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("m1","funny"));
        movies.add(new Movie("Iyad","Horror"));
        movies.add(new Movie("m3","funny"));
        movies.add(new Movie("m4","emotional"));

        return movies;





    }
}
