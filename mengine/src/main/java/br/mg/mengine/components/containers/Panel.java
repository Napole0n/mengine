package br.mg.mengine.components.containers;

import java.util.ArrayList;
import java.util.List;

import br.mg.mengine.components.NodeUtils;
import br.mg.mengine.components.scene.SceneObject;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

public class Panel extends Pane implements IContainer {

	private List<SceneObject> objects;

	public Panel( double width,double height) {
		super();
		super.setPrefSize(width,height);
		super.setWidth(width);
		super.setHeight(height);
		objects = new ArrayList<SceneObject>();
	}

	public void addSceneObject(SceneObject object, Point2D position) {
		objects.add(object);
		this.getChildren().add(NodeUtils.setNodePosition2D(object.getNode(), position));
	}

}
