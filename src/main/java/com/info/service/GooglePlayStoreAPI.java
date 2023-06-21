import com.google.api.services.androidpublisher.AndroidPublisher;
import com.google.api.services.androidpublisher.model.ReviewsListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PlayStoreService {

    private final AndroidPublisher androidPublisher;

    @Autowired
    public PlayStoreService(AndroidPublisher androidPublisher) {
        this.androidPublisher = androidPublisher;
    }

    public ReviewsListResponse listReviews(String packageName) throws IOException {
        return androidPublisher.reviews()
                .list(packageName)
                .execute();
    }

    // Add other API methods as per your requirements
}
