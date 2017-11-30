package org.altervista.growworkinghard.jswmm.dataStructure;

public class ReportData {

    private boolean reportInputData;
    private boolean reportContinuityData;
    private boolean reportFlowStatistics;
    private boolean reportControls;

    public enum ReportSubcatchments {
        ALL,
        NONE
    }

    private ReportSubcatchments reportSubcatchments;

    public enum ReportNodes {
        ALL,
        NONE
    }

    private ReportNodes reportNodes;

    public enum ReportLinks {
        ALL,
        NONE
    }

    private ReportLinks reportLinks;

    private ReportLID reportLIDs;
}
