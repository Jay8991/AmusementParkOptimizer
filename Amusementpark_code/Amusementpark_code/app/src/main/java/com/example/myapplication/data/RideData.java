package com.example.myapplication.data;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class RideData {
    private ArrayList<Pair<String, Integer>> rideData;
    private HashMap<String,String> rideLinks;
    public RideData(){
        rideData= new ArrayList<Pair<String,Integer>>();
        rideLinks= new HashMap<String, String>();
        createData();
        CreateLinks();
    }
    private void createData(){
        rideData.add(new Pair("American Eagle",50));
        rideData.add(new Pair("BATMAN The Ride",120));
        rideData.add(new Pair("Dare Devil Dive",55));
        rideData.add(new Pair("Demon",108));
        rideData.add(new Pair("Giant Drop",124));
        rideData.add(new Pair("Goliath ",35));
        rideData.add(new Pair("JUSTICE LEAGUE: Battle for Metropolis",48));
        rideData.add(new Pair("Mardi Gras Hangover",76));
        rideData.add(new Pair("Maxx Force",84));
        rideData.add(new Pair("Raging Bull",68));
        rideData.add(new Pair("Revolution",25));
        rideData.add(new Pair("SUPERMAN: Ultimate Flight",68));
        rideData.add(new Pair("THE JOKER Free Fly Coaster",145));
        rideData.add(new Pair("Vertical Velocity",89));
        rideData.add(new Pair("Viper",86));
        rideData.add(new Pair("Winner’s Circle Go Karts",42));
        rideData.add(new Pair("X Flight",43));
    }
    private void CreateLinks(){
        rideLinks.put("American Eagle","https://www.sixflags.com/greatamerica/attractions/american-eagle");
        rideLinks.put("BATMAN The Ride","https://www.sixflags.com/greatamerica/attractions/batman-ride");
        rideLinks.put("Dare Devil Dive","https://www.sixflags.com/greatamerica/attractions/dare-devil-dive");
        rideLinks.put("Demon","https://www.sixflags.com/greatamerica/attractions/demon");
        rideLinks.put("Giant Drop","https://www.sixflags.com/greatamerica/attractions/giant-drop");
        rideLinks.put("Goliath","https://www.sixflags.com/greatamerica/attractions/goliath");
        rideLinks.put("JUSTICE LEAGUE: Battle for Metropolis","https://www.sixflags.com/greatamerica/attractions/justice-league-battle-metropolis");
        rideLinks.put("Mardi Gras Hangover","https://www.sixflags.com/greatamerica/attractions/mardi-gras-hangover");
        rideLinks.put("Maxx Force","https://www.sixflags.com/greatamerica/attractions/maxx-force");
        rideLinks.put("Raging Bull","https://www.sixflags.com/greatamerica/attractions/raging-bull");
        rideLinks.put("Revolution","https://www.sixflags.com/greatamerica/attractions/revolution");
        rideLinks.put("SUPERMAN: Ultimate Flight","https://www.sixflags.com/greatamerica/attractions/superman-ultimate-flight");
        rideLinks.put("THE JOKER Free Fly Coaster","https://www.sixflags.com/greatamerica/attractions/joker");
        rideLinks.put("Vertical Velocity","https://www.sixflags.com/greatamerica/attractions/vertical-velocity");
        rideLinks.put("Viper","https://www.sixflags.com/greatamerica/attractions/viper");
        rideLinks.put("Winner’s Circle Go Karts","https://www.sixflags.com/greatamerica/attractions/winners-circle-go-karts");
        rideLinks.put("X Flight","https://www.sixflags.com/greatamerica/attractions/x-flight");


    }
    public String searchUrl(String input){
        return rideLinks.get(input);
    }
    public ArrayList<Pair<String,Integer>> getRideData(){
        return this.rideData;
    }
}
