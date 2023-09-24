package marketing.ecommerce.client.service;
import lombok.RequiredArgsConstructor;
import marketing.ecommerce.client.basis.SignUp;
import marketing.ecommerce.client.basis.Customer;
import marketing.ecommerce.client.repository.CustomerRepository;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class SignUpCS           {// CustomerService
    private final CustomerRepository customerRepository;
    public Customer signUp(SignUp form){
        return customerRepository.save(Customer.from(form));}}