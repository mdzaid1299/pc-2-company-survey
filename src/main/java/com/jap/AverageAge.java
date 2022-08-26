package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        int[] resultArray = new int[ageRawData.length];
        String out = "";
        double avg = 0;

        try {
            //Write the logic
            for (int i = 0; i < ageRawData.length; i++) {
                resultArray[i] = Integer.parseInt(ageRawData[i]);
            }
            double sum = 0;
            for (int i = 0; i < resultArray.length; i++) {
                sum = sum + resultArray[i];
            }
            out = Double.toString(sum / resultArray.length);
            //Handle specific exception
        } catch (NumberFormatException exception) {
            out = exception.toString();
            {
               // return out;
            }
        }
        return out;
    }
}
