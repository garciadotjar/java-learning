//javafx tests
//nao é o meu foco, porem, quero aprender para ajudar em projetos pessoais

package p16_javaFXStages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
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
                new File("misc/p16_javaFXStages/icon.png").toURI().toString()
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
        root.getChildren().add(text);

        stage.show();
    }
}