package com.ups.hackathon;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Volunteer> volunteers = new ArrayList<Volunteer>();
        volunteers.add(createVolunteerProfile());
    }

    public static Volunteer createVolunteerProfile() {
        Scanner in = new Scanner();
        String name;
        String address;
        String date;
        String initiative;
        String skillA;
        String skillB;
        String skillC;
        String skillD;
        String skillE;
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("What is your address?");
        address = in.nextLine();
        System.out.println("What is your date?");
        date = in.nextLine();
        System.out.println("What is your preferred initiative?");
        initiative = in.nextLine();
        System.out.println("How many skills would you like to add to your profile?");
        int skills = in.nextInt();
        if (skills > 0) {
            System.out.println("Enter skill 1:");
            skillA = in.nextLine();
            return new Volunteer(name, address, email, initiative, skillA);
        }
        if (skills > 1) {
            System.out.println("Enter skill 2:");
            skillB = in.nextLine();
            return new Volunteer(name, address, email, initiative, skillA, skillB);
        }
        if (skills > 2) {
            System.out.println("Enter skill 3:");
            skillC = in.nextLine();
            return new Volunteer(name, address, email, initiative, skillA, skillB, skillC);
        }
        if (skills > 3) {
            System.out.println("Enter skill 4:");
            skillD = in.nextLine();
            return new Volunteer(name, address, email, initiative, skillA, skillB, skillC, skillD);
        }
        if (skills > 4) {
            System.out.println("Enter skill 5:");
            skillE = in.nextLine();
            return new Volunteer(name, address, email, initiative, skillA, skillB, skillC, skillE);
        }
        return new Volunteer(name, address, email, initiative);
    }

    public static void displayVolunteerData(ArrayList<Volunteer> volunteerList) {
        for (int i = 0; i < volunteerList.size(); i++) {
            System.out.println(volunteerList.get(i).getName());
            System.out.println(volunteerList.get(i).getAddress());
            System.out.println(volunteerList.get(i).getEmail());
            System.out.println(volunteerList.get(i).getInitiative());
            for (int j = 0; j < volunteerList.get(i).getSkills().size(); j++) {
                System.out.println(volunteerList.get(i).getSkills().get(j));
            }
        }
    }
}