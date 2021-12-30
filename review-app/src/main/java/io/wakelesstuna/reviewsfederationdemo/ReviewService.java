package io.wakelesstuna.reviewsfederationdemo;

import com.netflix.graphql.dgs.DgsComponent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author oscar.steen.forss
 */
@DgsComponent
public class ReviewService {

    private Map<String, List<Review>> reviews = new HashMap<>();

    public ReviewService() {

        List<Review> reviews1 = List.of(
                Review.builder().starRating(5).build(),
                Review.builder().starRating(2).build(),
                Review.builder().starRating(3).build(),
                Review.builder().starRating(1).build()
        );

        List<Review> reviews2 = List.of(
                Review.builder().starRating(5).build(),
                Review.builder().starRating(5).build(),
                Review.builder().starRating(5).build(),
                Review.builder().starRating(5).build()
        );

        List<Review> reviews3 = List.of(
                Review.builder().starRating(1).build(),
                Review.builder().starRating(1).build()
        );

        reviews.put("1", reviews1);
        reviews.put("2", reviews2);
        reviews.put("3", reviews3);
    }

    public List<Review> reviews(String movieId) {
        return reviews.get(movieId);
    }
}
