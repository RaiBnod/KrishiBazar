package com.creativemind.krishibazar.dummydata;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Price {
	public static HashMap<Date, Float> price;
	public static ArrayList<HashMap<Date, Float>> pricesRawMaterial;
	public static ArrayList<HashMap<Date, Float>> pricesProducedMaterial;
	
	static Random rand = new Random();
	
	public static HashMap<Date, Float> funcPrice(float minPrice) {
		price = new HashMap<>();
		for(int i=0; i<30; i++) {
			Date date = new Date(2014, 11, i + 1);
			price.put(date, (float) (minPrice + rand.nextInt(20)));
		}
		return price;
	}
	
	public static void populateRawMaterialPrice() {
		pricesRawMaterial = new ArrayList<>();
		HashMap<Date, Float> applePrice = Price.funcPrice(100);
		HashMap<Date, Float> carrotPrice = Price.funcPrice(30);
		HashMap<Date, Float> garlicPrice = Price.funcPrice(120);
		HashMap<Date, Float> gingerPrice = Price.funcPrice(30);
		HashMap<Date, Float> mangoPrice = Price.funcPrice(60);
		HashMap<Date, Float> onionPrice = Price.funcPrice(50);
		HashMap<Date, Float> orangePrice = Price.funcPrice(40);
		HashMap<Date, Float> potatoPrice = Price.funcPrice(80);
		HashMap<Date, Float> tomatoPrice = Price.funcPrice(40);
		
		pricesRawMaterial.add(applePrice);
		pricesRawMaterial.add(carrotPrice);
		pricesRawMaterial.add(garlicPrice);
		pricesRawMaterial.add(gingerPrice);
		pricesRawMaterial.add(mangoPrice);
		pricesRawMaterial.add(onionPrice);
		pricesRawMaterial.add(orangePrice);
		pricesRawMaterial.add(potatoPrice);
		pricesRawMaterial.add(tomatoPrice);
	}
	
	public static void populateProducedMaterialPrice() {
		pricesProducedMaterial = new ArrayList<>();
		HashMap<Date, Float> beanPrice = Price.funcPrice(80);
		HashMap<Date, Float> sugarPrice = Price.funcPrice(80);
		
		pricesProducedMaterial.add(beanPrice);
		pricesProducedMaterial.add(sugarPrice);
	}
}
