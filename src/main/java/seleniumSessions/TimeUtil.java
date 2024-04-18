package seleniumSessions;

public class TimeUtil {

	private final static int DEFAULT_TIME=500;
	private final static int DEFAULT_SHORT_TIME=2000;
	private final static int DEFAULT_MEDIUM_TIME=5000;
	private final static int DEFAULT_LONG_TIME=10000;
	private final static int MAX_LONG_TIME=15000;
	
	public static void Default_Time() {
		try {
			Thread.sleep(DEFAULT_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	public static void Default_Short_Time() {
		try {
			Thread.sleep(DEFAULT_SHORT_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	public static void Default_Medium_Time() {
		try {
			Thread.sleep(DEFAULT_MEDIUM_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	public static void Default_Long_Time() {
		try {
			Thread.sleep(DEFAULT_LONG_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	public static void Max_Long_Time() {
		try {
			Thread.sleep(MAX_LONG_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
