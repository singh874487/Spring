package com.example.restws;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.example.restws.model.CheckList;

@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, CheckList checkList) {

		new Thread() {
			public void run() {

				if (checkList == null || checkList.getChecks() == null || checkList.getChecks().size() == 0) {
					response.resume(new BadRequestException());
				}
				response.resume(true);
			}

		}.start();
	}

}
