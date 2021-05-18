package com.example.restws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;

public class FileClient {

	public static final String fileName = "8.jpg";
	public static final String filePath = "C:\\Users\\apal44\\Desktop\\old\\Admission";

	public static void main(String[] args) throws FileNotFoundException {

		WebClient client = WebClient.create("http://localhost:8080/restattachment/services/fileService/upload");
		client.type("multipart/form-data");

		ContentDisposition cd = new ContentDisposition("attachment;filename=" + fileName);
		Attachment attachment = new Attachment("root", new FileInputStream(new File(filePath + "\\" + fileName)), cd);

		client.post(attachment);
	}

}
