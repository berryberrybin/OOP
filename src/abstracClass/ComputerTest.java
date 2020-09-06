package abstracClass;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); 인스턴스 생성 불가
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook(); 인스턴스 생성  불가
        Computer c4 = new MyNoteBook();
        c2.run();
        c4.run();
    }
}
