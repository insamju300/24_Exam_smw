package com.koreaIt;
import static com.koreaIt.Container.*;

public class Request {
	private CMDType cmdType;
	private int id;
	
	private Request(CMDType cmdType) {
		this(cmdType, -1);
	}

	
	private Request(CMDType cmdType, int id) {
		super();
		this.cmdType = cmdType;
		this.id = id;
	}



	public static Request of(String cmd) {
		CMDType cmdType = null;
		int id = -1;
		
		String[] inputs = cmd.split("?id=");
		for(CMDType oneType:CMDType.values()) {
			if(oneType.getDescriotion().equals(inputs[0])) {
				cmdType = oneType;
			}
		}
		
		if(cmdType==null) {
			System.out.println(TYPE_ERR_MSG);
			return null;
		}
		
		if(cmdType.isNeedId) {
			if(inputs.length < 2 || !Util.isInteger(inputs[1])) {
				System.out.println(NOT_ID_MSG);
				return null;
			}else {
				id=Integer.parseInt(inputs[1]);
				return new Request(cmdType, id);
			}
		}else {
			return new Request(cmdType);
		}
		
		
		
		
		
	}


	public CMDType getCmdType() {
		return cmdType;
	}


	public int getId() {
		return id;
	}
}
