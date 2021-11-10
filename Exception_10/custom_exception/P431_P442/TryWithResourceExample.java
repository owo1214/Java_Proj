package Exception_10.custom_exception.P431_P442;

public class TryWithResourceExample {	//p 440

	public static void main(String[] args) {
		try(FileInputStream fis =new FileInputStream ("file.txt")){
			fis.read();
			throw new Exception(); //강제로 예외 발생시
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
