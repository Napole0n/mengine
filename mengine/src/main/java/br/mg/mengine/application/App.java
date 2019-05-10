package br.mg.mengine.application;

import br.mg.mengine.components.containers.Panel;
import br.mg.mengine.components.scene.SceneObject;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

	
		Panel painel = new Panel(800, 600);
		Rectangle rect = new Rectangle(50, 25);
		rect.setFill(Color.AQUA);
		SceneObject obj = new SceneObject(rect);
		Point2D pos = new Point2D(painel.getWidth() / 2 - rect.getWidth(), painel.getHeight() / 2 - rect.getHeight());
		painel.addSceneObject(obj, pos);
		Scene scene = new Scene(painel);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
