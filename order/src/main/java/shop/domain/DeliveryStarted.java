package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private String address;
    private Integer qty;
}
