package com.sim_engine;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.AnimationTimer;
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
import javafx.stage.Stage;


public class exp extends Application {

    Scene sc;

    @Override
    public void start(Stage engine) throws Exception {
       
        BorderPane Base = new BorderPane();
        Base.setPadding(new Insets(10));

        ImageView profileIcon = new ImageView(getClass().getResource("/c3e40fe4-1d9c-4812-b10c-c2da6047c71f.jpg").toExternalForm());
        profileIcon.setFitWidth(60);
        profileIcon.setFitHeight(60);

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

        HBox bar2 = new HBox();

       HBox cardContainer = new HBox(40);
cardContainer.setPadding(new Insets(30));
cardContainer.setAlignment(Pos.CENTER_LEFT);

for (int i = 0; i < 6; i++) {
    cardContainer.getChildren().add(animation.createAnimatedCard(i*300));
}

ScrollPane scrollPane = new ScrollPane(cardContainer);
scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
scrollPane.setPrefHeight(250);
scrollPane.setFitToHeight(true);
scrollPane.setPannable(false);
scrollPane.setStyle("-fx-background: transparent; -fx-background-color: transparent;");

        AnimationTimer timer = new AnimationTimer() {
            private long lastUpdate = 0;
            private double direction = 1; // 1 for right, -1 for left

            @Override
            public void handle(long now) {
                if (lastUpdate == 0) {
                    lastUpdate = now;
                    return;
                }
                double elapsedSeconds = (now - lastUpdate) / 1_000_000_000.0;
                lastUpdate = now;

                double scrollSpeed = 0.1; // scroll speed per second, adjust to your liking
                double hValue = scrollPane.getHvalue();

                hValue += direction * scrollSpeed * elapsedSeconds;

                // Reverse direction at edges for continuous back-and-forth scrolling
                if (hValue >= 1) {
                    hValue = 1;
                    direction = -1;
                } else if (hValue <= 0) {
                    hValue = 0;
                    direction = 1;
                }

                scrollPane.setHvalue(hValue);
                }
        };

        timer.start();

        VBox contentWrapper = new VBox(20);
        contentWrapper.setAlignment(Pos.TOP_CENTER);
        // HBox dotsContainer = animation.createDots(8); // Capture dots
        contentWrapper.getChildren().addAll(scrollPane);

        bar2.getChildren().add(contentWrapper);

        VBox bar3 = new VBox();

        VBox reviewsList1 = new VBox(12);
        reviewsList1.getChildren().addAll(
        animation.createReviewCard("Alice", "Amazing simulation!", 5)
        );
        reviewsList1.setPadding(new Insets(15,20,15,20));
        
        VBox reviewsList2 = new VBox(12);
        reviewsList2.getChildren().addAll(
        animation.createReviewCard("Alice", "Amazing simulation!", 5)
        );
        reviewsList2.setPadding(new Insets(15,20,15,20));

        VBox reviewsList3 = new VBox(12);
        reviewsList3.getChildren().addAll(
        animation.createReviewCard("Alice", "Amazing simulation!", 5)
        );
        reviewsList3.setPadding(new Insets(15,20,15,20));

        HBox reviewsBox = new HBox();
        reviewsBox.getChildren().addAll(reviewsList1, reviewsList2, reviewsList3);

        // Label for reviews section

        VBox review = new VBox();
        Text reviewsTitle = new Text("User Reviews");
        reviewsTitle.setStyle("-fx-font-size: 20px; -fx-fill: #b673f8; -fx-font-weight: bold;");

        review.getChildren().addAll(reviewsTitle,reviewsBox);

        VBox reviewsSection = new VBox(10, review);
        reviewsSection.setPadding(new Insets(15,20,15,20));
        bar3.getChildren().add(reviewsSection);

        VBox Mainvb = new VBox(5,Bar1,bar2,bar3);
        sp.getChildren().add(Mainvb);
        sc = new Scene(sp,999,665);
        sp.prefWidthProperty().bind(sc.widthProperty());
        sp.prefHeightProperty().bind(sc.heightProperty());
        engine.setScene(sc);
        engine.setResizable(false);
        engine.show();
    }

    
}