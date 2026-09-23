/*
o certo era deixar o .fxml fora, em uma pasta chamada resources, porem, para facilitar
os estudos, usei uma gambiarra no maven para conseguir colocá-lo aqui no pacote
sem problemas
*/

package p18_javaFXSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        Image icon = new Image(
                new File("misc/p16_JavaFXLogo/icon.png").toURI().toString()
        );

        stage.getIcons().add(icon);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}