package com.wb.sb.board;

public interface BoardMapper {
	
	// 글 작성
	public int setInsert(BoardVO boardVO) throws Exception;

	// 글 수정
	public int setUpdate(BoardVO boardVO) throws Exception;
	
	// 글 삭제
	public int setDelete(BoardVO boardVO) throws Exception;
	
	// 글 조회
	public BoardVO getOne(BoardVO boardVO) throws Exception;
}
 