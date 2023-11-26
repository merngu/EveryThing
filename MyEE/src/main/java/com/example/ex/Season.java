package com.example.ex;

public class Season {
    private final String SEASONNAME;
    private final String SEASONDESC;

    public Season(String SEASONNAME, String SEASONDESC) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }

    public static final Season SPRING = new Season("","");
    public static final Season SUMMER = new Season("","");
    public static final Season AUTUMN = new Season("","");
    public static final Season WINTER = new Season("","");
}
