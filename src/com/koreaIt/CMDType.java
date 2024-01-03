package com.koreaIt;

public enum CMDType {
    INSERT("등록", false), LIST("목록", false), UPDATE("수정", true), DETAIL("상세보기", true),
    DELETE("삭제", true);
	
	final String descriotion;
	final boolean isNeedId;
	
	CMDType(String description, boolean isNeedId){
		this.descriotion = description;
		this.isNeedId = isNeedId;
	}

	public String getDescriotion() {
		return descriotion;
	}

	public boolean isNeedId() {
		return isNeedId;
	}
	
	
	
}
