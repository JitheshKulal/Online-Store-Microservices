package com.jithcodes.inventoryservice.service;

import com.jithcodes.inventoryservice.dto.InventoryRequest;
import com.jithcodes.inventoryservice.dto.InventoryResponse;
import com.jithcodes.inventoryservice.model.Inventory;
import com.jithcodes.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
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


    public void addToInventory(InventoryRequest inventoryRequest) {
        Inventory inventory = Inventory.builder()
                .id(inventoryRequest.getId())
                .skuCode(inventoryRequest.getSkuCode())
                .quantity(inventoryRequest.getQuantity())
                .build();

        inventoryRepository.save(inventory);
        log.info("Inventory for skuCode: {} is saved", inventory.getSkuCode());
    }
}
