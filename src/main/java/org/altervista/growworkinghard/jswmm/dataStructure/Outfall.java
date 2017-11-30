package org.altervista.growworkinghard.jswmm.dataStructure;

public class Outfall extends AbstractNodes {
    public enum OutfallType {
        FREE,
        NORMAL,
        FIXED,
        TIDAL,
        TIMESERIES
    }

    OutfallType outfallType;

    public OutfallType getOutfallType() {
        return outfallType;
    }

    public void setOutfallType(OutfallType outfallType) {
        this.outfallType = outfallType;
    }

    String curveTidal;
    String timeseriesOutfall;
    boolean gated;
    String routeTo;

    public String getCurveTidal() {
        return curveTidal;
    }

    public void setCurveTidal(String curveTidal) {
        this.curveTidal = curveTidal;
    }

    public String getTimeseriesOutfall() {
        return timeseriesOutfall;
    }

    public void setTimeseriesOutfall(String timeseriesOutfall) {
        this.timeseriesOutfall = timeseriesOutfall;
    }

    public boolean isGated() {
        return gated;
    }

    public void setGated(boolean gated) {
        this.gated = gated;
    }

    public String getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }
}
