package com.arthur.myapplication;

/**
 * Created by Leo on 2018/3/3.
 */

import java.util.ArrayList;
import java.util.List;

public class Task_Lists {
    private String name;
    private int taskID;
    private String desc;
    public Task_Lists (int a, String b, String c)
    {
        this.name = b;
        this.taskID = a;
        this.desc = c;
    }
    public String GetName()
    {
        return name;
    }
    public int GetID()
    {
        return taskID;
    }
    public String GetDesc()
    {
        return desc;
    }
    public void SetName(String s)
    {
        this.name = s;
    }
    public void SetID (int i)
    {
        this.taskID = i;
    }
    public void SetDesc (String s)
    {
        this.desc = s;
    }
    public static List<Task_Lists> GetAllTasks(int tasknum) {
        List<Task_Lists> Tasks = new ArrayList<Task_Lists>();
        for(int i = 1; i <= tasknum; i++)
        {
            Tasks.add(new Task_Lists(i, "Unknown","Loading task descprition..."));
        }
        return Tasks;
    }
}
