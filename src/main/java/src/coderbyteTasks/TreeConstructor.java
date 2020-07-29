package src.coderbyteTasks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TreeConstructor {


    public String solution(String[] input) {

        Map<Integer, Integer> parentMap = new TreeMap<>();
        Map<Integer,Integer> childMap = new TreeMap<>();

        for (String pair : input){

            String [] pairOf = pair.split(",");

            int parent = Integer.parseInt(pairOf[0].replace("(","").trim());
            int child = Integer.parseInt(pairOf[1].replace(")","").trim());

            if (parentMap.containsKey(parent)) {
                parentMap.put(parent, parentMap.get(parent) + 1);
                if (parentMap.containsKey(parent) && parentMap.get(parent)>2){
                    return "false";
                }
            } else {
                parentMap.put(parent, 1);
            }

            if (childMap.containsKey(child)) {
                childMap.put(child, childMap.get(child) + 1);

                if (childMap.containsKey(child) && childMap.get(child)>2){
                    return "false";
                }

            } else {
                childMap.put(child, 1);
            }
        }

        if(childMap.keySet().stream().filter(e-> !parentMap.keySet().contains(e)).distinct().count()!=1){
            return "false";
        }

        return "true";
    }



}
