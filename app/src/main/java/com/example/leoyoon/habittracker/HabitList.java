package com.example.leoyoon.habittracker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Leo Yoon on 24/09/2016.
 */
public class HabitList {
    protected ArrayList<Habit> habitList;
    public HabitList(){
        habitList= new ArrayList<Habit>();
    }

    public Collection<Habit> getHabits() {
        return habitList;
    }

    public void addHabit(Habit habit){
        habitList.add(habit);
    }

    public void removeHabit(Habit habit) {
        habitList.remove(habit);
    }

}
