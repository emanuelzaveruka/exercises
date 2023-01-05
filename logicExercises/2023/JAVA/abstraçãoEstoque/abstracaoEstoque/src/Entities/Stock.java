package Entities;

import java.util.Date;

public class Stock {

    private Integer MAXSTORAGE;

    private Integer ID;

    private String establishment;

    private Integer CURRENTSTORAGE;

    private Date lastStovkMoviment;

    private Employee responsable;

    public Stock(Employee responsable) {
        this.responsable = responsable;
    }

    public Integer getMAXSTORAGE() {
        return MAXSTORAGE;
    }

    public void setMAXSTORAGE(Integer MAXSTORAGE) {
        this.MAXSTORAGE = MAXSTORAGE;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public Integer getCURRENTSTORAGE() {
        return CURRENTSTORAGE;
    }

    public void setCURRENTSTORAGE(Integer CURRENTSTORAGE) {
        this.CURRENTSTORAGE = CURRENTSTORAGE;
    }

    public Date getLastStovkMoviment() {
        return lastStovkMoviment;
    }

    public void setLastStovkMoviment(Date lastStovkMoviment) {
        this.lastStovkMoviment = lastStovkMoviment;
    }

    public Employee getResponsable() {
        return responsable;
    }

    public void setResponsable(Employee responsable) {
        this.responsable = responsable;
    }
}
