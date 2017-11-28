package org.altervista.growworkinghard.jswmm.dataStructure.hydrology.subcatchment;

import org.altervista.growworkinghard.jswmm.dataStructure.options.RoutingSetup;

public class Subarea extends AbstractSubcatchments {

    public String subareaID;
    Double manningImpervious;
    Double manningPervious;

    Double depressionStorageImpervious;
    Double depressionStoragePervious;
    Double noDespressionStorageImpervious;

    public enum RouteTo {
        IMPERVIOUS,
        PERVIOUS,
        OUTLET
    }

    RouteTo routeTo;
    Double percentageRouted;

    public String getSubareaID() {
        return subareaID;
    }

    public void setSubareaID(String subareaID) {
        this.subareaID = subareaID;
    }

    public Double getManningImpervious() {
        return manningImpervious;
    }

    public void setManningImpervious(Double manningImpervious) {
        this.manningImpervious = manningImpervious;
    }

    public Double getManningPervious() {
        return manningPervious;
    }

    public void setManningPervious(Double manningPervious) {
        this.manningPervious = manningPervious;
    }

    public Double getDepressionStorageImpervious() {
        return depressionStorageImpervious;
    }

    public void setDepressionStorageImpervious(Double depressionStorageImpervious) {
        this.depressionStorageImpervious = depressionStorageImpervious;
    }

    public Double getDepressionStoragePervious() {
        return depressionStoragePervious;
    }

    public void setDepressionStoragePervious(Double depressionStoragePervious) {
        this.depressionStoragePervious = depressionStoragePervious;
    }

    public Double getNoDespressionStorageImpervious() {
        return noDespressionStorageImpervious;
    }

    public void setNoDespressionStorageImpervious(Double noDespressionStorageImpervious) {
        this.noDespressionStorageImpervious = noDespressionStorageImpervious;
    }

    public RouteTo getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(RouteTo routeTo) {
        this.routeTo = routeTo;
    }

    public Double getPercentageRouted() {
        return percentageRouted;
    }

    public void setPercentageRouted(Double percentageRouted) {
        this.percentageRouted = percentageRouted;
    }

    /*
    public Double slope;
    public Double alpha;

    public Pervious pervious;
    public ImperviousWithoutStorage imperviousWithoutStorage;
    public ImperviousWithStorage imperviousWithStorage;*/
}
