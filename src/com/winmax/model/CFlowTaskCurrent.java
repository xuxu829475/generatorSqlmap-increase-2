package com.winmax.model;

import java.io.Serializable;
import java.util.Date;

public class CFlowTaskCurrent implements Serializable {
    private Long id;

    /**
     * 流程id
     */
    private Long processId;

    /**
     * 业务id
     */
    private Long busiId;

    /**
     * 业务类型（1：付款审批流程）
     */
    private Integer busiType;

    /**
     * 当前任务（处理后任务）id
     */
    private Long currentTaskId;

    /**
     * 流程是否结束（1：未结束 2：结束）
     */
    private Integer finishFlag;

    /**
     * 数据有效性=={0:已删除,1:有效}
     */
    private Integer voidFlag;

    /**
     * 创建人
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date createdDate;

    /**
     * 修改人
     */
    private Long modifiedBy;

    /**
     * 修改时间
     */
    private Date modifiedDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getBusiId() {
        return busiId;
    }

    public void setBusiId(Long busiId) {
        this.busiId = busiId;
    }

    public Integer getBusiType() {
        return busiType;
    }

    public void setBusiType(Integer busiType) {
        this.busiType = busiType;
    }

    public Long getCurrentTaskId() {
        return currentTaskId;
    }

    public void setCurrentTaskId(Long currentTaskId) {
        this.currentTaskId = currentTaskId;
    }

    public Integer getFinishFlag() {
        return finishFlag;
    }

    public void setFinishFlag(Integer finishFlag) {
        this.finishFlag = finishFlag;
    }

    public Integer getVoidFlag() {
        return voidFlag;
    }

    public void setVoidFlag(Integer voidFlag) {
        this.voidFlag = voidFlag;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processId=").append(processId);
        sb.append(", busiId=").append(busiId);
        sb.append(", busiType=").append(busiType);
        sb.append(", currentTaskId=").append(currentTaskId);
        sb.append(", finishFlag=").append(finishFlag);
        sb.append(", voidFlag=").append(voidFlag);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}