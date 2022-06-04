package com.geekbrains.geekmarketwinter.utils;

import com.geekbrains.geekmarketwinter.entites.Product;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLoggingAspect {

    @After("execution(public void com.geekbrains.geekmarketwinter.services.ShoppingCartService.addToCart(..))") // pointcut expression
    public void aopSimpleMethod() {
        System.out.println("Product was added in cart...");
    }
}
