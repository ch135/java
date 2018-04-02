package com.hotel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseApplyInformation implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer houseId;

    private Date livingTime;

    private Date leftTime;

    private Byte number;

    private BigDecimal money;

    private String phoneNumber;

    private String name;

    private String houseNumber;

    private Byte status;

    private Date gmtCteat;

    private Date gmtModeify;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Date getLivingTime() {
        return livingTime;
    }

    public void setLivingTime(Date livingTime) {
        this.livingTime = livingTime;
    }

    public Date getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Date leftTime) {
        this.leftTime = leftTime;
    }

    public Byte getNumber() {
        return number;
    }

    public void setNumber(Byte number) {
        this.number = number;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getGmtCteat() {
        return gmtCteat;
    }

    public void setGmtCteat(Date gmtCteat) {
        this.gmtCteat = gmtCteat;
    }

    public Date getGmtModeify() {
        return gmtModeify;
    }

    public void setGmtModeify(Date gmtModeify) {
        this.gmtModeify = gmtModeify;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HouseApplyInformation other = (HouseApplyInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHouseId() == null ? other.getHouseId() == null : this.getHouseId().equals(other.getHouseId()))
            && (this.getLivingTime() == null ? other.getLivingTime() == null : this.getLivingTime().equals(other.getLivingTime()))
            && (this.getLeftTime() == null ? other.getLeftTime() == null : this.getLeftTime().equals(other.getLeftTime()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHouseNumber() == null ? other.getHouseNumber() == null : this.getHouseNumber().equals(other.getHouseNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCteat() == null ? other.getGmtCteat() == null : this.getGmtCteat().equals(other.getGmtCteat()))
            && (this.getGmtModeify() == null ? other.getGmtModeify() == null : this.getGmtModeify().equals(other.getGmtModeify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHouseId() == null) ? 0 : getHouseId().hashCode());
        result = prime * result + ((getLivingTime() == null) ? 0 : getLivingTime().hashCode());
        result = prime * result + ((getLeftTime() == null) ? 0 : getLeftTime().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHouseNumber() == null) ? 0 : getHouseNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGmtCteat() == null) ? 0 : getGmtCteat().hashCode());
        result = prime * result + ((getGmtModeify() == null) ? 0 : getGmtModeify().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", houseId=").append(houseId);
        sb.append(", livingTime=").append(livingTime);
        sb.append(", leftTime=").append(leftTime);
        sb.append(", number=").append(number);
        sb.append(", money=").append(money);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", name=").append(name);
        sb.append(", houseNumber=").append(houseNumber);
        sb.append(", status=").append(status);
        sb.append(", gmtCteat=").append(gmtCteat);
        sb.append(", gmtModeify=").append(gmtModeify);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}