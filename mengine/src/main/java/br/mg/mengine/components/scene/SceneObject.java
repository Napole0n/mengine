package br.mg.mengine.components.scene;

import javafx.scene.Node;

public class SceneObject {

	private Node node;

	public SceneObject(Node nodeIn) {
		this.node = nodeIn;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
