package Exception_10.custom_exception.P431_P442;

public class FileInputStream implements AutoCloseable {	//p439  //구현클래스 (AutoClose)
	private String file;
	
	public FileInputStream (String file) {
		this.file =file;
	}
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
