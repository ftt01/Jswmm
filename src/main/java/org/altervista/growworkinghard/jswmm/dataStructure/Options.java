package org.altervista.growworkinghard.jswmm.dataStructure;


public class Options {

    public ProjectUnits units;

    public enum OffsetConvention {
        DEPTH,
        ELEVATION
    }
    private OffsetConvention offsetConvention;

    private boolean ignoreRainfall;

    private boolean ignoreSnowmelt;

    private boolean ignoreGroundwater;

    private boolean ignoreRDII;

    private boolean ignoreRouting;

    private boolean ignoreQuality;

    private boolean allowPonding;

    private InfiltrationSetup infiltrationModel;

    private RoutingSetup routingModel;

    private SteadyStateOptions steadyStateOptions;

    private TimeSetup timeOptions;

    private int numberOfThreads;

    private String temporaryDirectory;
}
