package org.jjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableLoadTimeWeaving
@EnableTransactionManagement(mode=AdviceMode.ASPECTJ)
@SpringBootApplication
public class TransactionProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TransactionProjectApplication.class, args);
	}
}
