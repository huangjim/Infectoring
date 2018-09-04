package com.example.klook.infectoring;

/**
 * [Description]
 * <p>
 * [How to use]
 * <p>
 * [Tips]
 *
 * @author Created by Zhimin.Huang on 2018/9/3.
 * @since 1.0.0
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public double getCharge() {

        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
