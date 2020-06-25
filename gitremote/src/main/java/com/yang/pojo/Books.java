package com.yang.pojo;
/**
* @author ycy
* @version 1.0
* @createDate 创建时间：2020/05/17 15:40:20
* @explain(类说明):...
*/
public class Books {
    
	private String bookUser;
	private int bookID;
	private String bookName;//书名
	private int bookCounts;//书的数量
	private String detail;//书的详解
	
	public Books() {
		super();
	}
	
	public Books(int bookID, String bookName, int bookCounts, String detail) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookCounts = bookCounts;
		this.detail = detail;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookCounts() {
		return bookCounts;
	}

	public void setBookCounts(int bookCounts) {
		this.bookCounts = bookCounts;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", bookCounts=" + bookCounts + ", detail="
				+ detail + "]";
	}
}
