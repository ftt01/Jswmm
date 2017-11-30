package org.altervista.growworkinghard.jswmm.dataStructure;

import org.altervista.growworkinghard.jswmm.dataStructure.AbstractFilesData;

import java.io.*;
import java.time.Instant;
import java.util.LinkedHashMap;

public class FileData extends AbstractFilesData {

    /**
     * From the file data of SWMM read the data and save it to the dataFromFile LinkedHashMap
     * that contains the name of the station as key, the date as internal LinkedHashMap and
     * the precipitation or evaporation as value of the internal LinkedHashMap.
     *
     * @param file
     * @return LinkedHashMap of the data
     * @throws IOException
     */
    LinkedHashMap<String, LinkedHashMap<Instant, Double>> readDataFile(File file)
            throws IOException {

        LinkedHashMap<String, LinkedHashMap<Instant, Double>> dataFromFile = new LinkedHashMap<>();

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String temporaryLine;
        while ((temporaryLine = bufferRead.readLine()) != null){

            LinkedHashMap<Instant, Double> tempDateValue = new LinkedHashMap<>();
            String[] splittedTempLine = temporaryLine.split("\\s+");

            String currentStation = splittedTempLine[0];
            Instant currentDate = transformToDate(splittedTempLine);
            Double currentValue = Double.parseDouble(splittedTempLine[6]);

            tempDateValue.put(currentDate, currentValue);
            if(dataFromFile.get(currentStation).put(currentDate, currentValue) == null){
                dataFromFile.put(currentStation, tempDateValue);
            }

        }
        bufferRead.close();

        return dataFromFile;
    }

    Instant transformToDate(String[] splittedTempRainLine) {
        String year = splittedTempRainLine[1];
        String month = splittedTempRainLine[2];
        String day = splittedTempRainLine[3];
        String hour = splittedTempRainLine[4];
        String minutes = splittedTempRainLine[5];

        //TODO check if it works properly
        return Instant.parse(year + "-" + month + "-" + day + "T" + hour + ":" + minutes + "Z");
    }
}