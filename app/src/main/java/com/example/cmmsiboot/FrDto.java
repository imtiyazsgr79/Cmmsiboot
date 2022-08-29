    package com.example.cmmsiboot;

    import java.util.List;

    public class FrDto {
        String frId;
        Object clientFrId ;//= "TestClFRid";
        Object customerRefId;
        String requestorName;// = "KKKKKKK";
        String requestorContactNo;// = "8888888888";
        Location location;
        Building building;
        Division division;
        String locationDesc;// = "locationd";
        FaultCategory faultCategory;
        Priority priority;
        Department department;
        MaintGrp maintGrp;
        List<String> remarks;
        String status;// = "hello";
        String faultCategoryDesc;// = "faultcategorydesctest6";
        String locationName ;//= "hello";
        Object buildingName;
        String departmentName;// = "hello";
        Object maintGrpName;
        Object priorityName;
        String faultCategoryName;// = "yess";
        Object cost;
        Boolean editable;
        Object quotationStatus;
        Object acknowledgerCode;
        Object purchaseOrder;
        List<AttendedBy> attendedBy = null;
        Object technicianSignature;
        Object completedBy;
        Object eotType;
        Equipment equipment;
        Object observation;
        Object actionTaken;
        Object costCenter;
        Object labourHrs;
        Object images;
        Object bImage;
        Object activationTime;
        private Object arrivalTime;
        private Object restartTime;
        private Boolean locationScanned;
        private Object responseTime;
        private Object downTime;
        private Object pauseTime;
        private Object completionTime;
        private Object acknowledgementTime;
        private Object eotTime;
        private String reportedDate;// = "2022-03-29T18:30:00.000+0000";
        private Object fmmCaseId;
        private String reportedTime ;//= "2022-03-29T18:30:00.000+0000";
        private Object workspace;
        String requesterName;// = "lapata";
        private Object maintenanceGroup;
        private Object faultDetail;
        private Object createdBy;
        private Object createdDate;
        private Object startDate;
        private Object endDate;
        private Object costId;
        private Object startTime;
        private Object endTime;
        private Object reasonForOutstanding;
        private Object equipmentName;
        private Object divisionName;
        private Object updatedBy;


        @Override
        public String toString() {
            return "FrDto{" +
                    "frId='" + frId + '\'' +
                    ", clientFrId=" + clientFrId +
                    ", customerRefId=" + customerRefId +
                    ", requestorName=" + requestorName +
                    ", requestorContactNo='" + requestorContactNo + '\'' +
                    ", location=" + location +
                    ", building=" + building +
                    ", division=" + division +
                    ", locationDesc='" + locationDesc + '\'' +
                    ", faultCategory=" + faultCategory +
                    ", priority=" + priority +
                    ", department=" + department +
                    ", maintGrp=" + maintGrp +
                    ", remarks=" + remarks +
                    ", status='" + status + '\'' +
                    ", faultCategoryDesc='" + faultCategoryDesc + '\'' +
                    ", locationName='" + locationName + '\'' +
                    ", buildingName=" + buildingName +
                    ", departmentName='" + departmentName + '\'' +
                    ", maintGrpName=" + maintGrpName +
                    ", priorityName=" + priorityName +
                    ", faultCategoryName='" + faultCategoryName + '\'' +
                    ", cost=" + cost +
                    ", editable=" + editable +
                    ", quotationStatus=" + quotationStatus +
                    ", acknowledgerCode=" + acknowledgerCode +
                    ", purchaseOrder=" + purchaseOrder +
                    ", attendedBy=" + attendedBy +
                    ", technicianSignature=" + technicianSignature +
                    ", completedBy=" + completedBy +
                    ", eotType=" + eotType +
                    ", equipment=" + equipment +
                    ", observation=" + observation +
                    ", actionTaken=" + actionTaken +
                    ", costCenter=" + costCenter +
                    ", labourHrs=" + labourHrs +
                    ", images=" + images +
                    ", activationTime=" + activationTime +
                    ", arrivalTime=" + arrivalTime +
                    ", restartTime=" + restartTime +
                    ", locationScanned=" + locationScanned +
                    ", responseTime=" + responseTime +
                    ", downTime=" + downTime +
                    ", pauseTime=" + pauseTime +
                    ", completionTime=" + completionTime +
                    ", acknowledgementTime=" + acknowledgementTime +
                    ", eotTime=" + eotTime +
                    ", reportedDate='" + reportedDate + '\'' +
                    ", fmmCaseId=" + fmmCaseId +
                    ", reportedTime='" + reportedTime + '\'' +
                    ", workspace=" + workspace +
                    ", requesterName=" + requesterName +
                    ", maintenanceGroup=" + maintenanceGroup +
                    ", faultDetail=" + faultDetail +
                    ", createdBy=" + createdBy +
                    ", createdDate=" + createdDate +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    ", costId=" + costId +
                    ", startTime=" + startTime +
                    ", endTime=" + endTime +
                    ", reasonForOutstanding=" + reasonForOutstanding +
                    ", equipmentName=" + equipmentName +
                    ", divisionName=" + divisionName +
                    ", updatedBy=" + updatedBy +
                    '}';
        }

        /**
         * No args constructor for use in serialization
         */
        public FrDto() {
        }

        /**
         * @param priorityName
         * @param downTime
         * @param workspace
         * @param endDate
         * @param maintGrp
         * @param divisionName
         * @param costId
         * @param building
         * @param division
         * @param completionTime
         * @param pauseTime
         * @param arrivalTime
         * @param reportedDate
         * @param requesterName
         * @param technicianSignature
         * @param locationDesc
         * @param restartTime
         * @param equipmentName
         * @param requesterName
         * @param fmmCaseId
         * @param requestorContactNo
         * @param departmentName
         * @param images
         * @param updatedBy
         * @param acknowledgerCode
         * @param faultCategory
         * @param costCenter
         * @param faultCategoryDesc
         * @param equipment
         * @param customerRefId
         * @param priority
         * @param eotType
         * @param reasonForOutstanding
         * @param faultCategoryName
         * @param buildingName
         * @param frId
         * @param maintGrpName
         * @param eotTime
         * @param startDate
         * @param status
         * @param faultDetail
         * @param quotationStatus
         * @param maintenanceGroup
         * @param startTime
         * @param department
         * @param activationTime
         * @param clientFrId
         * @param locationName
         * @param cost
         * @param editable
         * @param observation
         * @param responseTime
         * @param attendedBy
         * @param labourHrs
         * @param acknowledgementTime
         * @param actionTaken
         * @param createdDate
         * @param createdBy
         * @param purchaseOrder
         * @param locationScanned
         * @param location
         * @param endTime
         * @param remarks
         * @param completedBy
         * @param reportedTime
         */
        public FrDto(String frId, Object clientFrId, Object customerRefId, String requestorName, String requestorContactNo, Location location, Building building, Division division, String locationDesc, FaultCategory faultCategory, Priority priority, Department department, MaintGrp maintGrp, List<String> remarks, String status, String faultCategoryDesc, String locationName, Object buildingName, String departmentName, Object maintGrpName, Object priorityName, String faultCategoryName, Object cost, Boolean editable, Object quotationStatus, Object acknowledgerCode, Object purchaseOrder, List<AttendedBy> attendedBy, Object technicianSignature, Object completedBy, Object eotType, Equipment equipment, Object observation, Object actionTaken, Object costCenter, Object labourHrs, Object images, Object activationTime, Object arrivalTime, Object restartTime, Boolean locationScanned, Object responseTime, Object downTime, Object pauseTime, Object completionTime, Object acknowledgementTime, Object eotTime, String reportedDate, Object fmmCaseId, String reportedTime, Object workspace, String requesterName, Object maintenanceGroup, Object faultDetail, Object createdBy, Object createdDate, Object startDate, Object endDate, Object costId, Object startTime, Object endTime, Object reasonForOutstanding, Object equipmentName, Object divisionName, Object updatedBy) {

            this.frId = frId;
            this.clientFrId = clientFrId;
            this.customerRefId = customerRefId;
            this.requestorName = requestorName;
            this.requestorContactNo = requestorContactNo;
            this.location = location;
            this.building = building;
            this.division = division;
            this.locationDesc = locationDesc;
            this.faultCategory = faultCategory;
            this.priority = priority;
            this.department = department;
            this.maintGrp = maintGrp;
            this.remarks = remarks;
            this.status = status;
            this.faultCategoryDesc = faultCategoryDesc;
            this.locationName = locationName;
            this.buildingName = buildingName;
            this.departmentName = departmentName;
            this.maintGrpName = maintGrpName;
            this.priorityName = priorityName;
            this.faultCategoryName = faultCategoryName;
            this.cost = cost;
            this.editable = editable;
            this.quotationStatus = quotationStatus;
            this.acknowledgerCode = acknowledgerCode;
            this.purchaseOrder = purchaseOrder;
            this.attendedBy = attendedBy;
            this.technicianSignature = technicianSignature;
            this.completedBy = completedBy;
            this.eotType = eotType;
            this.equipment = equipment;
            this.observation = observation;
            this.actionTaken = actionTaken;
            this.costCenter = costCenter;
            this.labourHrs = labourHrs;
            this.images = images;
            this.activationTime = activationTime;
            this.arrivalTime = arrivalTime;
            this.restartTime = restartTime;
            this.locationScanned = locationScanned;
            this.responseTime = responseTime;
            this.downTime = downTime;
            this.pauseTime = pauseTime;
            this.completionTime = completionTime;
            this.acknowledgementTime = acknowledgementTime;
            this.eotTime = eotTime;
            this.reportedDate = reportedDate;
            this.fmmCaseId = fmmCaseId;
            this.reportedTime = reportedTime;
            this.workspace = workspace;
            this.requesterName = requesterName;
            this.maintenanceGroup = maintenanceGroup;
            this.faultDetail = faultDetail;
            this.createdBy = createdBy;
            this.createdDate = createdDate;
            this.startDate = startDate;
            this.endDate = endDate;
            this.costId = costId;
            this.startTime = startTime;
            this.endTime = endTime;
            this.reasonForOutstanding = reasonForOutstanding;
            this.equipmentName = equipmentName;
            this.divisionName = divisionName;
            this.updatedBy = updatedBy;
        }

        public String getFrId() {
            return frId;
        }

        public void setFrId(String frId) {
            this.frId = frId;
        }

        public FrDto withFrId(String frId) {
            this.frId = frId;
            return this;
        }

        public Object getClientFrId() {
            return clientFrId;
        }

        public void setClientFrId(Object clientFrId) {
            this.clientFrId = clientFrId;
        }


        public Object getCustomerRefId() {
            return customerRefId;
        }

        public void setCustomerRefId(Object customerRefId) {
            this.customerRefId = customerRefId;
        }

        public FrDto withCustomerRefId(Object customerRefId) {
            this.customerRefId = customerRefId;
            return this;
        }

        public String getRequestorName() {
            return requestorName;
        }

        public void setequestorName(String requestorName) {
            this.requestorName = requestorName;
        }

        public String getRequesterName() {
            return requesterName;
        }

        public void setequesterName(String requestorName) {
            this.requesterName = requestorName;
        }


        public String getRequestorContactNo() {
            return requestorContactNo;
        }

        public void setRequestorContactNo(String requestorContactNo) {
            this.requestorContactNo = requestorContactNo;
        }

        public FrDto withRequestorContactNo(String requestorContactNo) {
            this.requestorContactNo = requestorContactNo;
            return this;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public FrDto withLocation(Location location) {
            this.location = location;
            return this;
        }

        public Building getBuilding() {
            return building;
        }

        public void setBuilding(Building building) {
            this.building = building;
        }

        public FrDto withBuilding(Building building) {
            this.building = building;
            return this;
        }

        public Division getDivision() {
            return division;
        }

        public void setDivision(Division division) {
            this.division = division;
        }

        public FrDto withDivision(Division division) {
            this.division = division;
            return this;
        }

        public String getLocationDesc() {
            return locationDesc;
        }

        public void setLocationDesc(String locationDesc) {
            this.locationDesc = locationDesc;
        }

        public FrDto withLocationDesc(String locationDesc) {
            this.locationDesc = locationDesc;
            return this;
        }

        public FaultCategory getFaultCategory() {
            return faultCategory;
        }

        public void setFaultCategory(FaultCategory faultCategory) {
            this.faultCategory = faultCategory;
        }

        public FrDto withFaultCategory(FaultCategory faultCategory) {
            this.faultCategory = faultCategory;
            return this;
        }

        public Priority getPriority() {
            return priority;
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }

        public FrDto withPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        public FrDto withDepartment(Department department) {
            this.department = department;
            return this;
        }

        public MaintGrp getMaintGrp() {
            return maintGrp;
        }

        public void setMaintGrp(MaintGrp maintGrp) {
            this.maintGrp = maintGrp;
        }

        public FrDto withMaintGrp(MaintGrp maintGrp) {
            this.maintGrp = maintGrp;
            return this;
        }

        public List<String> getRemarks() {
            return remarks;
        }

        public void setRemarks(List<String> remarks) {
            this.remarks = remarks;
        }

        public FrDto withRemarks(List<String> remarks) {
            this.remarks = remarks;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public FrDto withStatus(String status) {
            this.status = status;
            return this;
        }

        public String getFaultCategoryDesc() {
            return faultCategoryDesc;
        }

        public void setFaultCategoryDesc(String faultCategoryDesc) {
            this.faultCategoryDesc = faultCategoryDesc;
        }

        public FrDto withFaultCategoryDesc(String faultCategoryDesc) {
            this.faultCategoryDesc = faultCategoryDesc;
            return this;
        }

        public String getLocationName() {
            return locationName;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public FrDto withLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }

        public Object getBuildingName() {
            return buildingName;
        }

        public void setBuildingName(Object buildingName) {
            this.buildingName = buildingName;
        }

        public FrDto withBuildingName(Object buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public FrDto withDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Object getMaintGrpName() {
            return maintGrpName;
        }

        public void setMaintGrpName(Object maintGrpName) {
            this.maintGrpName = maintGrpName;
        }

        public FrDto withMaintGrpName(Object maintGrpName) {
            this.maintGrpName = maintGrpName;
            return this;
        }

        public Object getPriorityName() {
            return priorityName;
        }

        public void setPriorityName(Object priorityName) {
            this.priorityName = priorityName;
        }

        public FrDto withPriorityName(Object priorityName) {
            this.priorityName = priorityName;
            return this;
        }

        public String getFaultCategoryName() {
            return faultCategoryName;
        }

        public void setFaultCategoryName(String faultCategoryName) {
            this.faultCategoryName = faultCategoryName;
        }

        public FrDto withFaultCategoryName(String faultCategoryName) {
            this.faultCategoryName = faultCategoryName;
            return this;
        }

        public Object getCost() {
            return cost;
        }

        public void setCost(Object cost) {
            this.cost = cost;
        }

        public FrDto withCost(Object cost) {
            this.cost = cost;
            return this;
        }

        public Boolean getEditable() {
            return editable;
        }

        public void setEditable(Boolean editable) {
            this.editable = editable;
        }

        public FrDto withEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }

        public Object getQuotationStatus() {
            return quotationStatus;
        }

        public void setQuotationStatus(Object quotationStatus) {
            this.quotationStatus = quotationStatus;
        }

        public FrDto withQuotationStatus(Object quotationStatus) {
            this.quotationStatus = quotationStatus;
            return this;
        }

        public Object getAcknowledgerCode() {
            return acknowledgerCode;
        }

        public void setAcknowledgerCode(Object acknowledgerCode) {
            this.acknowledgerCode = acknowledgerCode;
        }

        public FrDto withAcknowledgerCode(Object acknowledgerCode) {
            this.acknowledgerCode = acknowledgerCode;
            return this;
        }

        public Object getPurchaseOrder() {
            return purchaseOrder;
        }

        public void setPurchaseOrder(Object purchaseOrder) {
            this.purchaseOrder = purchaseOrder;
        }

        public FrDto withPurchaseOrder(Object purchaseOrder) {
            this.purchaseOrder = purchaseOrder;
            return this;
        }

        public List<AttendedBy> getAttendedBy() {
            return attendedBy;
        }

        public void setAttendedBy(List<AttendedBy> attendedBy) {
            this.attendedBy = attendedBy;
        }

        public FrDto withAttendedBy(List<AttendedBy> attendedBy) {
            this.attendedBy = attendedBy;
            return this;
        }

        public Object getTechnicianSignature() {
            return technicianSignature;
        }

        public void setTechnicianSignature(Object technicianSignature) {
            this.technicianSignature = technicianSignature;
        }

        public FrDto withTechnicianSignature(Object technicianSignature) {
            this.technicianSignature = technicianSignature;
            return this;
        }

        public Object getCompletedBy() {
            return completedBy;
        }

        public void setCompletedBy(Object completedBy) {
            this.completedBy = completedBy;
        }

        public FrDto withCompletedBy(Object completedBy) {
            this.completedBy = completedBy;
            return this;
        }

        public Object getEotType() {
            return eotType;
        }

        public void setEotType(Object eotType) {
            this.eotType = eotType;
        }

        public FrDto withEotType(Object eotType) {
            this.eotType = eotType;
            return this;
        }

        public Equipment getEquipment() {
            return equipment;
        }

        public void setEquipment(Equipment equipment) {
            this.equipment = equipment;
        }

        public FrDto withEquipment(Equipment equipment) {
            this.equipment = equipment;
            return this;
        }

        public Object getObservation() {
            return observation;
        }

        public void setObservation(Object observation) {
            this.observation = observation;
        }

        public FrDto withObservation(Object observation) {
            this.observation = observation;
            return this;
        }

        public Object getActionTaken() {
            return actionTaken;
        }

        public void setActionTaken(Object actionTaken) {
            this.actionTaken = actionTaken;
        }

        public FrDto withActionTaken(Object actionTaken) {
            this.actionTaken = actionTaken;
            return this;
        }

        public Object getCostCenter() {
            return costCenter;
        }

        public void setCostCenter(Object costCenter) {
            this.costCenter = costCenter;
        }

        public FrDto withCostCenter(Object costCenter) {
            this.costCenter = costCenter;
            return this;
        }

        public Object getLabourHrs() {
            return labourHrs;
        }

        public void setLabourHrs(Object labourHrs) {
            this.labourHrs = labourHrs;
        }

        public FrDto withLabourHrs(Object labourHrs) {
            this.labourHrs = labourHrs;
            return this;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public FrDto withImages(Object images) {
            this.images = images;
            return this;
        }

        public Object getActivationTime() {
            return activationTime;
        }

        public void setActivationTime(Object activationTime) {
            this.activationTime = activationTime;
        }

        public FrDto withActivationTime(Object activationTime) {
            this.activationTime = activationTime;
            return this;
        }

        public Object getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(Object arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public FrDto withArrivalTime(Object arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Object getRestartTime() {
            return restartTime;
        }

        public void setRestartTime(Object restartTime) {
            this.restartTime = restartTime;
        }

        public FrDto withRestartTime(Object restartTime) {
            this.restartTime = restartTime;
            return this;
        }

        public Boolean getLocationScanned() {
            return locationScanned;
        }

        public void setLocationScanned(Boolean locationScanned) {
            this.locationScanned = locationScanned;
        }

        public FrDto withLocationScanned(Boolean locationScanned) {
            this.locationScanned = locationScanned;
            return this;
        }

        public Object getResponseTime() {
            return responseTime;
        }

        public void setResponseTime(Object responseTime) {
            this.responseTime = responseTime;
        }

        public FrDto withResponseTime(Object responseTime) {
            this.responseTime = responseTime;
            return this;
        }

        public Object getDownTime() {
            return downTime;
        }

        public void setDownTime(Object downTime) {
            this.downTime = downTime;
        }

        public FrDto withDownTime(Object downTime) {
            this.downTime = downTime;
            return this;
        }

        public Object getPauseTime() {
            return pauseTime;
        }

        public void setPauseTime(Object pauseTime) {
            this.pauseTime = pauseTime;
        }

        public FrDto withPauseTime(Object pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }

        public Object getCompletionTime() {
            return completionTime;
        }

        public void setCompletionTime(Object completionTime) {
            this.completionTime = completionTime;
        }

        public FrDto withCompletionTime(Object completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Object getAcknowledgementTime() {
            return acknowledgementTime;
        }

        public void setAcknowledgementTime(Object acknowledgementTime) {
            this.acknowledgementTime = acknowledgementTime;
        }

        public FrDto withAcknowledgementTime(Object acknowledgementTime) {
            this.acknowledgementTime = acknowledgementTime;
            return this;
        }

        public Object getEotTime() {
            return eotTime;
        }

        public void setEotTime(Object eotTime) {
            this.eotTime = eotTime;
        }

        public FrDto withEotTime(Object eotTime) {
            this.eotTime = eotTime;
            return this;
        }

        public String getReportedDate() {
            return reportedDate;
        }

        public void setReportedDate(String reportedDate) {
            this.reportedDate = reportedDate;
        }

        public FrDto withReportedDate(String reportedDate) {
            this.reportedDate = reportedDate;
            return this;
        }

        public Object getFmmCaseId() {
            return fmmCaseId;
        }

        public void setFmmCaseId(Object fmmCaseId) {
            this.fmmCaseId = fmmCaseId;
        }

        public FrDto withFmmCaseId(Object fmmCaseId) {
            this.fmmCaseId = fmmCaseId;
            return this;
        }

        public String getReportedTime() {
            return reportedTime;
        }

        public void setReportedTime(String reportedTime) {
            this.reportedTime = reportedTime;
        }

        public FrDto withReportedTime(String reportedTime) {
            this.reportedTime = reportedTime;
            return this;
        }

        public Object getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Object workspace) {
            this.workspace = workspace;
        }

        public FrDto withWorkspace(Object workspace) {
            this.workspace = workspace;
            return this;
        }


        public void setRequestorName(String requestorName) {
            this.requestorName = requestorName;
        }


        public Object getMaintenanceGroup() {
            return maintenanceGroup;
        }

        public void setMaintenanceGroup(Object maintenanceGroup) {
            this.maintenanceGroup = maintenanceGroup;
        }

        public FrDto withMaintenanceGroup(Object maintenanceGroup) {
            this.maintenanceGroup = maintenanceGroup;
            return this;
        }

        public Object getFaultDetail() {
            return faultDetail;
        }

        public void setFaultDetail(Object faultDetail) {
            this.faultDetail = faultDetail;
        }

        public FrDto withFaultDetail(Object faultDetail) {
            this.faultDetail = faultDetail;
            return this;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
        }

        public FrDto withCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Object getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(Object createdDate) {
            this.createdDate = createdDate;
        }

        public FrDto withCreatedDate(Object createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Object getStartDate() {
            return startDate;
        }

        public void setStartDate(Object startDate) {
            this.startDate = startDate;
        }

        public FrDto withStartDate(Object startDate) {
            this.startDate = startDate;
            return this;
        }

        public Object getEndDate() {
            return endDate;
        }

        public void setEndDate(Object endDate) {
            this.endDate = endDate;
        }

        public FrDto withEndDate(Object endDate) {
            this.endDate = endDate;
            return this;
        }

        public Object getCostId() {
            return costId;
        }

        public void setCostId(Object costId) {
            this.costId = costId;
        }

        public FrDto withCostId(Object costId) {
            this.costId = costId;
            return this;
        }

        public Object getStartTime() {
            return startTime;
        }

        public void setStartTime(Object startTime) {
            this.startTime = startTime;
        }

        public FrDto withStartTime(Object startTime) {
            this.startTime = startTime;
            return this;
        }

        public Object getEndTime() {
            return endTime;
        }

        public void setEndTime(Object endTime) {
            this.endTime = endTime;
        }

        public FrDto withEndTime(Object endTime) {
            this.endTime = endTime;
            return this;
        }

        public Object getReasonForOutstanding() {
            return reasonForOutstanding;
        }

        public void setReasonForOutstanding(Object reasonForOutstanding) {
            this.reasonForOutstanding = reasonForOutstanding;
        }

        public FrDto withReasonForOutstanding(Object reasonForOutstanding) {
            this.reasonForOutstanding = reasonForOutstanding;
            return this;
        }

        public Object getEquipmentName() {
            return equipmentName;
        }

        public void setEquipmentName(Object equipmentName) {
            this.equipmentName = equipmentName;
        }

        public FrDto withEquipmentName(Object equipmentName) {
            this.equipmentName = equipmentName;
            return this;
        }

        public Object getDivisionName() {
            return divisionName;
        }

        public void setDivisionName(Object divisionName) {
            this.divisionName = divisionName;
        }

        public FrDto withDivisionName(Object divisionName) {
            this.divisionName = divisionName;
            return this;
        }

        public Object getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(Object updatedBy) {
            this.updatedBy = updatedBy;
        }

        public FrDto withUpdatedBy(Object updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

    }

    class Building {

        private int id ;//= 6;
        private String name;// = "towertest6";
        private String description;// = "towertest6";

        /**
         * No args constructor for use in serialization
         */
        public Building() {
        }

        /**
         * @param name
         * @param description
         * @param id
         */
        public Building(int id, String name, String description) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Building withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Building withName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Building withDescription(String description) {
            this.description = description;
            return this;
        }

    }

    class Division {

        private int id;// = 4;
        private String name ;//= "divisiontest6";
        private String description;// = "divisiontest6";
        private Workspace_ workspace;

        /**
         * No args constructor for use in serialization
         */
        public Division() {
        }

        /**
         * @param workspace
         * @param name
         * @param description
         * @param id
         */
        public Division(int id, String name, String description, Workspace_ workspace) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
            this.workspace = workspace;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Division withId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Division withName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Division withDescription(String description) {
            this.description = description;
            return this;
        }

        public Workspace_ getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace_ workspace) {
            this.workspace = workspace;
        }

        public Division withWorkspace(Workspace_ workspace) {
            this.workspace = workspace;
            return this;
        }

    }

    class FaultCategory {
        //Fault CategoryDesc not here
        private int id;// = 883;
        private String name;// = "faultidtest6";
        private String description ;//= "faultidtest6";
        private Priorty priorty;
        private Workspace__2 workspace;

        /**
         * No args constructor for use in serialization
         */
        public FaultCategory() {
        }

        /**
         * @param priorty
         * @param workspace
         * @param name
         * @param description
         * @param id
         */
        public FaultCategory(int id, String name, String description, Priorty priorty, Workspace__2 workspace) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
            this.priorty = priorty;
            this.workspace = workspace;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public FaultCategory withId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public FaultCategory withName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public FaultCategory withDescription(String description) {
            this.description = description;
            return this;
        }

        public Priorty getPriorty() {
            return priorty;
        }

        public void setPriorty(Priorty priorty) {
            this.priorty = priorty;
        }

        public FaultCategory withPriorty(Priorty priorty) {
            this.priorty = priorty;
            return this;
        }

        public Workspace__2 getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace__2 workspace) {
            this.workspace = workspace;
        }

        public FaultCategory withWorkspace(Workspace__2 workspace) {
            this.workspace = workspace;
            return this;
        }

    }

    class Priority {

        private int id ;//= 882;
        private String priorityId;// = "prioritytest6";
        private Workspace__3 workspace;
        private String priorityDesc;// = "prioritytest6";

        /**
         * No args constructor for use in serialization
         */
        public Priority() {
        }

        /**
         * @param workspace
         * @param id
         * @param priorityDesc
         * @param priorityId
         */
        public Priority(int id, String priorityId, Workspace__3 workspace, String priorityDesc) {
            super();
            this.id = id;
            this.priorityId = priorityId;
            this.workspace = workspace;
            this.priorityDesc = priorityDesc;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Priority withId(int id) {
            this.id = id;
            return this;
        }

        public String getPriorityId() {
            return priorityId;
        }

        public void setPriorityId(String priorityId) {
            this.priorityId = priorityId;
        }

        public Priority withPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        public Workspace__3 getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace__3 workspace) {
            this.workspace = workspace;
        }

        public Priority withWorkspace(Workspace__3 workspace) {
            this.workspace = workspace;
            return this;
        }

        public String getPriorityDesc() {
            return priorityDesc;
        }

        public void setPriorityDesc(String priorityDesc) {
            this.priorityDesc = priorityDesc;
        }

        public Priority withPriorityDesc(String priorityDesc) {
            this.priorityDesc = priorityDesc;
            return this;
        }

    }

    class Priorty {

        private int id;// = 882;
        private String priorityId;// = "prioritytest6";
        private Workspace__1 workspace;
        private String priorityDesc;//= "prioritytest6";

        /**
         * No args constructor for use in serialization
         */
        public Priorty() {
        }

        /**
         * @param workspace
         * @param id
         * @param priorityDesc
         * @param priorityId
         */
        public Priorty(int id, String priorityId, Workspace__1 workspace, String priorityDesc) {
            super();
            this.id = id;
            this.priorityId = priorityId;
            this.workspace = workspace;
            this.priorityDesc = priorityDesc;
        }

        public int  getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Priorty withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getPriorityId() {
            return priorityId;
        }

        public void setPriorityId(String priorityId) {
            this.priorityId = priorityId;
        }

        public Priorty withPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }

        public Workspace__1 getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace__1 workspace) {
            this.workspace = workspace;
        }

        public Priorty withWorkspace(Workspace__1 workspace) {
            this.workspace = workspace;
            return this;
        }

        public String getPriorityDesc() {
            return priorityDesc;
        }

        public void setPriorityDesc(String priorityDesc) {
            this.priorityDesc = priorityDesc;
        }

        public Priorty withPriorityDesc(String priorityDesc) {
            this.priorityDesc = priorityDesc;
            return this;
        }

    }

    class Department {

        private int id;//= 5;
        private String name;//= "departmenttest6";
        private String description;//= "departmenttest6";
        private Workspace__4 workspace;


        public Department() {
        }

        /**
         * @param workspace
         * @param name
         * @param description
         * @param id
         */
        public Department(int id, String name, String description, Workspace__4 workspace) {

            this.id = id;
            this.name = name;
            this.description = description;
            this.workspace = workspace;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

       /* public Department withId(int id) {
            this.id = id;
            return this;
        }*/

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

       /* public Department withName(String name) {
            this.name = name;
            return this;
        }*/

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Department withDescription(String description) {
            this.description = description;
            return this;
        }

        public Workspace__4 getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace__4 workspace) {
            this.workspace = workspace;
        }

        /*public Department withWorkspace(Workspace__4 workspace) {
            this.workspace = workspace;
            return this;
        }
*/
    }

    class MaintGrp {

        private int id;// = 5;
        private String name ;//= "maintenancegroup6test";
        private String description;// = "maintenancegroup6test";
        private Object status;
        private Workspace__5 workspace;

        /**
         * No args constructor for use in serialization
         */
        public MaintGrp() {
        }

        /**
         * @param workspace
         * @param name
         * @param description
         * @param id
         * @param status
         */
        public MaintGrp(int id, String name, String description, Object status, Workspace__5 workspace) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
            this.status = status;
            this.workspace = workspace;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public MaintGrp withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public MaintGrp withName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public MaintGrp withDescription(String description) {
            this.description = description;
            return this;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public MaintGrp withStatus(Object status) {
            this.status = status;
            return this;
        }

        public Workspace__5 getWorkspace() {
            return workspace;
        }

        public void setWorkspace(Workspace__5 workspace) {
            this.workspace = workspace;
        }

        public MaintGrp withWorkspace(Workspace__5 workspace) {
            this.workspace = workspace;
            return this;
        }

    }


    class AttendedBy {

        private int id ;//= 13;
        private String name ;//= "technician6";
        private Object designation;
        private Object department;
        private Object status;
        private Object deviceToken;
        private Object email;

        /**
         * No args constructor for use in serialization
         */
        public AttendedBy() {
        }

        /**
         * @param name
         * @param id
         * @param designation
         * @param department
         * @param email
         * @param status
         * @param deviceToken
         */
        public AttendedBy(int id, String name, Object designation, Object department, Object status, Object deviceToken, Object email) {
            super();
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.department = department;
            this.status = status;
            this.deviceToken = deviceToken;
            this.email = email;
        }

        public AttendedBy(int idd) {

        }



        public int getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public AttendedBy withId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AttendedBy withName(String name) {
            this.name = name;
            return this;
        }

        public Object getDesignation() {
            return designation;
        }

        public void setDesignation(Object designation) {
            this.designation = designation;
        }

        public AttendedBy withDesignation(Object designation) {
            this.designation = designation;
            return this;
        }

        public Object getDepartment() {
            return department;
        }

        public void setDepartment(Object department) {
            this.department = department;
        }

        public AttendedBy withDepartment(Object department) {
            this.department = department;
            return this;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public AttendedBy withStatus(Object status) {
            this.status = status;
            return this;
        }

        public Object getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(Object deviceToken) {
            this.deviceToken = deviceToken;
        }

        public AttendedBy withDeviceToken(Object deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public AttendedBy withEmail(Object email) {
            this.email = email;
            return this;
        }

    }

    class Equipment {

        private int id ;// = 7680;
        private String name ;//= "ss66rr";
        private Object modelNo;
        private Object remarks;
        private Object monthOfExpiry;
        private Object fcuModel;
        private Object quantity;
        private Object equipmentCode;
        private Object reCertificatedOn;
        private Object serialNo;
        private Object assetTypeName;
        private Object buildingName;
        private Object locationName;
        private Object assetSubTypeName;
        private Object equipmentId;
        private Object qty;
        private Object subLocation;
        private Object coolingCapacity;
        private Object typeOfFcu;
        private Object airFlow;
        private Object cuRef;
        private Object fcuRef;
        private Object servingArea;
        private Object frequency;
        private Object lifeSpan;
        private Object make;
        private Object assetNo;
        private Object manufacturingDate;
        private Object weight;
        private Object dimension;
        private Object electricPowerSupply;
        private Object isolatorSize;
        private Object supplierName;
        private Object supplierAddress;
        private Object contactNo;
        private Object fanRef;
        private Object staticPressure;
        private Object warrantyPeriod;
        private Object dia;
        private Object power;
        private Object fullLoadCurrent;
        private Object cpRef;
        private Object powerRequirement;
        private Object drawingImage;
        private Object image;
        private Object dateOfTagging;
        private Object brand;
        private Object description;
        private Object equipmenttracking;
        private Object cuLocation;
        private Object nameOfCondo;
        private Object condoAddress;
        private Object noOfHouseHolds;
        private Object lockerSize;
        private Object serialNumberMain;
        private Object subUnits;
        private Object compartmentCount;
        private Object routerPresent;
        private Object simCardRegNo;
        private Object serviceProvider;
        private Object softwareVersion;
        private Object internalComponentsCount;

        /**
         * No args constructor for use in serialization
         */
        public Equipment() {
        }

        /**
         * @param routerPresent
         * @param equipmentCode
         * @param lockerSize
         * @param dateOfTagging
         * @param equipmentId
         * @param frequency
         * @param cuLocation
         * @param powerRequirement
         * @param fanRef
         * @param id
         * @param staticPressure
         * @param brand
         * @param reCertificatedOn
         * @param supplierAddress
         * @param image
         * @param fullLoadCurrent
         * @param compartmentCount
         * @param coolingCapacity
         * @param weight
         * @param fcuRef
         * @param assetNo
         * @param assetSubTypeName
         * @param serialNo
         * @param buildingName
         * @param isolatorSize
         * @param qty
         * @param name
         * @param serviceProvider
         * @param subLocation
         * @param condoAddress
         * @param softwareVersion
         * @param cpRef
         * @param assetTypeName
         * @param airFlow
         * @param description
         * @param servingArea
         * @param warrantyPeriod
         * @param lifeSpan
         * @param simCardRegNo
         * @param noOfHouseHolds
         * @param power
         * @param make
         * @param dimension
         * @param supplierName
         * @param electricPowerSupply
         * @param quantity
         * @param locationName
         * @param serialNumberMain
         * @param equipmenttracking
         * @param cuRef
         * @param fcuModel
         * @param modelNo
         * @param typeOfFcu
         * @param internalComponentsCount
         * @param subUnits
         * @param manufacturingDate
         * @param monthOfExpiry
         * @param nameOfCondo
         * @param dia
         * @param remarks
         * @param drawingImage
         * @param contactNo
         */

        public Equipment(int id, String name, Object modelNo, Object remarks, Object monthOfExpiry, Object fcuModel, Object quantity, Object equipmentCode, Object reCertificatedOn, Object serialNo, Object assetTypeName, Object buildingName, Object locationName, Object assetSubTypeName, Object equipmentId, Object qty, Object subLocation, Object coolingCapacity, Object typeOfFcu, Object airFlow, Object cuRef, Object fcuRef, Object servingArea, Object frequency, Object lifeSpan, Object make, Object assetNo, Object manufacturingDate, Object weight, Object dimension, Object electricPowerSupply, Object isolatorSize, Object supplierName, Object supplierAddress, Object contactNo, Object fanRef, Object staticPressure, Object warrantyPeriod, Object dia, Object power, Object fullLoadCurrent, Object cpRef, Object powerRequirement, Object drawingImage, Object image, Object dateOfTagging, Object brand, Object description, Object equipmenttracking, Object cuLocation, Object nameOfCondo, Object condoAddress, Object noOfHouseHolds, Object lockerSize, Object serialNumberMain, Object subUnits, Object compartmentCount, Object routerPresent, Object simCardRegNo, Object serviceProvider, Object softwareVersion, Object internalComponentsCount) {
            super();
            this.id = id;
            this.name = name;
            this.modelNo = modelNo;
            this.remarks = remarks;
            this.monthOfExpiry = monthOfExpiry;
            this.fcuModel = fcuModel;
            this.quantity = quantity;
            this.equipmentCode = equipmentCode;
            this.reCertificatedOn = reCertificatedOn;
            this.serialNo = serialNo;
            this.assetTypeName = assetTypeName;
            this.buildingName = buildingName;
            this.locationName = locationName;
            this.assetSubTypeName = assetSubTypeName;
            this.equipmentId = equipmentId;
            this.qty = qty;
            this.subLocation = subLocation;
            this.coolingCapacity = coolingCapacity;
            this.typeOfFcu = typeOfFcu;
            this.airFlow = airFlow;
            this.cuRef = cuRef;
            this.fcuRef = fcuRef;
            this.servingArea = servingArea;
            this.frequency = frequency;
            this.lifeSpan = lifeSpan;
            this.make = make;
            this.assetNo = assetNo;
            this.manufacturingDate = manufacturingDate;
            this.weight = weight;
            this.dimension = dimension;
            this.electricPowerSupply = electricPowerSupply;
            this.isolatorSize = isolatorSize;
            this.supplierName = supplierName;
            this.supplierAddress = supplierAddress;
            this.contactNo = contactNo;
            this.fanRef = fanRef;
            this.staticPressure = staticPressure;
            this.warrantyPeriod = warrantyPeriod;
            this.dia = dia;
            this.power = power;
            this.fullLoadCurrent = fullLoadCurrent;
            this.cpRef = cpRef;
            this.powerRequirement = powerRequirement;
            this.drawingImage = drawingImage;
            this.image = image;
            this.dateOfTagging = dateOfTagging;
            this.brand = brand;
            this.description = description;
            this.equipmenttracking = equipmenttracking;
            this.cuLocation = cuLocation;
            this.nameOfCondo = nameOfCondo;
            this.condoAddress = condoAddress;
            this.noOfHouseHolds = noOfHouseHolds;
            this.lockerSize = lockerSize;
            this.serialNumberMain = serialNumberMain;
            this.subUnits = subUnits;
            this.compartmentCount = compartmentCount;
            this.routerPresent = routerPresent;
            this.simCardRegNo = simCardRegNo;
            this.serviceProvider = serviceProvider;
            this.softwareVersion = softwareVersion;
            this.internalComponentsCount = internalComponentsCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Equipment withId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Equipment withName(String name) {
            this.name = name;
            return this;
        }

        public Object getModelNo() {
            return modelNo;
        }

        public void setModelNo(Object modelNo) {
            this.modelNo = modelNo;
        }

        public Equipment withModelNo(Object modelNo) {
            this.modelNo = modelNo;
            return this;
        }

        public Object getRemarks() {
            return remarks;
        }

        public void setRemarks(Object remarks) {
            this.remarks = remarks;
        }

        public Equipment withRemarks(Object remarks) {
            this.remarks = remarks;
            return this;
        }

        public Object getMonthOfExpiry() {
            return monthOfExpiry;
        }

        public void setMonthOfExpiry(Object monthOfExpiry) {
            this.monthOfExpiry = monthOfExpiry;
        }

        public Equipment withMonthOfExpiry(Object monthOfExpiry) {
            this.monthOfExpiry = monthOfExpiry;
            return this;
        }

        public Object getFcuModel() {
            return fcuModel;
        }

        public void setFcuModel(Object fcuModel) {
            this.fcuModel = fcuModel;
        }

        public Equipment withFcuModel(Object fcuModel) {
            this.fcuModel = fcuModel;
            return this;
        }

        public Object getQuantity() {
            return quantity;
        }

        public void setQuantity(Object quantity) {
            this.quantity = quantity;
        }

        public Equipment withQuantity(Object quantity) {
            this.quantity = quantity;
            return this;
        }

        public Object getEquipmentCode() {
            return equipmentCode;
        }

        public void setEquipmentCode(Object equipmentCode) {
            this.equipmentCode = equipmentCode;
        }

        public Equipment withEquipmentCode(Object equipmentCode) {
            this.equipmentCode = equipmentCode;
            return this;
        }

        public Object getReCertificatedOn() {
            return reCertificatedOn;
        }

        public void setReCertificatedOn(Object reCertificatedOn) {
            this.reCertificatedOn = reCertificatedOn;
        }

        public Equipment withReCertificatedOn(Object reCertificatedOn) {
            this.reCertificatedOn = reCertificatedOn;
            return this;
        }

        public Object getSerialNo() {
            return serialNo;
        }

        public void setSerialNo(Object serialNo) {
            this.serialNo = serialNo;
        }

        public Equipment withSerialNo(Object serialNo) {
            this.serialNo = serialNo;
            return this;
        }

        public Object getAssetTypeName() {
            return assetTypeName;
        }

        public void setAssetTypeName(Object assetTypeName) {
            this.assetTypeName = assetTypeName;
        }

        public Equipment withAssetTypeName(Object assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }

        public Object getBuildingName() {
            return buildingName;
        }

        public void setBuildingName(Object buildingName) {
            this.buildingName = buildingName;
        }

        public Equipment withBuildingName(Object buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        public Object getLocationName() {
            return locationName;
        }

        public void setLocationName(Object locationName) {
            this.locationName = locationName;
        }

        public Equipment withLocationName(Object locationName) {
            this.locationName = locationName;
            return this;
        }

        public Object getAssetSubTypeName() {
            return assetSubTypeName;
        }

        public void setAssetSubTypeName(Object assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
        }

        public Equipment withAssetSubTypeName(Object assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
            return this;
        }

        public Object getEquipmentId() {
            return equipmentId;
        }

        public void setEquipmentId(Object equipmentId) {
            this.equipmentId = equipmentId;
        }

        public Equipment withEquipmentId(Object equipmentId) {
            this.equipmentId = equipmentId;
            return this;
        }

        public Object getQty() {
            return qty;
        }

        public void setQty(Object qty) {
            this.qty = qty;
        }

        public Equipment withQty(Object qty) {
            this.qty = qty;
            return this;
        }

        public Object getSubLocation() {
            return subLocation;
        }

        public void setSubLocation(Object subLocation) {
            this.subLocation = subLocation;
        }

        public Equipment withSubLocation(Object subLocation) {
            this.subLocation = subLocation;
            return this;
        }

        public Object getCoolingCapacity() {
            return coolingCapacity;
        }

        public void setCoolingCapacity(Object coolingCapacity) {
            this.coolingCapacity = coolingCapacity;
        }

        public Equipment withCoolingCapacity(Object coolingCapacity) {
            this.coolingCapacity = coolingCapacity;
            return this;
        }

        public Object getTypeOfFcu() {
            return typeOfFcu;
        }

        public void setTypeOfFcu(Object typeOfFcu) {
            this.typeOfFcu = typeOfFcu;
        }

        public Equipment withTypeOfFcu(Object typeOfFcu) {
            this.typeOfFcu = typeOfFcu;
            return this;
        }

        public Object getAirFlow() {
            return airFlow;
        }

        public void setAirFlow(Object airFlow) {
            this.airFlow = airFlow;
        }

        public Equipment withAirFlow(Object airFlow) {
            this.airFlow = airFlow;
            return this;
        }

        public Object getCuRef() {
            return cuRef;
        }

        public void setCuRef(Object cuRef) {
            this.cuRef = cuRef;
        }

        public Equipment withCuRef(Object cuRef) {
            this.cuRef = cuRef;
            return this;
        }

        public Object getFcuRef() {
            return fcuRef;
        }

        public void setFcuRef(Object fcuRef) {
            this.fcuRef = fcuRef;
        }

        public Equipment withFcuRef(Object fcuRef) {
            this.fcuRef = fcuRef;
            return this;
        }

        public Object getServingArea() {
            return servingArea;
        }

        public void setServingArea(Object servingArea) {
            this.servingArea = servingArea;
        }

        public Equipment withServingArea(Object servingArea) {
            this.servingArea = servingArea;
            return this;
        }

        public Object getFrequency() {
            return frequency;
        }

        public void setFrequency(Object frequency) {
            this.frequency = frequency;
        }

        public Equipment withFrequency(Object frequency) {
            this.frequency = frequency;
            return this;
        }

        public Object getLifeSpan() {
            return lifeSpan;
        }

        public void setLifeSpan(Object lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public Equipment withLifeSpan(Object lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }

        public Object getMake() {
            return make;
        }

        public void setMake(Object make) {
            this.make = make;
        }

        public Equipment withMake(Object make) {
            this.make = make;
            return this;
        }

        public Object getAssetNo() {
            return assetNo;
        }

        public void setAssetNo(Object assetNo) {
            this.assetNo = assetNo;
        }

        public Equipment withAssetNo(Object assetNo) {
            this.assetNo = assetNo;
            return this;
        }

        public Object getManufacturingDate() {
            return manufacturingDate;
        }

        public void setManufacturingDate(Object manufacturingDate) {
            this.manufacturingDate = manufacturingDate;
        }

        public Equipment withManufacturingDate(Object manufacturingDate) {
            this.manufacturingDate = manufacturingDate;
            return this;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public Equipment withWeight(Object weight) {
            this.weight = weight;
            return this;
        }

        public Object getDimension() {
            return dimension;
        }

        public void setDimension(Object dimension) {
            this.dimension = dimension;
        }

        public Equipment withDimension(Object dimension) {
            this.dimension = dimension;
            return this;
        }

        public Object getElectricPowerSupply() {
            return electricPowerSupply;
        }

        public void setElectricPowerSupply(Object electricPowerSupply) {
            this.electricPowerSupply = electricPowerSupply;
        }

        public Equipment withElectricPowerSupply(Object electricPowerSupply) {
            this.electricPowerSupply = electricPowerSupply;
            return this;
        }

        public Object getIsolatorSize() {
            return isolatorSize;
        }

        public void setIsolatorSize(Object isolatorSize) {
            this.isolatorSize = isolatorSize;
        }

        public Equipment withIsolatorSize(Object isolatorSize) {
            this.isolatorSize = isolatorSize;
            return this;
        }

        public Object getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(Object supplierName) {
            this.supplierName = supplierName;
        }

        public Equipment withSupplierName(Object supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public Object getSupplierAddress() {
            return supplierAddress;
        }

        public void setSupplierAddress(Object supplierAddress) {
            this.supplierAddress = supplierAddress;
        }

        public Equipment withSupplierAddress(Object supplierAddress) {
            this.supplierAddress = supplierAddress;
            return this;
        }

        public Object getContactNo() {
            return contactNo;
        }

        public void setContactNo(Object contactNo) {
            this.contactNo = contactNo;
        }

        public Equipment withContactNo(Object contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public Object getFanRef() {
            return fanRef;
        }

        public void setFanRef(Object fanRef) {
            this.fanRef = fanRef;
        }

        public Equipment withFanRef(Object fanRef) {
            this.fanRef = fanRef;
            return this;
        }

        public Object getStaticPressure() {
            return staticPressure;
        }

        public void setStaticPressure(Object staticPressure) {
            this.staticPressure = staticPressure;
        }

        public Equipment withStaticPressure(Object staticPressure) {
            this.staticPressure = staticPressure;
            return this;
        }

        public Object getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public void setWarrantyPeriod(Object warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        public Equipment withWarrantyPeriod(Object warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;
        }

        public Object getDia() {
            return dia;
        }

        public void setDia(Object dia) {
            this.dia = dia;
        }

        public Equipment withDia(Object dia) {
            this.dia = dia;
            return this;
        }

        public Object getPower() {
            return power;
        }

        public void setPower(Object power) {
            this.power = power;
        }

        public Equipment withPower(Object power) {
            this.power = power;
            return this;
        }

        public Object getFullLoadCurrent() {
            return fullLoadCurrent;
        }

        public void setFullLoadCurrent(Object fullLoadCurrent) {
            this.fullLoadCurrent = fullLoadCurrent;
        }

        public Equipment withFullLoadCurrent(Object fullLoadCurrent) {
            this.fullLoadCurrent = fullLoadCurrent;
            return this;
        }

        public Object getCpRef() {
            return cpRef;
        }

        public void setCpRef(Object cpRef) {
            this.cpRef = cpRef;
        }

        public Equipment withCpRef(Object cpRef) {
            this.cpRef = cpRef;
            return this;
        }

        public Object getPowerRequirement() {
            return powerRequirement;
        }

        public void setPowerRequirement(Object powerRequirement) {
            this.powerRequirement = powerRequirement;
        }

        public Equipment withPowerRequirement(Object powerRequirement) {
            this.powerRequirement = powerRequirement;
            return this;
        }

        public Object getDrawingImage() {
            return drawingImage;
        }

        public void setDrawingImage(Object drawingImage) {
            this.drawingImage = drawingImage;
        }

        public Equipment withDrawingImage(Object drawingImage) {
            this.drawingImage = drawingImage;
            return this;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public Equipment withImage(Object image) {
            this.image = image;
            return this;
        }

        public Object getDateOfTagging() {
            return dateOfTagging;
        }

        public void setDateOfTagging(Object dateOfTagging) {
            this.dateOfTagging = dateOfTagging;
        }

        public Equipment withDateOfTagging(Object dateOfTagging) {
            this.dateOfTagging = dateOfTagging;
            return this;
        }

        public Object getBrand() {
            return brand;
        }

        public void setBrand(Object brand) {
            this.brand = brand;
        }

        public Equipment withBrand(Object brand) {
            this.brand = brand;
            return this;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Equipment withDescription(Object description) {
            this.description = description;
            return this;
        }

        public Object getEquipmenttracking() {
            return equipmenttracking;
        }

        public void setEquipmenttracking(Object equipmenttracking) {
            this.equipmenttracking = equipmenttracking;
        }

        public Equipment withEquipmenttracking(Object equipmenttracking) {
            this.equipmenttracking = equipmenttracking;
            return this;
        }

        public Object getCuLocation() {
            return cuLocation;
        }

        public void setCuLocation(Object cuLocation) {
            this.cuLocation = cuLocation;
        }

        public Equipment withCuLocation(Object cuLocation) {
            this.cuLocation = cuLocation;
            return this;
        }

        public Object getNameOfCondo() {
            return nameOfCondo;
        }

        public void setNameOfCondo(Object nameOfCondo) {
            this.nameOfCondo = nameOfCondo;
        }

        public Equipment withNameOfCondo(Object nameOfCondo) {
            this.nameOfCondo = nameOfCondo;
            return this;
        }

        public Object getCondoAddress() {
            return condoAddress;
        }

        public void setCondoAddress(Object condoAddress) {
            this.condoAddress = condoAddress;
        }

        public Equipment withCondoAddress(Object condoAddress) {
            this.condoAddress = condoAddress;
            return this;
        }

        public Object getNoOfHouseHolds() {
            return noOfHouseHolds;
        }

        public void setNoOfHouseHolds(Object noOfHouseHolds) {
            this.noOfHouseHolds = noOfHouseHolds;
        }

        public Equipment withNoOfHouseHolds(Object noOfHouseHolds) {
            this.noOfHouseHolds = noOfHouseHolds;
            return this;
        }

        public Object getLockerSize() {
            return lockerSize;
        }

        public void setLockerSize(Object lockerSize) {
            this.lockerSize = lockerSize;
        }

        public Equipment withLockerSize(Object lockerSize) {
            this.lockerSize = lockerSize;
            return this;
        }

        public Object getSerialNumberMain() {
            return serialNumberMain;
        }

        public void setSerialNumberMain(Object serialNumberMain) {
            this.serialNumberMain = serialNumberMain;
        }

        public Equipment withSerialNumberMain(Object serialNumberMain) {
            this.serialNumberMain = serialNumberMain;
            return this;
        }

        public Object getSubUnits() {
            return subUnits;
        }

        public void setSubUnits(Object subUnits) {
            this.subUnits = subUnits;
        }

        public Equipment withSubUnits(Object subUnits) {
            this.subUnits = subUnits;
            return this;
        }

        public Object getCompartmentCount() {
            return compartmentCount;
        }

        public void setCompartmentCount(Object compartmentCount) {
            this.compartmentCount = compartmentCount;
        }

        public Equipment withCompartmentCount(Object compartmentCount) {
            this.compartmentCount = compartmentCount;
            return this;
        }

        public Object getRouterPresent() {
            return routerPresent;
        }

        public void setRouterPresent(Object routerPresent) {
            this.routerPresent = routerPresent;
        }

        public Equipment withRouterPresent(Object routerPresent) {
            this.routerPresent = routerPresent;
            return this;
        }

        public Object getSimCardRegNo() {
            return simCardRegNo;
        }

        public void setSimCardRegNo(Object simCardRegNo) {
            this.simCardRegNo = simCardRegNo;
        }

        public Equipment withSimCardRegNo(Object simCardRegNo) {
            this.simCardRegNo = simCardRegNo;
            return this;
        }

        public Object getServiceProvider() {
            return serviceProvider;
        }

        public void setServiceProvider(Object serviceProvider) {
            this.serviceProvider = serviceProvider;
        }

        public Equipment withServiceProvider(Object serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }

        public Object getSoftwareVersion() {
            return softwareVersion;
        }

        public void setSoftwareVersion(Object softwareVersion) {
            this.softwareVersion = softwareVersion;
        }

        public Equipment withSoftwareVersion(Object softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

        public Object getInternalComponentsCount() {
            return internalComponentsCount;
        }

        public void setInternalComponentsCount(Object internalComponentsCount) {
            this.internalComponentsCount = internalComponentsCount;
        }

        public Equipment withInternalComponentsCount(Object internalComponentsCount) {
            this.internalComponentsCount = internalComponentsCount;
            return this;
        }

    }


    class Location {

        private Integer id;// = 6;
        private String name;// = "locationtest6";
        private String description;// = "locationtest6";
        private String streetName ;//= "Singapore";
        private Object lat;
        private Object lng;

        /**
         * No args constructor for use in serialization
         */
        public Location() {
        }

        /**
         * @param streetName
         * @param lng
         * @param name
         * @param description
         * @param id
         * @param lat
         */
        public Location(int id, String name, String description, String streetName, Object lat, Object lng) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
            this.streetName = streetName;
            this.lat = lat;
            this.lng = lng;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Location withId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location withName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Location withDescription(String description) {
            this.description = description;
            return this;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public Location withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Object getLat() {
            return lat;
        }

        public void setLat(Object lat) {
            this.lat = lat;
        }

        public Location withLat(Object lat) {
            this.lat = lat;
            return this;
        }

        public Object getLng() {
            return lng;
        }

        public void setLng(Object lng) {
            this.lng = lng;
        }

        public Location withLng(Object lng) {
            this.lng = lng;
            return this;
        }

    }


    class Workspace_ {

        private Integer id = 1;
        private String workspaceid = "cmms-DEM-082018-001";
        private String projectDesc = "DEM";
        private String buildDesc = "DEM";
        private String owner = "DEM";
        private String contractor = "DEM";
        private String bldgOwnerPayAmt = "6";
        private Object contractorPayAmt;
        private String startDate = "2022-02-23T18:30:00.000+0000";
        private String endDate = "2022-02-23T18:30:00.000+0000";
        private String projIMAGE = "7cb246f9-cedb-402d-8ae7-f78aac86168f.png";

        /**
         * No args constructor for use in serialization
         *
         */
              /*  public Workspace() {
                }*/

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace_(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace_ withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace_ withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace_ withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace_ withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace_ withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace_ withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace_ withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace_ withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace_ withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace_ withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace_ withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }

    class Workspace__1 {

        private Integer id;
        private String workspaceid;
        private String projectDesc;
        private String buildDesc;
        private String owner;
        private String contractor;
        private String bldgOwnerPayAmt;
        private Object contractorPayAmt;
        private String startDate;
        private String endDate;
        private String projIMAGE;

        /**
         * No args constructor for use in serialization
         */
        public Workspace__1() {
        }

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace__1(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace__1 withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace__1 withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace__1 withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace__1 withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace__1 withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace__1 withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace__1 withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace__1 withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace__1 withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace__1 withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace__1 withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }

    class Workspace__2 {

        private Integer id;
        private String workspaceid;
        private String projectDesc;
        private String buildDesc;
        private String owner;
        private String contractor;
        private String bldgOwnerPayAmt;
        private Object contractorPayAmt;
        private String startDate;
        private String endDate;
        private String projIMAGE;

        /**
         * No args constructor for use in serialization
         */
        public Workspace__2() {
        }

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace__2(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace__2 withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace__2 withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace__2 withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace__2 withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace__2 withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace__2 withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace__2 withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace__2 withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace__2 withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace__2 withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace__2 withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }

    class Workspace__3 {

        private Integer id;
        private String workspaceid;
        private String projectDesc;
        private String buildDesc;
        private String owner;
        private String contractor;
        private String bldgOwnerPayAmt;
        private Object contractorPayAmt;
        private String startDate;
        private String endDate;
        private String projIMAGE;

        /**
         * No args constructor for use in serialization
         */
        public Workspace__3() {
        }

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace__3(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace__3 withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace__3 withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace__3 withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace__3 withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace__3 withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace__3 withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace__3 withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace__3 withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace__3 withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace__3 withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace__3 withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }

    class Workspace__4 {

        private Integer id;
        private String workspaceid;
        private String projectDesc;
        private String buildDesc;
        private String owner;
        private String contractor;
        private String bldgOwnerPayAmt;
        private Object contractorPayAmt;
        private String startDate;
        private String endDate;
        private String projIMAGE;

        /**
         * No args constructor for use in serialization
         */
        public Workspace__4() {
        }

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace__4(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace__4 withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace__4 withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace__4 withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace__4 withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace__4 withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace__4 withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace__4 withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace__4 withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace__4 withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace__4 withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace__4 withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }

    class Workspace__5 {

        private Integer id;
        private String workspaceid;
        private String projectDesc;
        private String buildDesc;
        private String owner;
        private String contractor;
        private String bldgOwnerPayAmt;
        private Object contractorPayAmt;
        private String startDate;
        private String endDate;
        private String projIMAGE;

        /**
         * No args constructor for use in serialization
         */
        public Workspace__5() {
        }

        /**
         * @param owner
         * @param contractor
         * @param bldgOwnerPayAmt
         * @param endDate
         * @param buildDesc
         * @param projectDesc
         * @param contractorPayAmt
         * @param projIMAGE
         * @param id
         * @param startDate
         * @param workspaceid
         */
        public Workspace__5(Integer id, String workspaceid, String projectDesc, String buildDesc, String owner, String contractor, String bldgOwnerPayAmt, Object contractorPayAmt, String startDate, String endDate, String projIMAGE) {
            super();
            this.id = id;
            this.workspaceid = workspaceid;
            this.projectDesc = projectDesc;
            this.buildDesc = buildDesc;
            this.owner = owner;
            this.contractor = contractor;
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            this.contractorPayAmt = contractorPayAmt;
            this.startDate = startDate;
            this.endDate = endDate;
            this.projIMAGE = projIMAGE;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Workspace__5 withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getWorkspaceid() {
            return workspaceid;
        }

        public void setWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
        }

        public Workspace__5 withWorkspaceid(String workspaceid) {
            this.workspaceid = workspaceid;
            return this;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public Workspace__5 withProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }

        public String getBuildDesc() {
            return buildDesc;
        }

        public void setBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
        }

        public Workspace__5 withBuildDesc(String buildDesc) {
            this.buildDesc = buildDesc;
            return this;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Workspace__5 withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getContractor() {
            return contractor;
        }

        public void setContractor(String contractor) {
            this.contractor = contractor;
        }

        public Workspace__5 withContractor(String contractor) {
            this.contractor = contractor;
            return this;
        }

        public String getBldgOwnerPayAmt() {
            return bldgOwnerPayAmt;
        }

        public void setBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
        }

        public Workspace__5 withBldgOwnerPayAmt(String bldgOwnerPayAmt) {
            this.bldgOwnerPayAmt = bldgOwnerPayAmt;
            return this;
        }

        public Object getContractorPayAmt() {
            return contractorPayAmt;
        }

        public void setContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
        }

        public Workspace__5 withContractorPayAmt(Object contractorPayAmt) {
            this.contractorPayAmt = contractorPayAmt;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public Workspace__5 withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Workspace__5 withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public String getProjIMAGE() {
            return projIMAGE;
        }

        public void setProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
        }

        public Workspace__5 withProjIMAGE(String projIMAGE) {
            this.projIMAGE = projIMAGE;
            return this;
        }

    }


