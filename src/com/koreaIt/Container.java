package com.koreaIt;

import java.util.Scanner;

public class Container {
	public static final Scanner sc = new Scanner(System.in); 
	public static final String START_STRING = "== 명언 앱 실행 ==";
	public static final String INPUT_CMD = "명령어 ) ";
	public static final String LINE = "=".repeat(31);
	public static final String COLUMS = "번호  /  작가  /  명언";
	public static final String COLUMS_FORMAT = "%d  /  %s  /  %s";
	public static final String INPUT_WISESAYING = "명언 : ";
	public static final String INPUT_AUTHOR = "작가 : ";
	public static final String SUCCESS_INPUT = "%d번 명언이 등록되었습니다.";
	public static final String SUCCESS_DELETE = "%d번 명언이 삭제되었습니다.";
	public static final String NOT_EXIST = "%d번 명언은 존재하지 않습니다.";
	public static final String SUCCESS_UPDATE = "%d번 명언이 수정되었습니다.";
	public static final String EXISTING_WISESAYING = "명언(기존) : %s";
	public static final String EXISTING_AUTHOR = "작가(기존) : %s";
	public static final String SHOW_NUMBER = "번호 : %d";
	public static final String SHOW_DATE = "작가 : %s";
	public static final String SHOW_AUTHOR = "날짜 : %s";
	public static final String SHOW_CONTENT = "내용 : %s";
	public static final String TYPE_ERR_MSG = "명령어 목록과 일치하는 명령어가 존재하지 ㅇ낳습니다.";
	public static final String NOT_ID_MSG = "명령어에?id=형태로 아이디값이 입력되지 않았습니다.";
	public static void close() {
		sc.close();
	}
	
	
}
