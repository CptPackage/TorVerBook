package logic.db;

import java.time.LocalDate;

import logic.account.User;
<<<<<<< HEAD
import logic.stuff.Message;
import logic.utils.DateAndTimeUtils;
=======
import logic.ad.Ad;
>>>>>>> 3a1478938579a45865abae49a1d21a80aed9feeb

/* DOC. TIPS:: Fields Types Are (CONDITION:SELECT,INSERT,UPDATE,QUERY) */
public interface QueriesGenerator {

	public static String getLogInQuery(String username, String password) {
		/* CONDITION FIELDS: [USERNAME] [PASSWORD] */
		return "SELECT * FROM User WHERE Username = '" + username + "'" + " AND Password = '" + password + "';";
	}

	public static String getSignUpCommand(User user) {
		/*
		 * INSERT FIELDS: [USERNAME] [NAME] [SURNAME] [BIRTHDAY] [PHONENUMBER] [EMAIL]
		 * [PASSWORD] [IS_BANNED] [N_VIOLATIONS] [MONEY]
		 */
		return "INSERT INTO User VALUES ('" + user.getUsername() + "', '" + user.getName() + "', '" + user.getSurname()
				+ "', '" + user.getBirthDateString() + "', '" + user.getPhoneNumber() + "', " + "'" + user.getEmail()
				+ "', '" + user.getPassword() + "', FALSE, 0, 0)";
	}

	public static String getUpdateUserInfoCommand(User user, String actualUsername) {
		/*
		 * UPDATE FIELDS: [USERNAME] [NAME] [SURNAME] [BIRTHDAY] [PHONENUMBER] [EMAIL]
		 * [PASSWORD]
		 */
		/* CONDITION FIELDS: [CURRENT_USERNAME] */
		return "UPDATE User SET Username = '" + user.getUsername() + "', Name = '" + user.getName() + "', Surname = '"
				+ user.getSurname() + "', Birthdate = '" + user.getBirthDateString() + "', " + "PhoneNumber = '"
				+ user.getPhoneNumber() + "', Email = '" + user.getEmail() + "', Password = '" + user.getPassword()
				+ "' WHERE Username = '" + actualUsername + "';";
	}

	public static String getLatestMessagesQuery(User srcUser, User dstUser, int maxNumberOfMessages) {
		/* CONDITION FIELDS: [WRITERUSER] [RECEIVERUSER] */
		/* QUERY FIELDS: [QUERY_LIMIT] */
		return "SELECT * FROM Message WHERE WriterUser='" + srcUser.getUsername() + "' AND ReceiverUser='"
				+ dstUser.getUsername() + "' ORDER BY Time AND Date Desc Limit " + maxNumberOfMessages;
	}

	public static String sendMessageCommand(User srcUser, User dstUser, Message message) {
		/* INSERT FIELDS: [WRITERUSER] [RECEIVERUSER] [TEXT] [TIME] [DATE] */
		return "INSERT INTO Message (WriterUser,ReceiverUser,Text,Time,Date) VALUES ('" + srcUser.getUsername() + "',"
				+ dstUser.getUsername() + "'," + message.getText() + "'," + DateAndTimeUtils.getTimeString() + ",'"
				+ DateAndTimeUtils.getDateString() + "')";
	}

	public static String getHomepageAdsQuery() {
		return "SELECT * FROM Ad WHERE isConvalidated = TRUE ORDER BY Highlight DESC, Date DESC LIMIT 100";
	}
	
	public static String getMyAdsQuery(String username) {
		return "SELECT * FROM Ad WHERE User = '" + username + "' ORDER BY Date DESC";
	}
	
	public static String getUpdateReviewStateCommand(String writer, String receiver) {
		return "UPDATE Review SET (isConvalidated, RuleChecker) = (TRUE, '@CarloRossi') WHERE WriterUser = '" + writer + "' AND ReceiverUser = '" + receiver + "';";
	}
		
	public static String getDeleteReviewCommand(String writer, String receiver) {
		return "DELETE FROM Review WHERE WriterUser = '" + writer + "' AND ReceiverUser = '" + receiver + "';";
	}
		
	public static String getMyReviewQuery(String username) {
		return "SELECT * FROM Review WHERE isConvalidated = TRUE AND ReceiverUser = '" + username + "' ORDER BY Time ASC";
	}
		
	public static String getFavouriteAdsQuery(String username) {
		return "SELECT ID, Date, Description, Title, Price, Course, Type, isSold, Quantity, StartHighlight, FinishHighlight, "
				+ "isConvalidated, Highlight, Ad.User, RuleChecker FROM Ad JOIN FavouriteList ON ID_Ad = ID WHERE FavouriteList.User = '" + username + "';";
	}
	
	public static String getAddAdToFavouriteListCommand(long id, String username) {
		return "INSERT INTO FavouriteList VALUES ('" + id + "', '" + username + "');";
	}
	
	public static String getRCReviewQuery() {
		return "SELECT * FROM Review WHERE isConvalidated = FALSE ORDER BY Time ASC";
	}
	
	public static String getHighlightQuery(String hlType) {
		return "SELECT * FROM HighLight WHERE Type = '" + hlType + "'";
	}
	
	public static String getNumViolationsQuery(String username) {
		return "SELECT NumViolations FROM User WHERE Username = '" + username + "';";
	}
	
	public static String getBannedCommand(String username) {
		return "UPDATE User SET isBanned = TRUE WHERE Username = '" + username + "';";
	}
	
	public static String getIncNumViolationsCommand(String username, int violations) {
		return "UPDATE User SET NumViolations = " + violations + " WHERE Username = '" + username + "';";
	}
	
	public static String getAddAdCommand(Ad ad) {
		return "INSERT INTO Ad (Date, Description, Title, Price, Course, Type, Quantity, StartHighlight, FinishHighlight, Highlight, User, RuleChecker) "
				+ "VALUES ('" + LocalDate.now().toString() + "', '" + ad.getDescription() +"', '" + ad.getTitle() + "', '" + ad.getPrice() + "', '" + ad.getCategory().toString() + "', '" +
				ad.getType().toString() + "', '" + ad.getQuantity() + "', '" + ad.getStartHighlightStr() + "', '" + ad.getFinishHighlightStr() + "', '" + ad.getHighlightTypeStr() + "', '" + ad.getMyUserStr() + "', NULL);";
	}
}
