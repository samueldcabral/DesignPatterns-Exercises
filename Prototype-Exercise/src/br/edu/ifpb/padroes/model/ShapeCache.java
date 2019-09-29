package br.edu.ifpb.padroes.model;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private HashMap<String, Shape> hashMap = new HashMap<String, Shape>();
	
	public Shape getShape(String type) {
		return (Shape) hashMap.get(type);
	}
	
	public void loadCache(String type, Shape shape) {
		hashMap.put(type, shape.clone());
	}
	
	public void listAllMaps() {
		for(Map.Entry<String, Shape> shapeMap : hashMap.entrySet()) {
			System.out.println("String: " + shapeMap.getKey() + " : " + shapeMap.getValue() + " !");
		}
	}
}
