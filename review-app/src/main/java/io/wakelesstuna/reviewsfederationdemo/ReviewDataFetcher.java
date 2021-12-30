package io.wakelesstuna.reviewsfederationdemo;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author oscar.steen.forss
 */
@DgsComponent
@RequiredArgsConstructor
public class ReviewDataFetcher {

    private final ReviewService reviewService;

    @DgsEntityFetcher(name = "Movie")
    public Movie movie(Map<String, Object> values){
        return new Movie((String) values.get("id"), null);
    }

    @DgsData(parentType = "Movie", field = "reviews")
    public List<Review> reviewFetcher(DgsDataFetchingEnvironment dfe) {
        Movie movie = dfe.getSource();
        return reviewService.reviews(movie.getId());
    }
}
