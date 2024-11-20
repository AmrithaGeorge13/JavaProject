package org.designpattern.decoratorDeisgnPattern;

public abstract class Pizza {
    protected String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
