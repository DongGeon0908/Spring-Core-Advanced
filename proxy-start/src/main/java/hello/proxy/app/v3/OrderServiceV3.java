package hello.proxy.app.v3;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderRepositoryV2;

    public OrderServiceV3(OrderRepositoryV3 orderRepositoryV3) {
        this.orderRepositoryV2 = orderRepositoryV3;
    }

    public void orderItem(String itemId) {
        orderRepositoryV2.save(itemId);
    }
}