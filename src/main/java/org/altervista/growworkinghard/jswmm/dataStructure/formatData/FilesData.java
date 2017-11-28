package org.altervista.growworkinghard.jswmm.dataStructure.formatData;

import java.util.HashMap;

public class FilesData {
    public enum RainfallFile{
        USE,
        SAVE
    }

    HashMap<String, RainfallFile> rainfallFile;

    public enum RunoffFile{
        USE,
        SAVE
    }

    HashMap<String, RunoffFile> runoffFile;

    public enum HotstartFile{
        USE,
        SAVE
    }

    HashMap<String, HotstartFile> hotstartFileSave;
    HashMap<String, HotstartFile> hotstartFileUse;

    public enum RDIIFile{
        USE,
        SAVE
    }

    HashMap<String, RDIIFile> rdiiFile;

    public enum InflowFile{
        USE
    }

    HashMap<String, InflowFile> inflowFile;

    public enum OutflowFile{
        SAVE
    }

    HashMap<String, OutflowFile> outflowFile;

    public HashMap<String, RainfallFile> getRainfallFile() {
        return rainfallFile;
    }

    public void setRainfallFile(HashMap<String, RainfallFile> rainfallFile) {
        this.rainfallFile = rainfallFile;
    }

    public HashMap<String, RunoffFile> getRunoffFile() {
        return runoffFile;
    }

    public void setRunoffFile(HashMap<String, RunoffFile> runoffFile) {
        this.runoffFile = runoffFile;
    }

    public HashMap<String, HotstartFile> getHotstartFileSave() {
        return hotstartFileSave;
    }

    public void setHotstartFileSave(HashMap<String, HotstartFile> hotstartFileSave) {
        this.hotstartFileSave = hotstartFileSave;
    }

    public HashMap<String, HotstartFile> getHotstartFileUse() {
        return hotstartFileUse;
    }

    public void setHotstartFileUse(HashMap<String, HotstartFile> hotstartFileUse) {
        this.hotstartFileUse = hotstartFileUse;
    }

    public HashMap<String, RDIIFile> getRdiiFile() {
        return rdiiFile;
    }

    public void setRdiiFile(HashMap<String, RDIIFile> rdiiFile) {
        this.rdiiFile = rdiiFile;
    }

    public HashMap<String, InflowFile> getInflowFile() {
        return inflowFile;
    }

    public void setInflowFile(HashMap<String, InflowFile> inflowFile) {
        this.inflowFile = inflowFile;
    }

    public HashMap<String, OutflowFile> getOutflowFile() {
        return outflowFile;
    }

    public void setOutflowFile(HashMap<String, OutflowFile> outflowFile) {
        this.outflowFile = outflowFile;
    }
}
