package com.geekbrains.geekmarketwinter.aspect;

import com.geekbrains.geekmarketwinter.entites.Product;
import com.geekbrains.geekmarketwinter.utils.ShoppingCart;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Configuration
@Aspect
@Component
//@Configuration
public class ShoppingCartAspect {

    @Before("execution(public * com.geekbrains.geekmarketwinter.services.ShoppingCartService.addToCart(..))")
    public void addToCart() {
        System.out.println("Добавляем товар в корзину");
    }

    @AfterReturning(
            pointcut = "execution(public * com.geekbrains.geekmarketwinter.services.ShoppingCartService.getCurrentCart(..))",
            returning = "result")
    public void afterGetTotalCoast(ShoppingCart result) {
        System.out.println("Стоимость товаров в корзине : " + result.getTotalCost());
    }

//    @After("execution(public * com.geekbrains.geekmarketwinter.services.ProductService.saveProduct(..)) && args(product)")
//    public void beforeEditProduct(Product product) {
//        if(product.getId() != 0){
//            System.out.println("Товар изменен: " + product.getTitle());
//        }else{
//            System.out.println("Введен новый товар: " );
//        }
//
//    }

    @Before("execution(public * com.geekbrains.geekmarketwinter.services.ProductService.saveProduct(..))")
    public void beforeEditProduct() {
        System.out.println("Товар изменен");
    }

    @Before("execution(public * com.geekbrains.geekmarketwinter.services.ShoppingCartService.removeFromCart(..)) && args(*, productId, ..)")
    public void beforeAddToCart(Long productId) {
        System.out.println("Удаляем товар с ID " + productId + " из корзины");
    }

}