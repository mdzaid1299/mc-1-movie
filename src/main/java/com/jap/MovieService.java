package com.jap;

import java.util.*;

public class MovieService {

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map<Movie, Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map, 4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating(map);
        System.out.println("--------------");
        System.out.println("Highest Rating " + list);
    }

    public Map<Movie, Integer> getMovieWithRating() {

        //create five movie object by calling Movie class parameterized constructor
        Movie m1 = new Movie(111, "the Shawshank Redemption", "suspence ", "1994");
        Movie m2 = new Movie(222, " The Godfather", "Gangstar", "1974");
        Movie m3 = new Movie(333, "12 Angry Man", "Comedy", "1957");
        Movie m4 = new Movie(444, "LOTR", "Fantasy", "2003");
        Movie m5 = new Movie(555, "Parasite", "Suspence", "2019");

        //create HashMap object and add all the Movie object inside it
        Map<Movie, Integer> movieMap = new HashMap<>();
        movieMap.put(m1, 5);
        movieMap.put(m2, 5);
        movieMap.put(m3, 2);
        movieMap.put(m4, 4);
        movieMap.put(m5, 4);


        //Key will be movie object and value will be rating ranging from 1 to 5

        //return the HashMap object


        return movieMap;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie, Integer> map, int rating) {
        //Create a TreeSet object
        Set<String> stringSet = new TreeSet<>();
        for (Map.Entry<Movie, Integer> pam : map.entrySet()) {
            if (pam.getValue() == rating) {
                stringSet.add(pam.getKey().getMovieName());
            }
        }
        //Use entrySet() method to iterate through the map object

        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

        return stringSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie, Integer> map) {
        //Create a ArrayList object of type String
        List<String> list = new ArrayList<>();
        for (Map.Entry<Movie, Integer> pam : map.entrySet()) {
            if (pam.getValue() == 5) {
                list.add(pam.getKey().getMovieName());
            }
        }

        //get the first value from the map and store it in the variable max

        // Use entrySet().iterator().next() method to retrieve the first value of Map object


        //get the name of the movie with the highest rating and add it in the List created

        //return the List object


        return list;
    }

    public Map<String, String> getAllMoviesWithComedy(Map<Movie, Integer> map) {
        //Create a Map object
        Map<String, String> stringMap = new HashMap<>();
        for (Map.Entry<Movie, Integer> mp : map.entrySet()) {
            if (mp.getKey().getGenre().equals("comedy")) {
                stringMap.put(mp.getKey().getMovieName(), mp.getKey().getReleaseDate());
            }
            //use entrySet to iterate through the Map object

            //get all the movies name and their released date for the movie of genre "comedy"

            //store movie name with release date in the above created Map object and return the Map object


        }
        return stringMap;
    }
    }