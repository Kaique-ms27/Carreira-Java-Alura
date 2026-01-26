public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Wolf of Wall Street";
        myMovie.yearOfRelease = 2013;
        myMovie.durationInMinutes = 179;

        myMovie.viewTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println(myMovie.sumOfRatings);
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.mediumGrip());
    }
}
