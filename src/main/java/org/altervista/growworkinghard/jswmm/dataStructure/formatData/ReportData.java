package org.altervista.growworkinghard.jswmm.dataStructure.formatData;

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

    public boolean isReportInputData() {
        return reportInputData;
    }

    public void setReportInputData(boolean reportInputData) {
        this.reportInputData = reportInputData;
    }

    public boolean isReportContinuityData() {
        return reportContinuityData;
    }

    public void setReportContinuityData(boolean reportContinuityData) {
        this.reportContinuityData = reportContinuityData;
    }

    public boolean isReportFlowStatistics() {
        return reportFlowStatistics;
    }

    public void setReportFlowStatistics(boolean reportFlowStatistics) {
        this.reportFlowStatistics = reportFlowStatistics;
    }

    public boolean isReportControls() {
        return reportControls;
    }

    public void setReportControls(boolean reportControls) {
        this.reportControls = reportControls;
    }

    public ReportSubcatchments getReportSubcatchments() {
        return reportSubcatchments;
    }

    public void setReportSubcatchments(ReportSubcatchments reportSubcatchments) {
        this.reportSubcatchments = reportSubcatchments;
    }

    public ReportNodes getReportNodes() {
        return reportNodes;
    }

    public void setReportNodes(ReportNodes reportNodes) {
        this.reportNodes = reportNodes;
    }

    public ReportLinks getReportLinks() {
        return reportLinks;
    }

    public void setReportLinks(ReportLinks reportLinks) {
        this.reportLinks = reportLinks;
    }

    public ReportLID getReportLIDs() {
        return reportLIDs;
    }

    public void setReportLIDs(ReportLID reportLIDs) {
        this.reportLIDs = reportLIDs;
    }
}
