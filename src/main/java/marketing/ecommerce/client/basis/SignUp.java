package marketing.ecommerce.client.basis;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Getter @Builder @NoArgsConstructor
@AllArgsConstructor
public class SignUp {private String name;
    private String password; private LocalDate birth;}