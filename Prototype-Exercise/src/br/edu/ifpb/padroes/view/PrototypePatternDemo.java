package br.edu.ifpb.padroes.view;

import br.edu.ifpb.padroes.model.Circle;
import br.edu.ifpb.padroes.model.Rectangle;
import br.edu.ifpb.padroes.model.Shape;
import br.edu.ifpb.padroes.model.ShapeCache;
import br.edu.ifpb.padroes.model.Square;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		ShapeCache sc = new ShapeCache();
		sc.loadCache("Circle", c);
		sc.loadCache("Rectangle", r);
		sc.loadCache("Square", s);
		
		sc.listAllMaps();
		
		Shape unknown = sc.getShape("Circle");
		System.out.println(unknown.getType());
	}

}
