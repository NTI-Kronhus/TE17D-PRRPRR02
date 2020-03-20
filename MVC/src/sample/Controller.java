package sample;

import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.io.File;
import java.rmi.server.ExportException;

public class Controller {

    @FXML
    private Canvas _canvas;

    @FXML
    private ColorPicker _colorPicker;

    @FXML
    private TextField _brushSize;

    @FXML
    private CheckBox _eraser;

    public void initialize() {

    }

    public void onSave() {
        try {
            Image snapShot = _canvas.snapshot(null, null);
            ImageIO.write(SwingFXUtils.fromFXImage(snapShot, null), "png", new File("paint.png"));
        }
        catch (Exception e) {
            System.out.println("Failed to save image: " + e);
        }
    }

    public void onExit() {
        Platform.exit();
    }
}
