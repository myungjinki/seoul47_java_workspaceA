package chapter14.exception;


class NetAccess implements AutoCloseable {
	public void open() { System.out.println("접속"); }
	public void send() { System.out.println("전송"); }
	@Override
	public void close() { System.out.println("해제"); }
}

public class C127_autoclose {
	public static void main(String[] args) {
		// try-with-resource
		// 자동으로 close()까지 호출
		try (NetAccess na = new NetAccess()) {
			na.open();
			na.send();
			throw new Exception("err");
		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}
