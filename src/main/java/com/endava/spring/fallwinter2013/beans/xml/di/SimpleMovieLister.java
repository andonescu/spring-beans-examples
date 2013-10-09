package com.endava.spring.fallwinter2013.beans.xml.di;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/9/13
 * Time: 6:49 AM
 */
public class SimpleMovieLister {
    // the SimpleMovieLister has a dependency on a MovieFinder
    private MovieFinder movieFinder;

    // a constructor so that the Spring container can 'inject' a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("movieFinder", movieFinder)
                .toString();
    }
}
