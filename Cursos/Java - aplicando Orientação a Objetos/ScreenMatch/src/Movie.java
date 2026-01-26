public class Movie {
    String name;
    int yearOfRelease;
    double sumOfRatings;
    int totalRatings;
    boolean includedInThePlane;
    int durationInMinutes;

    void viewTechnicalSheet() {
        System.out.printf("""
                Film name: %s
                Year of release: %d
                Durantion in minutes: %d
                """, name, yearOfRelease, durationInMinutes);
    }
    void evaluate (double grade) {
        sumOfRatings += grade;
        totalRatings ++;
    }

    double mediumGrip() {
        return sumOfRatings / totalRatings;
    }
}
