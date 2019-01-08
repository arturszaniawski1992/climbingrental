package pl.sda.javapoz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javapoz.model.Cart;
import pl.sda.javapoz.model.entity.ProductEntity;
import pl.sda.javapoz.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private Cart cart;

    @Autowired
    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addProductToBasket(ProductEntity product, int quantity) {
        List<ProductEntity> products = cart.getProducts();
        for(int i = 0; i < quantity; i++){
            products.add(product);
        }
    }

    @Override
    public List<ProductEntity> getListOfProductsInBasket() {
        return cart.getProducts();
    }
}
