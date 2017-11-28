package org.altervista.growworkinghard.jswmm.dataStructure.options;

import java.time.Instant;

public class Options {

    private ProjectUnits units;

    public void setUnits(ProjectUnits units) {
        this.units = units;
    }

    public ProjectUnits getUnits() {
        return units;
    }



    private String offsetConvention;

    public void setOffsetConvention(String offsetConvention) {
        this.offsetConvention = offsetConvention;
    }

    public String getOffsetConvention() {
        return offsetConvention;
    }



    private boolean ignoreRainfall;

    public void setIgnoreRainfall(boolean ignoreRainfall) {
        this.ignoreRainfall = ignoreRainfall;
    }

    public boolean isIgnoreRainfall() {
        return ignoreRainfall;
    }



    private boolean ignoreSnowmelt;

    public void setIgnoreSnowmelt(boolean ignoreSnowmelt) {
        this.ignoreSnowmelt = ignoreSnowmelt;
    }

    public boolean isIgnoreSnowmelt() {
        return ignoreSnowmelt;
    }



    private boolean ignoreGroundwater;

    public void setIgnoreGroundwater(boolean ignoreGroundwater) {
        this.ignoreGroundwater = ignoreGroundwater;
    }

    public boolean isIgnoreGroundwater() {
        return ignoreGroundwater;
    }



    private boolean ignoreRDII;

    public void setIgnoreRDII(boolean ignoreRDII) {
        this.ignoreRDII = ignoreRDII;
    }

    public boolean isIgnoreRDII() {
        return ignoreRDII;
    }



    private boolean ignoreRouting;

    public void setIgnoreRouting(boolean ignoreRouting) {
        this.ignoreRouting = ignoreRouting;
    }

    public boolean isIgnoreRouting() {
        return ignoreRouting;
    }


    private boolean ignoreQuality;

    public void setIgnoreQuality(boolean ignoreQuality) {
        this.ignoreQuality = ignoreQuality;
    }

    public boolean isIgnoreQuality() {
        return ignoreQuality;
    }



    private boolean allowPonding;

    public void setAllowPonding(boolean allowPonding) {
        this.allowPonding = allowPonding;
    }

    public boolean isAllowPonding() {
        return allowPonding;
    }



    private InfiltrationSetup infiltrationModel;

    public void setInfiltrationModel(String infiltrationModel){
        this.infiltrationModel = new InfiltrationSetup(infiltrationModel);
    }

    public InfiltrationSetup getInfiltrationModel() {
        return infiltrationModel;
    }



    private RoutingSetup routingModel;

    public void setRoutingModel(String routingModel, String forceMainEquation,
                                Double lengtheningStep, Double variableStep,
                                Double minimumStep, RoutingSetup.InertialDamping inertialDamping,
                                RoutingSetup.NormalFlowLimited normalFlowLimited,
                                Double minimumSurfaceArea, Double minimumSlope,
                                int maximumTrialsHead, Double headRelativeTolerance){

        this.routingModel = new RoutingSetup(routingModel, forceMainEquation,
                lengtheningStep, variableStep, minimumStep, inertialDamping, normalFlowLimited,
                minimumSurfaceArea, minimumSlope, maximumTrialsHead, headRelativeTolerance);
    }

    public RoutingSetup getRoutingModel() {
        return routingModel;
    }



    private SteadyStateOptions steadyStateOptions;

    public void setSteadyStateOptions(boolean skipSteadyState, Double totalSystemFlowTolerance, Double totalLateralFlowTolerance) {
        steadyStateOptions = new SteadyStateOptions(skipSteadyState, totalSystemFlowTolerance, totalLateralFlowTolerance);
    }

    public SteadyStateOptions getSteadyStateOptions() {
        return steadyStateOptions;
    }



    private TimeSetup timeOptions;

    public void setTimeOptions(Instant startDate, Instant endDate,
                               Instant reportStartDate, Instant reportEndDate,
                               Instant sweepStart, Instant sweepEnd,
                               int dryDays, Double reportStepSize,
                               Double wetStepSize, Double dryStepSize,
                               Double routingStepSize) {

        this.timeOptions = new TimeSetup( startDate, endDate, reportStartDate, reportEndDate,
                sweepStart, sweepEnd, dryDays, reportStepSize, wetStepSize, dryStepSize, routingStepSize );
    }

    public TimeSetup getTimeOptions() {
        return timeOptions;
    }



    private int numberOfThreads;

    public void setNumberOfThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    public int getNumberOfThreads() {
        return numberOfThreads;
    }



    private String temporaryDirectory;

    public void setTemporaryDirectory(String temporaryDirectory) {
        this.temporaryDirectory = temporaryDirectory;
    }

    public String getTemporaryDirectory() {
        return temporaryDirectory;
    }

}
