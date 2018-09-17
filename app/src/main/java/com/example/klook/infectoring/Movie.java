package com.example.klook.infectoring;

import com.example.klook.infectoring.price.ChildrenPrice;
import com.example.klook.infectoring.price.NewReleasePrice;
import com.example.klook.infectoring.price.Price;
import com.example.klook.infectoring.price.RegularPrice;

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
public class Movie {
    private String test111;

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {

        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented){

        return _price.getFrequentRenterPoints(daysRented);
    }
}
