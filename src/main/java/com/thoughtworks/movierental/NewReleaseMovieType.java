package com.thoughtworks.movierental;

public class NewReleaseMovieType extends MovieType{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
