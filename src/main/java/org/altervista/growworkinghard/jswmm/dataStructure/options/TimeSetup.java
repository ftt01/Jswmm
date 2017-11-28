package org.altervista.growworkinghard.jswmm.dataStructure.options;

import java.time.Instant;

public class TimeSetup {

    private Instant startDate;

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getStartDate() {
        return startDate;
    }


    private Instant endDate;

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Instant getEndDate() {
        return endDate;
    }


    public Instant reportStartDate;

    public void setReportStartDate(Instant reportStartDate) {
        this.reportStartDate = reportStartDate;
    }

    public Instant getReportStartDate() {
        return reportStartDate;
    }


    public Instant reportEndDate;

    public void setReportEndDate(Instant reportEndDate) {
        this.reportEndDate = reportEndDate;
    }

    public Instant getReportEndDate() {
        return reportEndDate;
    }


    public Instant sweepStart;

    public void setSweepStart(Instant sweepStart) {
        this.sweepStart = sweepStart;
    }

    public Instant getSweepStart() {
        return sweepStart;
    }


    public Instant sweepEnd;

    public void setSweepEnd(Instant sweepEnd) {
        this.sweepEnd = sweepEnd;
    }

    public Instant getSweepEnd() {
        return sweepEnd;
    }


    public int dryDays;

    public void setDryDays(int dryDays) {
        this.dryDays = dryDays;
    }

    public int getDryDays() {
        return dryDays;
    }


    public Double reportStepSize;

    public void setReportStepSize(Double reportStepSize) {
        this.reportStepSize = reportStepSize;
    }

    public Double getReportStepSize() {
        return reportStepSize;
    }


    public Double wetStepSize;

    public void setWetStepSize(Double wetStepSize) {
        this.wetStepSize = wetStepSize;
    }

    public Double getWetStepSize() {
        return wetStepSize;
    }


    public Double dryStepSize;

    public void setDryStepSize(Double dryStepSize) {
        this.dryStepSize = dryStepSize;
    }

    public Double getDryStepSize() {
        return dryStepSize;
    }


    public Double routingStepSize;

    public void setRoutingStepSize(Double routingStepSize) {
        this.routingStepSize = routingStepSize;
    }

    public Double getRoutingStepSize() {
        return routingStepSize;
    }

    public TimeSetup(Instant startDate, Instant endDate,
                     Instant reportStartDate, Instant reportEndDate,
                     Instant sweepStart, Instant sweepEnd,
                     int dryDays, Double reportStepSize,
                     Double wetStepSize, Double dryStepSize,
                     Double routingStepSize) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.reportStartDate = reportStartDate;
        this.reportEndDate = reportEndDate;
        this.sweepStart = sweepStart;
        this.sweepEnd = sweepEnd;
        this.dryDays = dryDays;
        this.reportStepSize = reportStepSize;
        this.wetStepSize = wetStepSize;
        this.dryStepSize = dryStepSize;
        this.routingStepSize = routingStepSize;
    }
}
