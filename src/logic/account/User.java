package logic.account;

import java.util.ArrayList;
import java.util.List;

import logic.Message;
import logic.Review;
import logic.ad.Ad;

public final class User extends Account{
	
	//User's account info
	private int numAds;
	private int rank;
	
	private List<Ad> ownAd;
	List<User> relatedUser = null;
	List<Review> ownReview = null;
	
	public User(String name, String surname, String address, String username, String email, String pwdHash) {
		super(name, surname, address, username, email, pwdHash);
		loadOwnAds();
		loadOwnReviews();
		loadRelatedUsers();
	}
	
	//methods for init User object
	
	private void loadOwnReviews() {}
	
	private void loadRelatedUsers() {}
	
	private void loadOwnAds() {}
	
	//methods for user's actions
	
	public void writeReview(User dest, String mex, byte rank) {}
	
	public void addAd(Ad ad) {}
	
	public void removeAd(Ad ad){}
	
	public void saveInFavoriteList(Ad ad) {}
	
	private void addRelatedUser(User u) {
		if(relatedUser == null) {
			relatedUser = new ArrayList<>();
		}
		
		relatedUser.add(u);
	}
	
	public void changeProfileSettings(String name, String surname, String address, int age, String username, String email, String pwdHash){
	}
	
	public void deleteAd(Ad ad) {}
	
	public void markAsSold(Ad ad) {}
	
	public void sendMessage(String mex, User dest) {
		Message m = new Message(mex, dest);
		m.send();
		this.addRelatedUser(dest);
	}
	
	public void sendEmail(){}
}
