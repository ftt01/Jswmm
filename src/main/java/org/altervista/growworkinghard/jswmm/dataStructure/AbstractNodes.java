package org.altervista.growworkinghard.jswmm.dataStructure;

public abstract class AbstractNodes implements INPlocator {
    String junctionName;
    Double junctionElevation;
    Double maximumDepthNode;
    Double initialdepthNode;
    Double maximumDepthSurcharge;
    Double pondingArea;

    public Outfall outfall;

    public String getJunctionName() {
        return junctionName;
    }

    public void setJunctionName(String junctionName) {
        this.junctionName = junctionName;
    }

    public Double getJunctionElevation() {
        return junctionElevation;
    }

    public void setJunctionElevation(Double junctionElevation) {
        this.junctionElevation = junctionElevation;
    }

    public Double getMaximumDepthNode() {
        return maximumDepthNode;
    }

    public void setMaximumDepthNode(Double maximumDepthNode) {
        this.maximumDepthNode = maximumDepthNode;
    }

    public Double getInitialdepthNode() {
        return initialdepthNode;
    }

    public void setInitialdepthNode(Double initialdepthNode) {
        this.initialdepthNode = initialdepthNode;
    }

    public Double getMaximumDepthSurcharge() {
        return maximumDepthSurcharge;
    }

    public void setMaximumDepthSurcharge(Double maximumDepthSurcharge) {
        this.maximumDepthSurcharge = maximumDepthSurcharge;
    }

    public Double getPondingArea() {
        return pondingArea;
    }

    public void setPondingArea(Double pondingArea) {
        this.pondingArea = pondingArea;
    }
}
