package bcd.maven.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Arrays;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.javatuples.Tuple;

public class Main {
    private static String[][] logins = { 
        {"SHA-256", "username1", "e1075933b26b5e4e50ab3dc3528eb3461214ba15b7a27b51f5dbc086912caf56"}, 
        {"SHA-256", "username2", "bbc2711bf1d1c152b21b00cdadf89fa637c76238ffc871b17e1bb5ca9908a104"}, 
        {"SHA-256", "username3", "d68379725d2d8a16e5f2cbcaf18e0baf84ea0aed81ed55b7c4f479e7cdab855d"}, 
        {"SHA-256", "username4", "c9366c1bd693018b9ac3c43f1404d3063e7c62b73f93a3d3b17ec71411d5f10f"}, 
        {"SHA-256", "username5", "253f4f19eb4886c3e9094b92c0080f5b4eecc52011669551a4cc96adb798d31c"}, 
    };

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = Pair.with(1, "one");
        System.out.println(pair1);

        System.out.println("List of logins:");
        printList();

        System.out.println("List of triplets:");
        printTriplets();
    }

    public static void printList() {
        List<List<String>> list = new ArrayList<>();
        for (String[] login : logins) {
            List<String> sublist = new ArrayList<>(Arrays.asList(login));
            list.add(sublist);
        }
        System.out.println(list);
    }

    public static void printTriplets() {
        List<Triplet<UUID, String, String>> list = new ArrayList<>();
        for (String[] login : logins) {
            List<String> sublist = new ArrayList<>(Arrays.asList(login));
            Triplet<UUID, String, String> tuple = Triplet.with(UUID.randomUUID(), sublist.get(1), sublist.get(2));
            list.add(tuple);
        }
        System.out.println(list);
    }
}