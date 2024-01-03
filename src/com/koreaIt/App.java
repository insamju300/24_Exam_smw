package com.koreaIt;
import static com.koreaIt.Container.INPUT_CMD;
import static com.koreaIt.Container.START_STRING;
import static com.koreaIt.Container.sc;

import java.util.Optional;

import com.koreaIt.controller.WiseSayingController;

public class App {
	WiseSayingController controller = new WiseSayingController();
	public void run() {
		System.out.print(START_STRING);
		
		while(true) {
			System.out.print(INPUT_CMD);
			String cmd = sc.nextLine();
			Optional<Request> request = Optional.ofNullable(Request.of(cmd));
			if(request.isEmpty()){
				continue;
			}
			
			controller.doAction(request.get());
			
			
		}
	}

}
