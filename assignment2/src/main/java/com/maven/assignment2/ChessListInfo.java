package com.maven.assignment2;

public class ChessListInfo {
	private String no;
	private String name;
	private String fieldID;
	private String fed;
	private String rtg;
	private String club;
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getfieldID() {
		return fieldID;
	}
	
	public void setfieldID(String fieldID){
		this.fieldID = fieldID;
	
	}
	
	public String getFed() {
		return fed;
	}
	
	public void setFed(String fed) {
		this.fed = fed;
	}
	
	public String getRtg() {
		return rtg;
	}
	
	public void setRtg(String rtg) {
		this.rtg = rtg;
	}
	
	public String getClub() {
		return club;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public ChessListInfo(String no, String name, String fieldID, String fed, String rtg, String club) {
		super();
		this.no = no;
		this.name = name;
		this.fieldID = fieldID;
		this.fed = fed;
		this.rtg =rtg;
		this.club = club;
				
	}

}
