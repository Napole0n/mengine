package br.mg.mengine.components;

import javafx.geometry.Point2D;
import javafx.scene.Node;

public class NodeUtils {
	
	
	public static Node setNodePosition2D(Node node, Point2D position) {
		node.setLayoutX(position.getX());
		node.setLayoutY(position.getY());
		return node;
	}

}
