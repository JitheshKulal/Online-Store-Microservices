package com.jithcodes.inventoryservice.controller;

import com.jithcodes.inventoryservice.dto.InventoryRequest;
import com.jithcodes.inventoryservice.dto.InventoryResponse;
import com.jithcodes.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addToInventory(@RequestBody InventoryRequest inventoryRequest) {
        inventoryService.addToInventory(inventoryRequest);
    }

}
