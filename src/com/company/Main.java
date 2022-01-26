package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();


    public static void main(String[] args) {
        Bus bus1 = new Bus("Renault");
        Bus bus2 = new Bus("Volvo");
        Bus bus3 = new Bus("DAF XT");

        Driver driver1 = new Driver(" Sadyr");
        Driver driver2 = new Driver(" Kamchy");
        Driver driver3 = new Driver(" Kurmankul");

        State state = new State("On base");
        BusStop[] busStops = {
                new BusStop(1, bus1, driver1, state),
                new BusStop(2, bus2, driver2, state),
                new BusStop(3, bus3, driver3, state)
        };
        System.out.println();
        System.out.println("First stage.");
        for (int i = 0; i < busStops.length; i++) {

            System.out.println(busStops[i]);
        }

        System.out.println();
        System.out.println("Second stage.");
        BusStop1[] busStop1s = {
                new BusStop1(1, bus1, null, new State("On Base")),
                new BusStop1(2, bus2, null, new State("On Base")),
                new BusStop1(3, bus3, null, new State("On Base"))};

        System.out.println("#|Bus______________|driver|____________state");

        for (int i = 0; i < busStop1s.length; i++) {
            System.out.println(busStop1s[i]);
        }

        // String allBuses = GSON.toJson(busStops);
        // System.out.println(busStops);
        // write(allBuses);
        //  System.out.println(allBuses);
    }

    //    private static void write(String obj) {
//        Path write = Paths.get("./busStop.json");
//        try{
//            Files.writeString(write,obj,StandardOpenOption.CREATE,StandardOpenOption.WRITE);
//        } catch (IOException e) {
//            e.getMessage();
//        }
//
//    }
//    private static String readFile() {
//        String json = " ";
//        try {
//            FileReader fr = new FileReader("./busStop1.json");
//            int a;
//            while ((a = fr.read()) != -1) {
//                json += (char) a;
//            }
//            return json;
//        } catch (IOException e) {
//            e.getMessage();
//        }
//        return json;
 //   }
}