package chapter14.exception;

class IDFormatException extends Exception {	
	public IDFormatException(String message) {
		super(message);
	}
}

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return this.userID;
	}
	
	public void setUserId(String userID)
			throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 Null일 수 없습니다.");
		} else if (userID.length() < 8) {
			throw new IDFormatException(
					"아이디는 8자 이상 20자 이하로 작성해주세요.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			System.out.println( e.getMessage() );
		}
		
		userID = "1234567";
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			System.out.println( e.getMessage() );
		}
	}
}
