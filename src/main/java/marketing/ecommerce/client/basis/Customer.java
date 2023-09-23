//package marketing.ecommerce.client.basis;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import marketing.ecommerce.client.SignUp;
//import org.hibernate.envers.AuditOverride;
//import java.time.LocalDate;
//@Entity @Getter @Builder @NoArgsConstructor
//@AllArgsConstructor
//@AuditOverride(forClass = Basis.class)
//public class Customer extends Basis
//{@Id @Column(name="id",nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String password;
//    private LocalDate birth;
//    public static Customer from(SignUp form){
//        return Customer.builder()
//                .name(form.getName())
//                .password(form.getPassword())
//                .birth(form.getBirth()).build();
//    }
//}