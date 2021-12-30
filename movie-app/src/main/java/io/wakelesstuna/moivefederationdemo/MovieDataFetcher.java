package io.wakelesstuna.moivefederationdemo;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author oscar.steen.forss
 */
@DgsComponent
@RequiredArgsConstructor
public class MovieDataFetcher {

    private final MovieService movieService;

    @DgsQuery
    public List<Movie> movies(@InputArgument String titleFilter) {
        if (titleFilter != null) {
          return movieService.movies().stream()
                    .filter(m -> m.getTitle().contains(titleFilter))
                    .collect(Collectors.toList());
        }else {
            return movieService.movies();
        }
    }

}
