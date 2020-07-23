package com.diegoalmeida.cursosb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {

	@Value("${aws.access_key_id}")
	private String awsId;

	@Value("${aws.secret_access_key}")
	private String awsKey;

	@Value("${s3.region}")
	private String region;

	// @Bean
	/*
	 * public AmazonS3 s3client() {
	 * System.out.println("Chegou aqui.aqui..aqui....aqui...aqui."); /*
	 * BasicAWSCredentials awsCred = new BasicAWSCredentials(awsId, awsKey);
	 * System.out.println("Chegou aqui tbem."); AmazonS3 s3client = null;
	 */
	/*
	 * AmazonS3 s3client =
	 * AmazonS3ClientBuilder.standard().withRegion(Regions.fromName(region))
	 * .withCredentials(new AWSStaticCredentialsProvider(awsCred)).build(); return
	 * null; }
	 */

}
