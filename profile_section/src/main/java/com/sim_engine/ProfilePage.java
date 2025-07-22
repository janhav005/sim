package com.sim_engine;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Arrays;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ProfilePage extends Application {

    Scene sc;
    private user currentUser;

    @Override
    public void start(Stage engine) throws Exception {
       
        BorderPane Base = new BorderPane();
        Base.setPadding(new Insets(10));

        ImageView profileIcon = new ImageView(getClass().getResource("/c3e40fe4-1d9c-4812-b10c-c2da6047c71f.jpg").toExternalForm());
        profileIcon.setFitWidth(60);
        profileIcon.setFitHeight(60);

        currentUser = new user(
    "Jane Doe",
    "jane@example.com",
    Arrays.asList("Sim 1", "Sim 2", "Sim 3")
);

        profileIcon.setOnMouseClicked(e -> {
        showProfilePopup(currentUser); // Pass in the logged-in user's object
        });

        Circle clip = new Circle(30,30,30);
        profileIcon.setClip(clip);

        Font leagueSpartan = Font.loadFont(getClass().getResourceAsStream("/fonts/LeagueSpartan-Regular.ttf"), 20);
        Image bgImage = new Image(getClass().getResource("/bgdarksim.png").toExternalForm());
        
        BackgroundImage backgroundImage = new BackgroundImage(
            bgImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.DEFAULT,
            new BackgroundSize(100,100, true, true, true, false));

        StackPane sp = new StackPane();
        sp.setBackground(new Background(backgroundImage));

        Text simName = new Text("Simulon");
             simName.setStyle("-fx-fill : white;"+
                         "-fx-font-weight: Bold;"+
                        "-fx-font-size : 40px");   

        Text disbtn = new Text("Discover");
            disbtn.setFont(leagueSpartan);
            disbtn.setStyle("-fx-fill: white;"+
                        "-fx-font-size : 19px");

        disbtn.setOnMouseEntered(e -> {
            disbtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #231538ff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        disbtn.setOnMouseExited(e -> {
            disbtn.setFill(Color.web("#cccccc"));
            disbtn.setEffect(null);
            disbtn.setStyle("-fx-underline: false;"+
                            "-fx-font-size : 19px");
        });
    
        Text home = new Text("Home");
        home.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        home.setOnMouseEntered(e -> {
        home.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        home.setOnMouseExited(e -> {
        home.setFill(Color.web("#cccccc"));
        home.setEffect(null);
        home.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });
    
        Text expbtn = new Text("Explore");
        expbtn.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        expbtn.setOnMouseEntered(e -> {
        expbtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        expbtn.setOnMouseExited(e -> {
        expbtn.setFill(Color.web("#cccccc"));
        expbtn.setEffect(null);
        expbtn.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });

      
        Text combtn = new Text("Community");
        combtn.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        combtn.setOnMouseEntered(e -> {
        combtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        combtn.setOnMouseExited(e -> {
        combtn.setFill(Color.web("#cccccc"));
        combtn.setEffect(null);
        combtn.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });

          

        Region spacer1 = new Region();
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        Region spacer2 = new Region();
        HBox.setHgrow(spacer2, Priority.ALWAYS);
        Region spacer3 = new Region();
        HBox.setHgrow(spacer3, Priority.ALWAYS);

        HBox Bar1 = new HBox(40);
        Bar1.setAlignment(Pos.CENTER_LEFT);
        Bar1.getChildren().addAll(simName,spacer1,home,combtn,disbtn,expbtn,profileIcon);
        Bar1.setMaxHeight(100);
        Bar1.setPadding(new Insets(10));
        Base.setTop(Bar1);
              VBox vb = new VBox(5,Bar1);
        sp.getChildren().add(vb);
        sc = new Scene(sp,999,665);
        sp.prefWidthProperty().bind(sc.widthProperty());
        sp.prefHeightProperty().bind(sc.heightProperty());
        engine.setScene(sc);
        engine.setResizable(false);
        engine.show();
    }

    private void showProfilePopup(user currentUser) {
    Stage popup = new Stage();
    popup.initModality(Modality.APPLICATION_MODAL);
    popup.setTitle("Profile");

    // User details
    Label nameLabel = new Label("Name: " + currentUser.getUsername());
    Label emailLabel = new Label("Email: " + currentUser.getEmail());
    nameLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");
    emailLabel.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");

    // Favourites section
    Label favLabel = new Label("Favourites:");
    favLabel.setStyle("-fx-text-fill: #b673f8; -fx-font-size: 16px; -fx-font-weight: bold;");
    ListView<String> favList = new ListView<>();
    favList.getItems().addAll(currentUser.getFavourites());

    // Optionally: Add a "Run Simulation" button for the selected favourite
    Button runBtn = new Button("Run Selected Simulation");
    runBtn.setOnAction(e -> {
        String selectedSim = favList.getSelectionModel().getSelectedItem();
        if (selectedSim != null) {
            // Implement simulation launch logic here
        }
    });

    VBox content = new VBox(10, nameLabel, emailLabel, favLabel, favList, runBtn);
    content.setStyle("-fx-background-color: #231538ff; -fx-padding: 20px;");
    content.setAlignment(Pos.TOP_LEFT);

    Scene popupScene = new Scene(content, 340, 380);
    popup.setScene(popupScene);

    // Show in a corner (e.g., bottom right)
    popup.setX(999);  // Adjust according to your main window size
    popup.setY(665);
    popup.setResizable(false);
    popup.show();

}

    
}
