package com.diegoalmeida.cursosb.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class S3Service {
	/* private Logger LOG = LoggerFactory.getLogger(S3Service.class); */

	//@Autowired
	//private AmazonS3 s3client;

	@Value("${s3.bucket}")
	private String bucketName;

	public void uploadFile(String localFilePath) {
		/*
		 * try { File file = new File(localFilePath); LOG.info("Iniciando upload");
		 * s3client.putObject(new PutObjectRequest(bucketName, "teste.png", file));
		 * LOG.info("Upload finalizado"); } catch (AmazonServiceException e) {
		 * LOG.info("AmazonServiceException: " + e.getErrorMessage());
		 * LOG.info("Status code: " + e.getErrorCode()); } catch (AmazonClientException
		 * e) { LOG.info("AmazonClientException: " + e.getMessage()); }
		 */
	}

}
