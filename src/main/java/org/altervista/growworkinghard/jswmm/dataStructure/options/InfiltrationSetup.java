package org.altervista.growworkinghard.jswmm.dataStructure.options;

public class InfiltrationSetup {
    String infiltrationModel;

    InfiltrationSetup(String infiltrationModel){
        this.infiltrationModel = infiltrationModel;
    }

    public void setInfiltrationModel(String infiltrationModel){
        this.infiltrationModel = infiltrationModel;
    }

    public String getInfiltrationModel() {
        return infiltrationModel;
    }
}
