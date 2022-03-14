package hello.core.singleton;

public class SingletonService {

    //static 영역에 대한 공부하기
    // 1. static 영역에 객체 instance를 미리 생성해서 올려둔다
    private static final SingletonService instance = new SingletonService();

    // 2. instance가 필요하면 오직 이 메서드를 통해서만 조회할 수 있다
    public static SingletonService getInstance(){
        return instance;
    }

    // 3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
