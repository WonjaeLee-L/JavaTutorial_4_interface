package main;

import dao_inf.DBdao;
import dao_inf.WordDAO;
import service.WordMainFrame;

// WordMainFrame, Main, DBdao, WordDAO_mysql, WordDAO Class만 사용
public class Main {

	public static void main(String[] args) {
//		WordService ws = new WordService();

		// oracle version
//		DBdao dao = new WordDAO();	// mysql version >> new WordDAO_mysql로 한다.
//		WordService ws = new WordService(dao);
//		ws.menu();

		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);
	}

}
