package org.motechproject.mobile.core.model;

import java.util.Date;
import java.util.Set;

/**
 * MesasgeRequestImpl class is an implementation of MessageRequest interface which is actually
 * mapped in hibernate.It provides properties to handle MessageRequest operations
 *  Date : Sep 25, 2009
 * @author joseph Djomeda (joseph@dreamoval.com)
 */
public class MessageRequestImpl extends MotechEntityImpl implements MessageRequest {

    private Language language;
    private Date schedule;
    private MessageType messageType;
    private String p13nData;
    private NotificationType notificationType;
    private Date dateCreated;
    private Date dateProcessed;
    private String recipientName;
    private String recipientNumber;
    private Date dateFrom;
    private Date dateTo;
    private MStatus status;
    private int tryNumber;
    private String requestId;
    private Set persInfos;
    private Date lastModified;

    /**
     * @return the language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * @return the schedule
     */
    public Date getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    /**
     * @return the message_type
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * @param message_type the message_type to set
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    /**
     * @return the p13nData
     */
    public String getP13nData() {
        return p13nData;
    }

    /**
     * @param p13nData the p13nData to set
     */
    public void setP13nData(String p13nData) {
        this.p13nData = p13nData;
    }

    /**
     * @return the notificationType
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * @param notificationType the notificationType to set
     */
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the dateProcessed
     */
    public Date getDateProcessed() {
        return dateProcessed;
    }

    /**
     * @param dateProcessed the dateProcessed to set
     */
    public void setDateProcessed(Date dateProcessed) {
        this.dateProcessed = dateProcessed;
    }

    /**
     * @return the recipientName
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * @param recipientName the recipientName to set
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * @return the recipientNumber
     */
    public String getRecipientNumber() {
        return recipientNumber;
    }

    /**
     * @param recipientNumber the recipientNumber to set
     */
    public void setRecipientNumber(String recipientNumber) {
        this.recipientNumber = recipientNumber;
    }

    /**
     * @return the dateFrom
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * @param dateFrom the dateFrom to set
     */
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * @return the dateTo
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * @param dateTo the dateTo to set
     */
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * @return the status
     */
    public MStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(MStatus status) {
        this.status = status;
    }

    /**
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return the persInfos
     */
    public Set getPersInfos() {
        return persInfos;
    }

    /**
     * @param persInfos the persInfos to set
     */
    public void setPersInfos(Set persInfos) {
        this.persInfos = persInfos;
    }

    /**
     * @return the tryNumber
     */
    public int getTryNumber() {
        return tryNumber;
    }

    /**
     * @param tryNumber the tryNumber to set
     */
    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    /**
     * @return the lastModified
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");

        if (this != null) {
            sb.append((this.getId() != null) ? "key=Id value=" + this.getId().toString() : "Id is null ");
            sb.append(newLine);
            sb.append((this.language != null) ? "key=Language.Id value=" + this.language.getId() : "Language is null ");
            sb.append(newLine);
            sb.append((this.notificationType != null) ? "key=NotificationType.Id value=" + this.notificationType.getId() : "NotificationType is null ");
            sb.append(newLine);
            sb.append((this.recipientName != null) ? "key=message value=" + this.recipientName : "recipientName is null  ");
            sb.append(newLine);
            sb.append((this.recipientNumber != null) ? "key=recipientNumber value=" + this.recipientNumber : "recipientNumber is null ");
            sb.append(newLine);
            sb.append((this.requestId != null) ? "key=requestId value=" + this.requestId : "requestId is null ");
            sb.append(newLine);
            sb.append((this.p13nData != null) ? "key=p13nData value=" + this.p13nData : "p13nData is null ");
            sb.append(newLine);

//           sb.append((this.persInfos.isEmpty() ) ? "key=persInfos length=" + Integer.toString(this.persInfos.size()) : "persInfos is empty ");
//           sb.append(newLine);


            sb.append((this.schedule != null) ? "key=schedule value=" + this.schedule.toString() : "schedule is null ");
            sb.append(newLine);
            sb.append((this.dateTo != null) ? "key=dateTo value=" + this.dateTo.toString() : "dateTo is null ");
            sb.append(newLine);
            sb.append((this.dateFrom != null) ? "key=dateFrom value=" + this.dateFrom.toString() : "dateFrom is null ");
            sb.append(newLine);
            sb.append((this.dateProcessed != null) ? "key=dateProcessed value=" + this.dateProcessed.toString() : "dateProcessed is null ");
            sb.append(newLine);
            sb.append((this.lastModified != null) ? "key=lastModified value=" + this.lastModified.toString() : "lastModified is null ");
            sb.append(newLine);
            sb.append((this.messageType != null) ? "key=messageType value=" + this.messageType.toString() : "messageType is null ");
            sb.append(newLine);
            sb.append((this.status != null) ? "key=status value=" + this.status.toString() : "status is null ");
            sb.append(newLine);

            return sb.toString();

        } else {
            return "Object is null";
        }

    }
}