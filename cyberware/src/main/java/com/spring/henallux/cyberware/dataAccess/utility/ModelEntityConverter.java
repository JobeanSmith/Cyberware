package com.spring.henallux.cyberware.dataAccess.utility;

import com.spring.henallux.cyberware.model.*;
import com.spring.henallux.cyberware.dataAccess.entity.*;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ModelEntityConverter {
    private Mapper mapper = new DozerBeanMapper();

    public CategoryEntity categoryModelToCategoryEntity(Category category) {
        return mapper.map(category, CategoryEntity.class);
    }
    public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity) {
        return mapper.map(categoryEntity, Category.class);
    }

    public CategoryTranslationEntity categoryTranslationModelToCategoryTranslationEntity(CategoryTranslation categoryTranslation) {
        return mapper.map(categoryTranslation, CategoryTranslationEntity.class);
    }
    public CategoryTranslation categoryTranslationEntityToCategoryTranslationModel(CategoryTranslationEntity categoryTranslationEntity) {
        return mapper.map(categoryTranslationEntity, CategoryTranslation.class);
    }

    public CustomerEntity customerModelToCustomerEntity(Customer customer) {
        return mapper.map(customer, CustomerEntity.class);
    }
    public Customer customerEntityToCustomerModel(CustomerEntity customerEntity) {
        return mapper.map(customerEntity, Customer.class);
    }

    public ItemEntity itemModelToItemEntity(Item item) {
        return mapper.map(item, ItemEntity.class);
    }
    public Item itemEntityToItemModel(ItemEntity itemEntity) {
        return mapper.map(itemEntity, Item.class);
    }

    public LanguageEntity languageModelToLanguageEntity(Language language) {
        return mapper.map(language, LanguageEntity.class);
    }
    public Language languageEntityToLanguageModel(LanguageEntity languageEntity) {
        return mapper.map(languageEntity, Language.class);
    }

    public PurchaseEntity purchaseModelToPurchaseEntity(Purchase purchase) {
        return mapper.map(purchase, PurchaseEntity.class);
    }
    public Purchase purchaseEntityToPurchaseModel(PurchaseEntity purchaseEntity) {
        return mapper.map(purchaseEntity, Purchase.class);
    }

    public PurchaseLineEntity purchaseLineModelToPurchaseLineEntity(PurchaseLine purchaseLine) {
        return mapper.map(purchaseLine, PurchaseLineEntity.class);
    }
    public PurchaseLine purchaseLineEntityToPurchaseLineModel(PurchaseLineEntity purchaseLineEntity) {
        return mapper.map(purchaseLineEntity, PurchaseLine.class);
    }
}