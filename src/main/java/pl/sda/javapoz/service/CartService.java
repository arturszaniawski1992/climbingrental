package pl.sda.javapoz.service;

import pl.sda.javapoz.model.entity.ProductEntity;

import java.util.List;

public interface CartService {
    void addProductToBasket(ProductEntity product, int quantity);

    List<ProductEntity> getListOfProductsInBasket();
}
