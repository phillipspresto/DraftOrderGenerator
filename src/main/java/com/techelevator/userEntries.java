package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;





public class userEntries {

    private List<Entry> entries = new ArrayList<>();
    private double accumulatedWeight;
    private Random random = new Random();




    public void addEntry (String name, Integer weight) {
        accumulatedWeight += weight;
        Entry newEntry = new Entry();
        newEntry.name = name;
        newEntry.accumulatedWeight = accumulatedWeight;
        entries.add(newEntry);
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public String getRandom() {
        double r = random.nextDouble() * accumulatedWeight;

        for (Entry entry: entries) {
            if (entry.accumulatedWeight >= r) {
                return entry.name;
                }
            }
        return null;
        }


//    public Integer getSize() {
//        return draftOrder.size();
//    }


//    public List<String> getDraftOrder() {
//        return draftOrder;
//    }

}


