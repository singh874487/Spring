package com.example.restws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.springframework.stereotype.Service;

@Service
@Path("/fileService")
public class FileService {

	private static final String FILE_PATH = "C:\\Users\\apal44\\Desktop\\upload\\uploaded.jpg";

	@Path("/upload")
	@POST
	public void upload(List<Attachment> attachments) throws FileNotFoundException, IOException {
		System.out.println("=============Inside Upload Method================");
		for (Attachment attachment : attachments) {
			copyFile(attachment.getDataHandler().getInputStream());

		}
		System.out.println("=============File Upload Completed================");
	}

	private void copyFile(InputStream inputStream) throws FileNotFoundException, IOException {
		OutputStream out = null;
		int read = 0;
		byte[] bytes = new byte[1024];

		out = new FileOutputStream(new File(FILE_PATH));
		while ((read = inputStream.read(bytes)) != -1) {
			out.write(bytes, 0, read);
		}
		out.flush();
		out.close();
	}

}