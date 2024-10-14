package dao_inf;

import java.util.ArrayList;

import dto.WordDTO;

// DBdao를 implements 받고, override
public class WordDAO implements DBdao {

	// Dao 작업 필요

	public WordDAO() {
	}

	@Override
	public void add(WordDTO wdto) {
		System.out.println("insert : " + wdto.getEng());

	}

	@Override
	public ArrayList<WordDTO> selectAll() {
		return null;
	}

}
