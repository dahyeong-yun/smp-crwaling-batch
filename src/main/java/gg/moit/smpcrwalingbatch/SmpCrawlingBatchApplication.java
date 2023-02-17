package gg.moit.smpcrwalingbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SmpCrawlingBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmpCrawlingBatchApplication.class, args);
    }
}
