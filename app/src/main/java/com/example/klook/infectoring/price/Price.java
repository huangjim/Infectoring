package com.example.klook.infectoring.price;

import com.example.klook.infectoring.Movie;

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
    abstract int getPriceCode();

    class ChildrenPrice extends Price {

        @Override
        int getPriceCode() {
            return Movie.CHILDRENS;
        }
    }

    class NewReleasePrice extends Price {

        @Override
        int getPriceCode() {
            return Movie.NEW_RELEASE;
        }
    }

    class RegularPrice extends Price {

        @Override
        int getPriceCode() {
            return Movie.REGULAR;
        }
    }
}
