package com.company;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Hashtable<Integer, String> TennisClub = new Hashtable<Integer, String>();

        TennisClub.put(1, "Bob");
        TennisClub.put(2, "Aaron");
        TennisClub.put(3, "John");
        TennisClub.put(4, "Alex");
        TennisClub.put(5, "Kevin");

        for(Integer itm: TennisClub.keySet()){
            System.out.println(itm + " " + TennisClub.get(itm));
        }

        String name = "";
        String way;
        int id = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("What do you want to do?");

        way = in.next();
        if (way.equals("add")){
            while (true) {
                System.out.println("Enter name:");
                name = in.next();
                if (name.equals("end")) {
                    break;
                }
                System.out.println("Enter id:");
                id = Integer.valueOf(in.next());
                TennisClub.put(id, name);
            }
            System.out.println("\nHashtable:");
            for(Integer n : TennisClub.keySet()) {
                System.out.println("id:" + n + "\nName:" + TennisClub.get(n));
            }
        }

        if (way.equals("remove")) {
            while (true) {
                System.out.println("Enter name:");
                name = in.next();
                if (name.equals("end")) {
                    break;
                }
                // search for the id corresponding to input name.
                for (Map.Entry<Integer, String> entry : TennisClub.entrySet()) {
                    if (entry.getValue().equals(name)) {
                        id = entry.getKey();
                    }
                }
                TennisClub.remove(id, name);
            }
            System.out.println("\nHashtable:");
            for (Integer n : TennisClub.keySet()) {
                System.out.println("id:" + n + "\nName:" + TennisClub.get(n));
            }
        }
        else{
            return;
        }
    }
}