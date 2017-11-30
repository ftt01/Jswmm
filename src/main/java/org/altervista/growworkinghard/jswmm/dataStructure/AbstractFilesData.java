package org.altervista.growworkinghard.jswmm.dataStructure;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;

abstract class AbstractFilesData {

    abstract Double adaptStepSize (Instant stepSize, Instant totalTime);

    abstract LinkedHashMap<Instant, Double> adaptDataToStepSize (Instant stepSizeToAdapt, Instant stepSizeAdapter,
                                                       Instant initialTime, Instant totalTime,
                                                       LinkedHashMap<Instant, Double> dataToAdapt);







    ReportData reportData;

    FilesData filesDataIO;

    LinkedHashMap<String, LinkedHashMap<Instant, Double>> adaptedDataFile;

    abstract LinkedHashMap<String, LinkedHashMap<Instant, Double>> readDataFile(File file) throws IOException;

    abstract Instant transformToDate(String[] splittedTempRainLine);

}
