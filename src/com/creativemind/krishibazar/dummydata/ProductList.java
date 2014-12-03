package com.creativemind.krishibazar.dummydata;

import java.util.ArrayList;

import com.creativemind.krishibazar.R;

public class ProductList {
	public static ArrayList<Product> productsRawMaterial;
	public static ArrayList<Product> productsProducedMaterial;

	public static void populateRawMaterialData() {
		productsRawMaterial = new ArrayList<>();
		
		// adding apple
		Product product = new Product();
		product.setName("Apple");
		product.setImage(R.drawable.apple);
		productsRawMaterial.add(product);

		// adding carrot
		product = new Product();
		product.setName("Carrot");
		product.setImage(R.drawable.carrot);
		productsRawMaterial.add(product);

		// adding garlic
		product = new Product();
		product.setName("Garlic");
		product.setImage(R.drawable.garlic);
		productsRawMaterial.add(product);

		// adding ginger
		product = new Product();
		product.setName("Ginger");
		product.setImage(R.drawable.ginger);
		productsRawMaterial.add(product);

		// adding carrot
		product = new Product();
		product.setName("Mango");
		product.setImage(R.drawable.mango);
		productsRawMaterial.add(product);

		// adding onion
		product = new Product();
		product.setName("Onion");
		product.setImage(R.drawable.onion);
		productsRawMaterial.add(product);

		// adding onion
		product = new Product();
		product.setName("Orange");
		product.setImage(R.drawable.orange);
		productsRawMaterial.add(product);

		// adding potato
		product = new Product();
		product.setName("Potato");
		product.setImage(R.drawable.potato);
		productsRawMaterial.add(product);

		// adding tomato
		product = new Product();
		product.setName("Tomato");
		product.setImage(R.drawable.tomato);
		productsRawMaterial.add(product);
	}

	public static void populateProducedMaterialData() {
		productsProducedMaterial = new ArrayList<>();
		Product product;
		// adding bean
		product = new Product();
		product.setName("Bean");
		product.setImage(R.drawable.bean);
		productsProducedMaterial.add(product);

		// adding sugar
		product = new Product();
		product.setName("Sugar");
		product.setImage(R.drawable.sugar);
		productsProducedMaterial.add(product);
	}
}
