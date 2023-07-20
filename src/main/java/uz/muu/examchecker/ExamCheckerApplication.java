package uz.muu.examchecker;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExamCheckerApplication {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
			context = SpringApplication.run(ExamCheckerApplication.class, args);

	}

	public static void exitApplication() {
		int staticExitCode = SpringApplication.exit(context, new ExitCodeGenerator() {

			@Override
			public int getExitCode() {
				// no errors
				return 0;
			}
		});

		System.exit(staticExitCode );
	}




	//
//	public static void restart() {
//		System.out.println("Restarting spring boot app in 3 seconds !!!");
//
//		ApplicationArguments args = context.getBean(ApplicationArguments.class);
//
//		Thread thread = new Thread(() -> {
//			context.close();
//			context = SpringApplication.run(ExamCheckerApplication.class, args.getSourceArgs());
//		});
//
//		thread.setDaemon(false);
//		thread.start();
//		System.out.println("Application restarted");
//	}

}
