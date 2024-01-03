package com.koreaIt.controller;

import static com.koreaIt.Container.*;

import java.util.List;

import com.koreaIt.CMDType;
import com.koreaIt.Request;
import com.koreaIt.dto.WiseSayingDTO;
import com.koreaIt.service.WiseSayingService;
import com.koreaIt.vo.WiseSayingVO;

public class WiseSayingController {
	WiseSayingService service = new WiseSayingService();

	public void doAction(Request request) {
		CMDType cmdType =request.getCmdType();
		if(cmdType == CMDType.INSERT) {
			insert();
		}else if(cmdType == CMDType.LIST){
			list();
		}else if(cmdType == CMDType.DELETE){
			
		}else if(cmdType == CMDType.UPDATE){
			
		}else if(cmdType == CMDType.DELETE){
			
		}

	}

	private void list() {
		System.out.print(COLUMS);
		System.out.print(LINE);
		List<WiseSayingDTO> list = service.list();
		list.stream().forEach(a->System.out.printf(COLUMS_FORMAT, a.getId(), a.getAuthor(), a.getContent()));;
		
	}

	private void insert() {
		System.out.print(INPUT_WISESAYING);
		String content = sc.nextLine();		
		System.out.print(INPUT_AUTHOR);
		String author = sc.nextLine();
		
		int result = service.insert(new WiseSayingVO(content, author));
		System.out.printf(SUCCESS_INPUT, result);

	}

}
