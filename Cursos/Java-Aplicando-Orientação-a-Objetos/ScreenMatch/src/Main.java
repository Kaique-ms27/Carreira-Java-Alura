import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Wolf of Wall Street");
        myMovie.setYearOfRelease(2013);
        myMovie.setDurationInMinutes(179);
        myMovie.setIncludedInThePlane(true);

        myMovie.viewTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total Ratings: " + myMovie.getTotalRatings());
        myMovie.mediumGrip();

    }
}
