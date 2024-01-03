package com.koreaIt.repository;

import java.util.ArrayList;
import java.util.List;

import com.koreaIt.dto.WiseSayingDTO;
import com.koreaIt.vo.WiseSayingVO;

public class WiseSayingRepository {
	private int authoIncrement;
	private List<WiseSayingDTO> list;
	
	
	

	public WiseSayingRepository() {
		this.authoIncrement = 0;
		this.list = new ArrayList<>();
	}




	public int insert(WiseSayingVO wiseSayingVO) {
		// TODO Auto-generated method stub
	    WiseSayingDTO saying = new WiseSayingDTO(authoIncrement++, wiseSayingVO.getContent(), wiseSayingVO.getAuthor());
	    list.add(saying);
		return saying.getId();
	}




	public List<WiseSayingDTO> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

}
