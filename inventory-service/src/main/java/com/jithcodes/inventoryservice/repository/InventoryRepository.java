package com.jithcodes.inventoryservice.repository;

import com.jithcodes.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Inventory findBySkuCode(String skuCode);
}
