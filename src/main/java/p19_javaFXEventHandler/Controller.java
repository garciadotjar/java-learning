package p19_javaFXEventHandler;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Controller {
    @FXML
    private Text textooi;
    public void dizerOi(ActionEvent actionEvent) {
        PauseTransition pause3seg = new PauseTransition(Duration.seconds(3));
        textooi.setText("OIIIII");
        pause3seg.setOnFinished(event -> {
            textooi.setText("de oi denovo");
        });
        pause3seg.play();
    }
}
