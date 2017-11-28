package org.altervista.growworkinghard.jswmm.dataStructure.hydrology.subcatchment;

import java.util.zip.DeflaterOutputStream;

public abstract class AbstractSubcatchments {
    public String subcatchmentID;

    String raingageName;
    String receiverRunoffID;

    Double areaSubcatchment;
    Double imperviounessPercentage;
    Double characteristicWidth;
    Double subcatchmentSlope;
    Double totalCurbLength;
    SnowPack snowPack;

    public String getSubcatchmentID() {
        return subcatchmentID;
    }

    public void setSubcatchmentID(String subcatchmentID) {
        this.subcatchmentID = subcatchmentID;
    }

    public String getRaingageName() {
        return raingageName;
    }

    public void setRaingageName(String raingageName) {
        this.raingageName = raingageName;
    }

    public String getReceiverRunoffID() {
        return receiverRunoffID;
    }

    public void setReceiverRunoffID(String receiverRunoffID) {
        this.receiverRunoffID = receiverRunoffID;
    }

    public Double getAreaSubcatchment() {
        return areaSubcatchment;
    }

    public void setAreaSubcatchment(Double areaSubcatchment) {
        this.areaSubcatchment = areaSubcatchment;
    }

    public Double getImperviounessPercentage() {
        return imperviounessPercentage;
    }

    public void setImperviounessPercentage(Double imperviounessPercentage) {
        this.imperviounessPercentage = imperviounessPercentage;
    }

    public Double getCharacteristicWidth() {
        return characteristicWidth;
    }

    public void setCharacteristicWidth(Double characteristicWidth) {
        this.characteristicWidth = characteristicWidth;
    }

    public Double getSubcatchmentSlope() {
        return subcatchmentSlope;
    }

    public void setSubcatchmentSlope(Double subcatchmentSlope) {
        this.subcatchmentSlope = subcatchmentSlope;
    }

    public Double getTotalCurbLength() {
        return totalCurbLength;
    }

    public void setTotalCurbLength(Double totalCurbLength) {
        this.totalCurbLength = totalCurbLength;
    }

    public SnowPack getSnowPack() {
        return snowPack;
    }

    public void setSnowPack(SnowPack snowPack) {
        this.snowPack = snowPack;
    }

    /*
    public Subarea subareas;
    //public Acquifer acquifer;


    public String outputToSubcatchment;

    public Double subcatchmentArea;
    public Double subcatchmentIdealWidth;
    public Double subcatchmentSlope;

    public Double imperviousPercentage;

    Double[] rainfall;
    Double[] evaporation;
    Double[] infiltration;

    Double[] runonFromSubcatchment;

    Double curbLength;
    Double initialBuildup;

    public Double runoffStepSize = null;

    //adapt all rainfall data to each runoffStepSize

*/
}
