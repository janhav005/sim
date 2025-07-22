package com.sim_engine;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class animation {
    
    public static StackPane createAnimatedCard(int delayMillis) {
    StackPane card = new StackPane();
    card.setPrefSize(200,200);
    card.setStyle("-fx-background-color: #ffffff44; -fx-background-radius: 15;");
    
    // Add animation (rotate or float)
 javafx.animation.TranslateTransition translate = new javafx.animation.TranslateTransition(javafx.util.Duration.seconds(2), card);
    translate.setByX(20); // move 20px right
    translate.setAutoReverse(true);
    translate.setCycleCount(javafx.animation.Animation.INDEFINITE);
    translate.setDelay(javafx.util.Duration.millis(delayMillis));
    translate.play();

    return card;
}

// public static HBox createDots(int count) {
//     HBox dots = new HBox(5);
//     dots.setAlignment(Pos.CENTER);
//     for (int i = 0; i < count; i++) {
//         Circle dot = new Circle(4);
//         dot.setFill(i == 0 ? Color.WHITE : Color.web("#bbbbbb"));
//         dots.getChildren().add(dot);
//     }
//     return dots;
// }

    public static Node createReviewCard(String username, String review, int rating) {
    VBox reviewCard = new VBox(15);
    reviewCard.setPrefSize(200, 200);
    reviewCard.setPadding(new Insets(8));
    reviewCard.setStyle("-fx-background-color: #32234f88; -fx-background-radius: 6;");
    
    Text userText = new Text(username + "   ");
    userText.setStyle("-fx-font-size: 14px; -fx-fill: #b673f8;");
    Text reviewText = new Text("\"" + review + "\"");
    reviewText.setStyle("-fx-font-size: 18px; -fx-fill: white;");
    
    HBox ratingBox = new HBox(2);
    for (int i = 0; i < 5; i++) {
        Text star = new Text(i < rating ? "★" : "☆");
        star.setStyle("-fx-fill: #ffd700; -fx-font-size: 17px;");
        ratingBox.getChildren().add(star);
    }
    
    reviewCard.getChildren().addAll(userText, ratingBox, reviewText);
    return reviewCard;
}

    public static HBox createDots(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDots'");
    }


}
