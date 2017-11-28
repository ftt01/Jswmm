package org.altervista.growworkinghard.jswmm.dataStructure.options;

public class RoutingSetup {

    private String routingModel;

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

    public RoutingSetup(String routingModel, String forceMainEquation,
                 Double lengtheningStep, Double variableStep,
                 Double minimumStep, InertialDamping inertialDamping, NormalFlowLimited normalFlowLimited,
                 Double minimumSurfaceArea, Double minimumSlope, int maximumTrialsHead, Double headRelativeTolerance) {

        this.routingModel = routingModel;
        this.forceMainEquation = forceMainEquation;
        this.lengtheningStep = lengtheningStep;
        this.variableStep = variableStep;
        this.minimumStep = minimumStep;
        this.inertialDamping = inertialDamping;
        this.normalFlowLimited = normalFlowLimited;
        this.minimumSurfaceArea = minimumSurfaceArea;
        this.minimumSlope = minimumSlope;
        this.maximumTrialsHead = maximumTrialsHead;
        this.headRelativeTolerance = headRelativeTolerance;
    }

    public void setRoutingModel(String routingModel) {
        this.routingModel = routingModel;
    }

    public void setForceMainEquation(String forceMainEquation) {
        this.forceMainEquation = forceMainEquation;
    }

    public void setLengtheningStep(Double lengtheningStep) {
        this.lengtheningStep = lengtheningStep;
    }

    public void setVariableStep(Double variableStep) {
        this.variableStep = variableStep;
    }

    public void setMinimumStep(Double minimumStep) {
        this.minimumStep = minimumStep;
    }

    public void setInertialDamping(InertialDamping inertialDamping) {
        this.inertialDamping = inertialDamping;
    }

    public void setNormalFlowLimited(NormalFlowLimited normalFlowLimited) {
        this.normalFlowLimited = normalFlowLimited;
    }

    public void setMinimumSurfaceArea(Double minimumSurfaceArea) {
        this.minimumSurfaceArea = minimumSurfaceArea;
    }

    public void setMinimumSlope(Double minimumSlope) {
        this.minimumSlope = minimumSlope;
    }

    public void setMaximumTrialsHead(int maximumTrialsHead) {
        this.maximumTrialsHead = maximumTrialsHead;
    }

    public void setHeadRelativeTolerance(Double headRelativeTolerance) {
        this.headRelativeTolerance = headRelativeTolerance;
    }

    public String getRoutingModel() {
        return routingModel;
    }

    public String getForceMainEquation() {
        return forceMainEquation;
    }

    public Double getLengtheningStep() {
        return lengtheningStep;
    }

    public Double getVariableStep() {
        return variableStep;
    }

    public Double getMinimumStep() {
        return minimumStep;
    }

    public InertialDamping getInertialDamping() {
        return inertialDamping;
    }

    public NormalFlowLimited getNormalFlowLimited() {
        return normalFlowLimited;
    }

    public Double getMinimumSurfaceArea() {
        return minimumSurfaceArea;
    }

    public Double getMinimumSlope() {
        return minimumSlope;
    }

    public int getMaximumTrialsHead() {
        return maximumTrialsHead;
    }

    public Double getHeadRelativeTolerance() {
        return headRelativeTolerance;
    }
}