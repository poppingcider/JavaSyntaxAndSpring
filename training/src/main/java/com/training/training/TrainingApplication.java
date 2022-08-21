/**
 * @参考
 *  "主要なアノテーションのリファレンス"
 * 　　　　https://spring.pleiades.io
 */
package com.training.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication...Spring Bootのメインクラスに付与
@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

}
