package com.endava.spring.fallwinter2013.beans.xml.di;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/9/13
 * Time: 6:56 AM
 */
public class ExampleBean {
    // No. of years to the calculate the Ultimate Answer
    private int years;
    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("years", years)
                .append("ultimateAnswer", ultimateAnswer)
                .toString();
    }
}
