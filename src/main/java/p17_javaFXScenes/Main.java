package p17_javaFXScenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 410,720, Color.MEDIUMPURPLE);

        Image icon = new Image(
                new File("misc/p17_javaFXScenes/icon.png").toURI().toString()
        );
        stage.setX(50);
        stage.setY(50);

        stage.setTitle("Garcia - Primeiro teste de JavaFX");
        stage.setResizable(false);


        stage.getIcons().add(icon);
        stage.setScene(scene);

        Text text = new Text("JavaFX text");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.WHITESMOKE);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(100);
        line.setEndY(100);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);

        ImageView imageView = new ImageView(icon);
        imageView.setX(60);
        imageView.setY(150);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(imageView);

        stage.show();
    }
}