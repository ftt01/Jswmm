package org.altervista.growworkinghard.jswmm.dataStructure.options;

public class ProjectUnits {

    private enum Units{
        CFS,
        GPM,
        MGD,
        CMS,
        LPS,
        MLD
    }

    private String currentUnits;

    public ProjectUnits(String units){
        this.currentUnits = units;
    }
}