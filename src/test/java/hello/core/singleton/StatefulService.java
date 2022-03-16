package hello.core.singleton;

public class StatefulService {
    private int price; // 상태를 유지하는 필드

    public void order(String name, int pirce){
        System.out.println("name = "+ name + " price = " + pirce);
        this.price = pirce; // 여기가 문제
    }
    public int getPrice(){
        return price;
    }
}
