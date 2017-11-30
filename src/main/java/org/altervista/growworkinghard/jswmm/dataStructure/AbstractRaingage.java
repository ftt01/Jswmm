package org.altervista.growworkinghard.jswmm.dataStructure;

public abstract class AbstractRaingage {

    String raingageName;

    public enum FormatRaingageData {
        INTENSITY,
        VOLUME,
        CUMULATIVE
    }

    FormatRaingageData formatRaingageData;

    Double raingageIntervalReadings;

    Double raingageSnowCorrectionFactor;

    enum RaingageFileType {
        TIMESERIES,
        FILE
    }

    RaingageFileType raingageFileType;

    String raingageFileName;

    String raingageStation;

    public enum RaingageUnits {
        INCHES,
        MILLIMETERS
    }

    RaingageUnits raingageUnits;

    public String getRaingageName() {
        return raingageName;
    }

    public void setRaingageName(String raingageName) {
        this.raingageName = raingageName;
    }

    public FormatRaingageData getFormatRaingageData() {
        return formatRaingageData;
    }

    public void setFormatRaingageData(FormatRaingageData formatRaingageData) {
        this.formatRaingageData = formatRaingageData;
    }

    public Double getRaingageIntervalReadings() {
        return raingageIntervalReadings;
    }

    public void setRaingageIntervalReadings(Double raingageIntervalReadings) {
        this.raingageIntervalReadings = raingageIntervalReadings;
    }

    public Double getRaingageSnowCorrectionFactor() {
        return raingageSnowCorrectionFactor;
    }

    public void setRaingageSnowCorrectionFactor(Double raingageSnowCorrectionFactor) {
        this.raingageSnowCorrectionFactor = raingageSnowCorrectionFactor;
    }

    public RaingageFileType getRaingageFileType() {
        return raingageFileType;
    }

    public void setRaingageFileType(RaingageFileType raingageFileType) {
        this.raingageFileType = raingageFileType;
    }

    public String getRaingageFileName() {
        return raingageFileName;
    }

    public void setRaingageFileName(String raingageFileName) {
        this.raingageFileName = raingageFileName;
    }

    public String getRaingageStation() {
        return raingageStation;
    }

    public void setRaingageStation(String raingageStation) {
        this.raingageStation = raingageStation;
    }

    public RaingageUnits getRaingageUnits() {
        return raingageUnits;
    }

    public void setRaingageUnits(RaingageUnits raingageUnits) {
        this.raingageUnits = raingageUnits;
    }
}
