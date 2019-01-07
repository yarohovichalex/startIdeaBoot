package startIdeaBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    private int maxUploadSizeInMb = 10 * 1024 * 1024;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}