package logic.controller;

import java.sql.SQLException;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import logic.account.User;
import logic.bean.ReviewBean;
import logic.dao.AccountDAO;
import logic.dao.ReviewDAO;
import logic.gui.ReviewComponent;
import logic.gui.popup.InfoPopup;
import logic.review.Review;

public class MyReviewController {
	
	private Review[] reviews;
	private User currentUser;
	
	private Pane thePane;
	
	public MyReviewController() {
		AccountDAO userDAO = AccountDAO.getInstance();
		currentUser = (User) userDAO.getAccountObject();
		reviews = getReviews();
	}
	
	private Review[] getReviews() {
		return currentUser.getMyReviews();
	}
	
	public void attachAdsTo(Pane pane) {
		thePane = pane;
		if(reviews != null) {
			float ypos = 25;
			
			for(int i = 0; i != reviews.length; i++) {
				ReviewBean bean = new ReviewBean(reviews[i]);
				ReviewComponent temp = new ReviewComponent(bean);
				temp.getReviewComponent().setLayoutX(25);
				temp.getReviewComponent().setLayoutY(ypos);
				pane.getChildren().add(temp.getReviewComponent());
				
				ypos = ypos + 200;
			}
		}
		else {
			Label tmp = new Label("Empty List!");
			tmp.setFont(new Font("Arial Bold", 50));
			tmp.setAlignment(Pos.CENTER);
			tmp.setPrefHeight(230);
			tmp.setPrefWidth(585);
			pane.getChildren().add(tmp);
		}
	}

	public String getAverage() {
		ReviewDAO reviewDao = ReviewDAO.getInstance();
		try {
			return reviewDao.getAverage(currentUser.getUsername()).toString();
		} catch (SQLException  e) {
			new InfoPopup("Media non calcolabile!", (Stage) thePane.getScene().getWindow());
			return "0";
		}
	}
}