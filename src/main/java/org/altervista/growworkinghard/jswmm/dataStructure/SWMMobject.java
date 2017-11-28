package org.altervista.growworkinghard.jswmm.dataStructure;

import org.altervista.growworkinghard.jswmm.dataStructure.formatData.*;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.linkObjects.Conduit;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.nodeObject.AbstractNodes;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.nodeObject.Junction;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.nodeObject.Outfall;
import org.altervista.growworkinghard.jswmm.dataStructure.hydrology.rainData.AbstractRaingage;
import org.altervista.growworkinghard.jswmm.dataStructure.hydrology.rainData.Raingage;
import org.altervista.growworkinghard.jswmm.dataStructure.hydrology.subcatchment.*;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.linkObjects.AbstractLinks;
import org.altervista.growworkinghard.jswmm.dataStructure.options.Options;
import org.altervista.growworkinghard.jswmm.dataStructure.options.RoutingSetup;

import java.time.Instant;
import java.util.HashMap;
import java.util.Optional;

public class SWMMobject {

    Options options = new Options();

    AbstractFilesData filesData = new FileData();
    AbstractTimeseriesData timeseriesData;

    AbstractRaingage raingages = new Raingage();

    AbstractNodes nodes = new Junction();
    AbstractNodes outfall = new Outfall();

    AbstractLinks links = new Conduit();
    AbstractLinks crossSectionData = new Conduit();
    AbstractSubcatchments subcatchments;
    Subarea subarea = new Subarea();

    public void run() {
        //INPparser to select data
        // [TITLE]
        // [OPTIONS]
        options.setInfiltrationModel("HORTON");

        options.setRoutingModel("STEADY", "H-W",
                0.0, 0.0, 0.5, RoutingSetup.InertialDamping.NONE,
                RoutingSetup.NormalFlowLimited.BOTH, 10.0, 0.01, 8,
                0.0015);

        options.setOffsetConvention("DEPTH");
        options.setIgnoreRainfall(false);
        options.setIgnoreSnowmelt(false);
        options.setIgnoreGroundwater(false);
        options.setIgnoreRDII(false);
        options.setIgnoreRouting(false);
        options.setIgnoreQuality(false);
        options.setAllowPonding(false);
        options.setSteadyStateOptions(false, 0.05, 0.05);

        Instant startDate = null;
        Instant endDate = null;
        Instant reportStartDate = null;
        Instant reportEndDate = null;
        Instant sweepStart = null;
        Instant sweepEnd = null;
        int dryDays = 0;
        Double reportStepSize = null;
        Double wetStepSize = null;
        Double dryStepSize = null;
        Double routingStepSize = null;

        options.setTimeOptions( startDate, endDate, reportStartDate, reportEndDate,
                sweepStart, sweepEnd, dryDays, reportStepSize, wetStepSize, dryStepSize, routingStepSize );

        options.setNumberOfThreads(1);
        options.setTemporaryDirectory("directory!");

        // [REPORT]
        filesData.reportData.setReportInputData(true);
        filesData.reportData.setReportContinuityData(true);
        filesData.reportData.setReportFlowStatistics(true);
        filesData.reportData.setReportControls(true);
        //TODO could be a list!!
        filesData.reportData.setReportSubcatchments(ReportData.ReportSubcatchments.ALL);
        //TODO could be a list!!
        filesData.reportData.setReportNodes(ReportData.ReportNodes.ALL);
        //TODO could be a list!!
        filesData.reportData.setReportLinks(ReportData.ReportLinks.ALL);

        ReportLID reportLIDs = null;
        //TODO
        filesData.reportData.setReportLIDs(reportLIDs);

        // [FILES]
        HashMap<String, FilesData.RainfallFile> rainfallFileHashMap = new HashMap<>();
        rainfallFileHashMap.put("", FilesData.RainfallFile.SAVE);
        filesData.filesDataIO.setRainfallFile(rainfallFileHashMap);

        HashMap<String, FilesData.RunoffFile> runoffFileHashMap = new HashMap<>();
        runoffFileHashMap.put("", FilesData.RunoffFile.SAVE);
        filesData.filesDataIO.setRunoffFile(runoffFileHashMap);

        HashMap<String, FilesData.HotstartFile> hotstartFileSaveHashMap = new HashMap<>();
        hotstartFileSaveHashMap.put("", FilesData.HotstartFile.SAVE);
        filesData.filesDataIO.setHotstartFileSave(hotstartFileSaveHashMap);

        HashMap<String, FilesData.HotstartFile> hotstartFileUseHashMap = new HashMap<>();
        hotstartFileUseHashMap.put("", FilesData.HotstartFile.USE);
        filesData.filesDataIO.setHotstartFileUse(hotstartFileUseHashMap);

        HashMap<String, FilesData.InflowFile> inflowFileHashMap = new HashMap<>();
        inflowFileHashMap.put("", FilesData.InflowFile.USE);
        filesData.filesDataIO.setInflowFile(inflowFileHashMap);

        HashMap<String, FilesData.OutflowFile> outflowFileHashMap = new HashMap<>();
        outflowFileHashMap.put("", FilesData.OutflowFile.SAVE);
        filesData.filesDataIO.setOutflowFile(outflowFileHashMap);

        // [RAINGAGES]----
        raingages.setRaingageName("raingageName");
        raingages.setFormatRaingageData(AbstractRaingage.FormatRaingageData.INTENSITY);
        raingages.setRaingageIntervalReadings(20.0);
        raingages.setRaingageSnowCorrectionFactor(1.0);
        raingages.setRaingageFileName("fileInput");
        raingages.setRaingageStation("station");
        raingages.setRaingageUnits(AbstractRaingage.RaingageUnits.MILLIMETERS);

        // [EVAPORATION]
        // [TEMPERATURE]
        // [ADJUSTMENTS]
        // [SUBCATCHMENTS]----
        subcatchments.setSubcatchmentID("SUB1");
        subcatchments.setRaingageName("STA01");
        subcatchments.setReceiverRunoffID("N1");
        subcatchments.setAreaSubcatchment(23.5);
        subcatchments.setImperviounessPercentage(0.7);
        subcatchments.setCharacteristicWidth(23.5);
        subcatchments.setSubcatchmentSlope(0.4);

        SnowPack snowPackSub1 = null;
        subcatchments.setSnowPack(snowPackSub1);

        // [SUBAREAS]----
        subarea.setSubareaID("IDsubarea");
        subarea.setManningImpervious(2.0);
        subarea.setManningPervious(3.0);
        subarea.setDepressionStorageImpervious(3.0);
        subarea.setDepressionStoragePervious(3.0);
        subarea.setPercentageRouted(0.8);
        subarea.setRouteTo(Subarea.RouteTo.OUTLET);
        subarea.setPercentageRouted(1.0);

        // [INFILTRATION]
        // [LID_CONTROLS]
        // [LID_USAGE]
        // [AQUIFERS]
        // [GROUNDWATER]
        // [GWF]
        // [SNOWPACKS]
        // [JUNCTIONS]----
        nodes.setJunctionName("N1");
        nodes.setJunctionElevation(2.0);
        nodes.setMaximumDepthNode(3.0);
        nodes.setInitialdepthNode(0.0);
        nodes.setMaximumDepthSurcharge(1.0);
        nodes.setPondingArea(200.0);

        // [OUTFALLS]----
        outfall.setJunctionName("OUT1");
        outfall.setJunctionElevation(2.0);
        outfall.outfall.setOutfallType(Outfall.OutfallType.FREE);
        outfall.outfall.setGated(false);
        outfall.outfall.setRouteTo("N1");

        // [DIVIDERS]
        // [STORAGE]
        // [CONDUITS]----
        links.setNameLink("");
        links.setNameUpstreamNode("");
        links.setNameDownstreamNode("");
        links.setLinkLength(2.0);
        links.setUpstreamOffset(2.0);
        links.setDownstreamOffset(2.0);
        links.setInitialFlowRate(0.0);
        links.setMaximumFlowRate(1.0);

        // [PUMPS]
        // [ORIFICES]
        // [WEIRS]
        // [OUTLETS]
        // [XSECTIONS]----
        crossSectionData.conduit.setCrossSectionID("");
        crossSectionData.conduit.setShape(Conduit.Shape.CIRCULAR);
        crossSectionData.conduit.setDiameter(2.0);

        // [TRANSECTS]
        // [LOSSES]
        // [CONTROLS]
        // [POLLUTANTS]
        // [LANDUSES]
        // [COVERAGES]
        // [LOADINGS]
        // [BUILDUP]
        // [WASHOFF]
        // [TREATMENT]
        // [INFLOWS]
        // [DWF]
        // [RDII]
        // [HYDROGRAPHS]
        // [CURVES]
        // [TIMESERIES]----



        // [PATTERNS]
    }
}
