package customer.domain;

import customer.domain.*;
import customer.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;

    public Shipped(){
        super();
    }
}
