package com.example.leoyoon.habittracker;

/**
 * Created by Leo Yoon on 24/09/2016.
 */
public class Habit {
    protected String habitName;
    public Habit(String habitName){
        this.habitName = habitName;
    }
    public String getName(){
        return this.habitName;
    }

    public String setName(){
        //TO DO (maybe wont use?)
        return null;
    }
}
