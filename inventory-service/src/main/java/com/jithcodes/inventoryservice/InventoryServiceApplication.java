package com.jithcodes.inventoryservice;

import com.jithcodes.inventoryservice.model.Inventory;
import com.jithcodes.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	// pre data loading
	// Loads the data while startup
//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_13");
//			inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();
//			inventory1.setSkuCode("pixel_8a");
//			inventory1.setQuantity(0);
//
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
//		};
//	}

}
