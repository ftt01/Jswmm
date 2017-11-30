package org.altervista.growworkinghard.jswmm.dataStructure;

class SteadyStateOptions {

    private boolean skipSteadyState;

    public void setSkipSteadyState(boolean skipSteadyState) {
        this.skipSteadyState = skipSteadyState;
    }

    public boolean isSkipSteadyState() {
        return skipSteadyState;
    }


    private Double totalSystemFlowTolerance;

    public void setTotalSystemFlowTolerance(Double totalSystemFlowTolerance) {
        this.totalSystemFlowTolerance = totalSystemFlowTolerance;
    }

    public Double getTotalSystemFlowTolerance() {
        return totalSystemFlowTolerance;
    }


    private Double totalLateralFlowTolerance;

    public void setTotalLateralFlowTolerance(Double totalLateralFlowTolerance) {
        this.totalLateralFlowTolerance = totalLateralFlowTolerance;
    }

    public Double getTotalLateralFlowTolerance() {
        return totalLateralFlowTolerance;
    }


    public SteadyStateOptions(boolean skipSteadyState, Double totalSystemFlowTolerance, Double totalLateralFlowTolerance){
        this.skipSteadyState = skipSteadyState;
        this.totalLateralFlowTolerance = totalLateralFlowTolerance;
        this.totalSystemFlowTolerance = totalSystemFlowTolerance;
    }
}
