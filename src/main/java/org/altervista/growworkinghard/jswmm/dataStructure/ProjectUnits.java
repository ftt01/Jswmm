package org.altervista.growworkinghard.jswmm.dataStructure;

public class ProjectUnits {

    public enum Units{
        CFS,
        GPM,
        MGD,
        CMS,
        LPS,
        MLD
    }

    private Units currentUnits;

    public Units getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(Units currentUnits) {
        this.currentUnits = currentUnits;
    }
}