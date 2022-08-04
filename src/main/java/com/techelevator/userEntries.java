package com.techelevator;

import java.awt.dnd.DragGestureEvent;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;





public class UserEntries {
    private List<Entry> entries = new ArrayList<>();
    private double accumulatedWeight;
    private Random rand = new Random();
    private List<String> draftOrder = new ArrayList<>();

    public void addEntry(String name, double weight) {

        accumulatedWeight += weight;
        Entry newEntry = new Entry();
        newEntry.setName(name);
        newEntry.setWeight((int) weight);
        newEntry.setAccumulatedWeight(accumulatedWeight);
        entries.add(newEntry);
    }

    public void getEntries() {
        for (Entry entry : entries) {
            System.out.println(entry.getName() + ", " + entry.getWeight());
        }
    }

    public List<Entry> getListOfEntries() {
        return entries;
    }

    public String getRandom(List<Entry> entries) {
        double completeWeight = 0.0;
        for (Entry entry : entries) {
            completeWeight += entry.getWeight();
        }
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Entry entry : entries) {
            countWeight += entry.getWeight();
            if (countWeight >= r) {
                return entry.getName();
            }
        }
        return null;
    }

//    public List<String> generateDraftOrder() {
//        while (draftOrder.size() < entries.size()) {
//            String name = getRandom(entries);
//            if (!draftOrder.contains(name)) {
//                draftOrder.add(name);
//            }
//        }
//        return draftOrder;
//    }

}




