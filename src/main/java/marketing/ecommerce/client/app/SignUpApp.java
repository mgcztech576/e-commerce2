package marketing.ecommerce.client.app;
import lombok.RequiredArgsConstructor;
import marketing.ecommerce.client.service.SignUpCS;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class SignUpApp { //SignUpApplication
    private final SignUpCS signUpCS;}