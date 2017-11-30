package org.altervista.growworkinghard.jswmm.dataStructure;

import java.time.Instant;

public class TimeSetup {

    private Instant startDate;

    private Instant endDate;

    private Instant reportStartDate;

    private Instant reportEndDate;

    private Instant sweepStart;

    private Instant sweepEnd;

    private int dryDays;

    private Double reportStepSize;

    private Double wetStepSize;

    private Double dryStepSize;

    private Double routingStepSize;

    TimeSetup(Instant startDate, Instant endDate,
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
