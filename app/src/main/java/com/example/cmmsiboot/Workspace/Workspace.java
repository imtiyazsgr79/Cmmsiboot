package com.example.cmmsiboot.Workspace;

public class Workspace {

    private String workspaceId;
    private String buildingDescription;

    public Workspace(String workspaceId, String buildingDescription) {
        this.workspaceId = workspaceId;
        this.buildingDescription = buildingDescription;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getBuildingDescription() {
        return buildingDescription;
    }

    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }
}
