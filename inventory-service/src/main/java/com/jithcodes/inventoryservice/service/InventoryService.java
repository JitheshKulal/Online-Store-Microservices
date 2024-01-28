package com.jithcodes.inventoryservice.service;

import com.jithcodes.inventoryservice.dto.InventoryResponse;
import com.jithcodes.inventoryservice.model.Inventory;
import com.jithcodes.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private  final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode) {
         List<Inventory> inventories = inventoryRepository.findBySkuCodeIn(skuCode);

         return inventories.stream().map(inventory ->
             InventoryResponse.builder()
                     .skuCode(inventory.getSkuCode())
                     .isInStock(inventory.getQuantity() > 0)
                     .build()
         ).toList();
    }


}
