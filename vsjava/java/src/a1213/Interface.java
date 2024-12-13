package a1213;

public interface Interface {
      //인터페이스는 메소드의 선언만 가지고 있다.
    //따라서 메소드의 구현체는 포함하지 않는다.
    public void Menu(); //메뉴보기
    public void AddWord(); //단어등록
    public void WordSearch();//단어조회
    public void DeleteWord();//단어삭제
    public void Test(); //테스트
    public void WordList();//목록보기
    public void Exit(); //종료

    //인터페이스는 상수 선언가능 
    //다중 상속 지원
}
