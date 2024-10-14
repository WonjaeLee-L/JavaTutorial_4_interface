package service;

// 사용 안하는 클래스
import dao_inf.DBdao;
import dao_inf.WordDAO;

public class del_WordService {
	// DBdao worddao = null; // 객체를 알 필요 없고, 인터페이스의 참조변수만 알면 된다. 객체 만들어지지 않은 상태
	// WordService 입장에서, 필요한 객체의 변수나 메서드 이름 등 다 알 필요가 없이,
	// 인터페이스 이름인 DBdao와 내가 사용할 객체가 뭔지만 알면 된다. 의존도를 낮출 수 있다.
	// 아래 코드는 건들지 않고, 객체만 바꿔서 코드를 수정했다.

//	DBdao worddao = new WordDAO();
	// null 자리에 new WordDAO(); >> oracle 버전

	// DBdao worddao = new WordDAO_mysql();
	// null 자리에 new WordDAO_mysql(); >> mysql버전.

	DBdao worddao = null;

	// 이것도 결국은 객체를 만들어야하므로 의존한 것, 여기서 의존도를 더 낮춰보자.

	// WordService가 그 객체를 몰라도 된다. 얘가 그 객체를 몰라도 된다.
	// 누군가 주소를 알려주면 걔를 그냥 저장.
	public del_WordService(DBdao db) {
		this.worddao = db;
	}

	// WordDAO worddao = new WordDAO(); >> interface 사용 전, 지금까지 하던 방법.
	public void menu() {
		add();
	}

	private void add() {
		// add 데이터베이스 Test
//		String a = "test"; // DB 작업
//		worddao.add(a);
	}

}
