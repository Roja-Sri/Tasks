package tasks;
interface Logger {
	default void logInfo(String msg) {
		System.out.println("Logger log::" +msg);
	}
	static void logError(String msg) {
		System.out.println("Logger log::"+msg);
	}
}
class AppLogger implements Logger{
	
}

public class Task10 {
	public static void main(String[] args) {
		
		AppLogger obj = new AppLogger();
		obj.logInfo("Compilation Successful");
		Logger.logError("Something went Wrong");
	}
}
