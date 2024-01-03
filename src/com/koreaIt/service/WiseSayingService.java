package com.koreaIt.service;

import java.util.List;

import com.koreaIt.dto.WiseSayingDTO;
import com.koreaIt.repository.WiseSayingRepository;
import com.koreaIt.vo.WiseSayingVO;

public class WiseSayingService {
	public WiseSayingRepository repository;

	public int insert(WiseSayingVO wiseSayingVO) {
		// TODO Auto-generated method stub
		return repository.insert(wiseSayingVO);
	}

	public List<WiseSayingDTO> list() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
