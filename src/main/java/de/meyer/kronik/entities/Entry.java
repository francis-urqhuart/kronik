package de.meyer.kronik.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastModifiedDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar tillDate;

    private Long weight;

    private int mgDlBloodSugar;

    private Long mmolBloodSugar;

    private Long bolusInsulin;

    private Long basalInsulin;

    private boolean beforeActivity;

    private boolean beforeMeal;

    @Column(length = 300)
    private String descActivity;

    @Column(length = 300)
    private String descMeal;

    private int carboHydrates;

    @Column(length = 300)
    private String remark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private User entryOwner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getFromDate() {
        return fromDate;
    }

    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }

    public Calendar getTillDate() {
        return tillDate;
    }

    public void setTillDate(Calendar tillDate) {
        this.tillDate = tillDate;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public int getMgDlBloodSugar() {
        return mgDlBloodSugar;
    }

    public void setMgDlBloodSugar(int mgDlBloodSugar) {
        this.mgDlBloodSugar = mgDlBloodSugar;
    }

    public Long getMmolBloodSugar() {
        return mmolBloodSugar;
    }

    public void setMmolBloodSugar(Long mmolBloodSugar) {
        this.mmolBloodSugar = mmolBloodSugar;
    }

    public Long getBolusInsulin() {
        return bolusInsulin;
    }

    public void setBolusInsulin(Long bolusInsulin) {
        this.bolusInsulin = bolusInsulin;
    }

    public Long getBasalInsulin() {
        return basalInsulin;
    }

    public void setBasalInsulin(Long basalInsulin) {
        this.basalInsulin = basalInsulin;
    }

    public boolean isBeforeActivity() {
        return beforeActivity;
    }

    public void setBeforeActivity(boolean beforeActivity) {
        this.beforeActivity = beforeActivity;
    }

    public boolean isBeforeMeal() {
        return beforeMeal;
    }

    public void setBeforeMeal(boolean beforeMeal) {
        this.beforeMeal = beforeMeal;
    }

    public String getDescActivity() {
        return descActivity;
    }

    public void setDescActivity(String descActivity) {
        this.descActivity = descActivity;
    }

    public String getDescMeal() {
        return descMeal;
    }

    public void setDescMeal(String descMeal) {
        this.descMeal = descMeal;
    }

    public int getCarboHydrates() {
        return carboHydrates;
    }

    public void setCarboHydrates(int carboHydrates) {
        this.carboHydrates = carboHydrates;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User getEntryOwner() {
        return entryOwner;
    }

    public void setEntryOwner(User entryOwner) {
        this.entryOwner = entryOwner;
    }
}

