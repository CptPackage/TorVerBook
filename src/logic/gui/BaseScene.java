package logic.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class BaseScene {
	
	protected Scene scene;
	protected Button languageButton;
	
	protected BaseScene() {
		Pane pane = new Pane();
		scene = new Scene(pane, 1200, 750);

		try {
			FileInputStream input = new FileInputStream("img/logo.png");
			Image image = new Image(input);
	        ImageView imageView = new ImageView(image);
	        imageView.setOpacity(0.05);
	        pane.getChildren().add(imageView);
		} catch (FileNotFoundException e) {
			new MyPopup(e.getMessage(), (Stage)pane.getScene().getWindow());
		}
		
		Label label1 = new Label("TorVerBook");
        label1.setPrefHeight(150);
        label1.setPrefWidth(1200);
        label1.setStyle("-fx-background-color: #024a00");
        label1.setTextFill(Color.WHITE);
        label1.setAlignment(Pos.CENTER);
        label1.setFont(new Font("Arial", 70));
        pane.getChildren().add(label1);
        
        Label label2 = new Label();
        label2.setLayoutY(143);
        label2.setPrefHeight(17);
        label2.setPrefWidth(1200);
        label2.setStyle("-fx-background-color: #f7e178");
        pane.getChildren().add(label2);
        
        Label label3 = new Label();
        label3.setLayoutY(151);
        label3.setPrefHeight(17);
        label3.setPrefWidth(1200);
        label3.setStyle("-fx-background-color: #024a00");
        pane.getChildren().add(label3);
        
        languageButton = new Button("ENG");
        languageButton.setLayoutX(1050);
        languageButton.setLayoutY(50);
        languageButton.setMnemonicParsing(false);
        languageButton.setFont(new Font("Arial", 16));
        languageButton.setPrefHeight(30);
        languageButton.setPrefWidth(80);
        languageButton.setOnMouseClicked(event ->
        	changeLanguage()
        );
        pane.getChildren().add(languageButton);
    }
	
	public void changeLanguage() { //apply observer GoF
		if(languageButton.getText().equals("ITA"))
			languageButton.setText("ENG");
		else
			languageButton.setText("ITA");
	}
	
	public Scene getScene() {
		return scene;
	}

}
