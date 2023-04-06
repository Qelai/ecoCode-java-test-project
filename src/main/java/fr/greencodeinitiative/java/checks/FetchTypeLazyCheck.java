package fr.greencodeinitiative.java.checks;



import fr.greencodeinitiative.java.utils.User;
import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.regex.Pattern;
@Entity
class FetchTypeLazyCheck {
    FetchTypeLazyCheck(FetchTypeLazyCheck mc) {
    }

    @Id
    @GeneratedValue
    @Column(name="ORDER_ID")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;
   
}