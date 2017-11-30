package org.altervista.growworkinghard.jswmm.dataStructure;

public interface RoutingSetup {

    public enum RoutingModel {
        STEADY,
        DYNAMICWAVE,
        KINEMATICWAVE
    }
    RoutingModel routingModel = null;


    private String forceMainEquation;

    private Double lengtheningStep;

    private Double variableStep;

    private Double minimumStep;

    public enum InertialDamping {
        NONE,
        PARTIAL,
        FULL
    }

    private InertialDamping inertialDamping;

    public enum NormalFlowLimited {
        SLOPE,
        FROUDE,
        BOTH
    }

    private NormalFlowLimited normalFlowLimited;

    private Double minimumSurfaceArea;

    private Double minimumSlope;

    private int maximumTrialsHead;

    private Double headRelativeTolerance;
}