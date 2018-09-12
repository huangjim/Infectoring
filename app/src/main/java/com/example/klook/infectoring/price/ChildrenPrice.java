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
public class ChildrenPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result=1.5;
        if (daysRented>3){
            result+=(daysRented-3)*1.5;
        }
        return result;
    }
}
