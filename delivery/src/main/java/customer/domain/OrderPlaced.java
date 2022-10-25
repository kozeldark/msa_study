package customer.domain;

import customer.domain.*;
import customer.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
}


