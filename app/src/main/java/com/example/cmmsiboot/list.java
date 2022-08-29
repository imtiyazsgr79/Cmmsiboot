package com.example.cmmsiboot;

public class list {
    public String name;
    public int id;
    public String priorityId;

    public list(int id, String priorityId) {
        this.id = id;
        this.priorityId = priorityId;
    }

    public String getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(String priorityId) {
        this.priorityId = name;
    }

    public list() {
    }

    public list(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return name+" "+id;
    }
}
