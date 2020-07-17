package com.ups.hackathon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.net.URL;

import java.util.List;
import java.util.ArrayList;

public class CSVHandler {


    public User readCSV() {
        ClassLoader classLoader = getClass().getClassLoader();
        
        File csvFile;
        URL resource = classLoader.getResource("Users.csv");
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            csvFile = new File(resource.getFile());
        }
        String line = "";
        String cvsSplitBy = ",";
        List<User> userObjs;
        // try (
        User userobj;
        String[] user = {"a", "b", "c", "d"};
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            int counter = 0;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                user = line.split(cvsSplitBy);
                if (user[counter].equals("Volunteer")) {
                    
                } else {
                                      
                }

            }
            return createVolunteerObject(user);

        } catch (IOException e) {

        }
        return null;
    }

    public static void writeToCSV(List<Volunteer> volunteers) {

    }

    private static Volunteer createVolunteerObject(String[] array) {
        int index = 1;
        switch (array.length) {
            case 5: return new Volunteer(array[index], array[index++], array[index++], array[index++]);
            case 6: return new Volunteer(array[index], array[index++], array[index++], array[index++], array[index++]);
            case 7: return new Volunteer(array[index], array[index++], array[index++], array[index++], array[index++], array[index++]);
            case 8: return new Volunteer(array[index], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++]);
            case 9: return new Volunteer(array[index], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++]);
            case 10: return new Volunteer(array[index], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++], array[index++]);
            default: return new Volunteer(array[index++], array[index++], array[index++]);
        }

    }

}