package org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.linkObjects;

public class Conduit extends AbstractLinks {

    String crossSectionID;

    public enum Shape {
        CIRCULAR
    }

    Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    Double diameter;

    public String getCrossSectionID() {
        return crossSectionID;
    }

    public void setCrossSectionID(String crossSectionID) {
        this.crossSectionID = crossSectionID;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}
