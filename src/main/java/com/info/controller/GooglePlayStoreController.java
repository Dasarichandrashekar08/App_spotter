import com.google.api.services.androidpublisher.model.ReviewsListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/playstore")
public class PlayStoreController {

    private final PlayStoreService playStoreService;

    @Autowired
    public PlayStoreController(PlayStoreService playStoreService) {
        this.playStoreService = playStoreService;
    }

    @GetMapping("/reviews/{packageName}")
    public ReviewsListResponse getReviews(@PathVariable String packageName) throws IOException {
        return playStoreService.listReviews(packageName);
    }

    // Add other API endpoints as per your requirements
}
