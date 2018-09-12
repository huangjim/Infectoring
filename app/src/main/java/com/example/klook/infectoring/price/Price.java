package com.example.klook.infectoring.price;

/**
 * [Description]
 * <p>
 * [How to use]
 * <p>
 * [Tips]
 *
 * @author Created by Zhimin.Huang on 2018/9/5.
 * @since 1.0.0
 */
public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);


    public int getFrequentRenterPoints(int daysRented) {

        return 1;
    }
}
