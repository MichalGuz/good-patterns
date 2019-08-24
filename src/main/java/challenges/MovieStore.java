package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {
    public Map<String, List<String>> getMovies(){
        List<String> drama = new ArrayList<>();
        drama.add("Drama's title #1");
        drama.add("Drama's title #2");

        List<String> comedy = new ArrayList<>();
        comedy.add("Comedy's title #1");
        comedy.add("Comedy's title #2");

        List<String> crime = new ArrayList<>();
        crime.add("Crime's title #1");
        crime.add("Crime's title #2");

        List<String> horror = new ArrayList<>();
        horror.add("Horror's title #1");
        horror.add("Horror's title #2");

        Map<String, List<String>> moviesByFilmGenres = new HashMap<>();
        moviesByFilmGenres.put("DRA", drama);
        moviesByFilmGenres.put("COM", comedy);
        moviesByFilmGenres.put("CRI", crime);
        moviesByFilmGenres.put("HOR", horror);

        return moviesByFilmGenres;
    }

    public void printMovies(){
        getMovies().entrySet().stream()
                .map(entry -> entry.getValue().stream())
                .flatMap(list -> list)
                .map(l -> l = l.concat("!"))
                .forEach(System.out::print);
    }
}
