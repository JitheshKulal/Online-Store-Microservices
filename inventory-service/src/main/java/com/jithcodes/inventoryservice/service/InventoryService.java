package com.jithcodes.inventoryservice.service;

import com.jithcodes.inventoryservice.model.Inventory;
import com.jithcodes.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private  final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
         Inventory inventory = inventoryRepository.findBySkuCode(skuCode);
         if(inventory == null){
             return false;
         }
         Integer quantity = inventory.getQuantity();
         return quantity > 0;
    }


}
