package hello.proxy.config.v1_proxy;

import hello.proxy.app.v1.OrderControllerV1;
import hello.proxy.app.v1.OrderControllerV1Impl;
import hello.proxy.app.v1.OrderRepositoryV1;
import hello.proxy.app.v1.OrderRepositoryV1Impl;
import hello.proxy.app.v1.OrderServiceV1;
import hello.proxy.app.v1.OrderServiceV1Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterfaceProxyConfig {

    @Bean
    public OrderControllerV1 orderController() {
        return new OrderControllerV1Impl(orderService());
    }

    @Bean
    public OrderServiceV1 orderService() {
        return new OrderServiceV1Impl(orderRepository());
    }

    @Bean
    public OrderRepositoryV1 orderRepository() {
        return new OrderRepositoryV1Impl();
    }
}
