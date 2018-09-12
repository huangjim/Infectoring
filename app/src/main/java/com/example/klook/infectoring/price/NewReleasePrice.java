package com.example.klook.infectoring.price;

import com.example.klook.infectoring.Movie;

/**
 * [Description]
 * <p>
 * [How to use]
 * <p>
 * [Tips]
 *
 * @author Created by Zhimin.Huang on 2018/9/10.
 * @since 1.0.0
 */
public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented*3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented>1)?2:1;
    }
}
