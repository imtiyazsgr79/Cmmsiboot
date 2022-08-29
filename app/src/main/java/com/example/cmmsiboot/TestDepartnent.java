package com.example.cmmsiboot;

public class TestDepartnent {


        private int id;//= 5;
        private String name;//= "departmenttest6";
        private String description;//= "departmenttest6";
        private Workspace__4 workspace;

    public TestDepartnent(int id, String name, String description, Workspace__4 workspace) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.workspace = workspace;
    }

    public TestDepartnent() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Workspace__4 getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace__4 workspace) {
        this.workspace = workspace;
    }
}
