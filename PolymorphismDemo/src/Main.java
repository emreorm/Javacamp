

public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		 * EmailLogger(), new DataBaseLogger() }; for (BaseLogger baseLogger : loggers)
		 * { baseLogger.Log("Log mesaj");
		 * 
		 * }
		 */
       CustomerManager customerManager = new CustomerManager(new EmailLogger());
       customerManager.Add();
       
	}

}
