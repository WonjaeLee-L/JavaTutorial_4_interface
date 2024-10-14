package dao_inf;

import java.util.ArrayList;

import dto.WordDTO;

// 핸들링하기 위한 것이 인터페이스(관리자), 실제 동작은 implements받은 WordDAO(현장 노동자)
public interface DBdao {
	public void add(WordDTO wdto);
	
	public ArrayList<WordDTO> selectAll();
	public void mod(WordDTO wdto);
	public void delect(WordDTO wdto);

}
