package marketing.ecommerce.service;
import marketing.ecommerce.client.basis.SignUp;
import marketing.ecommerce.client.basis.Customer;
import marketing.ecommerce.client.service.SignUpCS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
class SignUpCSTest {@Autowired
private SignUpCS service;
    @Test void signUp() {
        SignUp form=SignUp.builder()
                .name("def").birth(LocalDate.now())
                .password("1111").build();
        Customer c=service.signUp(form);
        assertNotNull(c.getId());
        assertNotNull(c.getCreated());
    }}