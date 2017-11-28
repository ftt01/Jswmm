package org.altervista.growworkinghard.jswmm.dataStructure.formatData;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.LinkedHashMap;

public abstract class AbstractFilesData {

    public ReportData reportData;

    public FilesData filesDataIO;

    LinkedHashMap<String, LinkedHashMap<Instant, Double>> adaptedDataFile;

    abstract LinkedHashMap<String, LinkedHashMap<Instant, Double>> readDataFile(File file) throws IOException;

    abstract Instant transformToDate(String[] splittedTempRainLine);
}
