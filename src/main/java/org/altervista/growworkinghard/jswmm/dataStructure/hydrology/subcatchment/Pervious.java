package org.altervista.growworkinghard.jswmm.dataStructure.hydrology.subcatchment;

public class Pervious extends Subarea {

    public Pervious(String ID, Double slope) {
        super(ID);
        super.slope = slope;
    }

    public void evaluateAlpha() {
        super.alpha = 5.0;
    }
}
