package br.com.alura.screenmatch.models;

public class Movie {
    public String name;
    int yearOfRelease;
    private double sumOfRatings;
    private int totalRatings;
    boolean includedInThePlane;
    int durationInMinutes;

    public void viewTechnicalSheet() {
        System.out.printf("""
                \n
                Film name: %s
                Year of release: %d
                Durantion in minutes: %d
                \n
                """, name, yearOfRelease, durationInMinutes);
    }
    public void evaluate (double grade) {
        sumOfRatings += grade;
        totalRatings ++;
    }

    public void mediumGrip() {
        double rating = sumOfRatings / totalRatings;
        System.out.println("Rating:" + rating);
    }

    public int getTotalRatings() {
        return totalRatings;
    }
}
