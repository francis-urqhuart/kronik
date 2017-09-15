package de.meyer.kronik.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date tillDate;

    private Long weight;

    private int mgDlBloodSugar;

    private double mmolBloodSugar;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;

        Entry entry = (Entry) o;

        if (mgDlBloodSugar != entry.mgDlBloodSugar) return false;
        if (beforeActivity != entry.beforeActivity) return false;
        if (beforeMeal != entry.beforeMeal) return false;
        if (carboHydrates != entry.carboHydrates) return false;
        if (!id.equals(entry.id)) return false;
        if (!createdDate.equals(entry.createdDate)) return false;
        if (!lastModifiedDate.equals(entry.lastModifiedDate)) return false;
        if (!fromDate.equals(entry.fromDate)) return false;
        if (tillDate != null ? !tillDate.equals(entry.tillDate) : entry.tillDate != null) return false;
        if (weight != null ? !weight.equals(entry.weight) : entry.weight != null) return false;
        if (!mmolBloodSugar.equals(entry.mmolBloodSugar)) return false;
        if (bolusInsulin != null ? !bolusInsulin.equals(entry.bolusInsulin) : entry.bolusInsulin != null) return false;
        if (basalInsulin != null ? !basalInsulin.equals(entry.basalInsulin) : entry.basalInsulin != null) return false;
        if (descActivity != null ? !descActivity.equals(entry.descActivity) : entry.descActivity != null) return false;
        if (descMeal != null ? !descMeal.equals(entry.descMeal) : entry.descMeal != null) return false;
        if (remark != null ? !remark.equals(entry.remark) : entry.remark != null) return false;
        return entryOwner.equals(entry.entryOwner);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + lastModifiedDate.hashCode();
        result = 31 * result + fromDate.hashCode();
        result = 31 * result + (tillDate != null ? tillDate.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + mgDlBloodSugar;
        result = 31 * result + mmolBloodSugar.hashCode();
        result = 31 * result + (bolusInsulin != null ? bolusInsulin.hashCode() : 0);
        result = 31 * result + (basalInsulin != null ? basalInsulin.hashCode() : 0);
        result = 31 * result + (beforeActivity ? 1 : 0);
        result = 31 * result + (beforeMeal ? 1 : 0);
        result = 31 * result + (descActivity != null ? descActivity.hashCode() : 0);
        result = 31 * result + (descMeal != null ? descMeal.hashCode() : 0);
        result = 31 * result + carboHydrates;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + entryOwner.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", fromDate=" + fromDate +
                ", tillDate=" + tillDate +
                ", weight=" + weight +
                ", mgDlBloodSugar=" + mgDlBloodSugar +
                ", mmolBloodSugar=" + mmolBloodSugar +
                ", bolusInsulin=" + bolusInsulin +
                ", basalInsulin=" + basalInsulin +
                ", beforeActivity=" + beforeActivity +
                ", beforeMeal=" + beforeMeal +
                ", descActivity='" + descActivity + '\'' +
                ", descMeal='" + descMeal + '\'' +
                ", carboHydrates=" + carboHydrates +
                ", remark='" + remark + '\'' +
                ", entryOwner=" + entryOwner +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getTillDate() {
        return tillDate;
    }

    public void setTillDate(Date tillDate) {
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

    public double getMmolBloodSugar() {
        return mmolBloodSugar;
    }

    public void setMmolBloodSugar(double mmolBloodSugar) {
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

