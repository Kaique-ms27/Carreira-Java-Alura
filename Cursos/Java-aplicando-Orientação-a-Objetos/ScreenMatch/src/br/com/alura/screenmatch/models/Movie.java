package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int yearOfRelease;
    private double sumOfRatings;
    private int totalRatings;
    private boolean includedInThePlane;
    private int durationInMinutes;

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInThePlane(boolean includedInThePlane) {
        this.includedInThePlane = includedInThePlane;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludedInThePlane() {
        return includedInThePlane;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

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
