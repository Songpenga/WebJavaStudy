package section9.Ex;

public class Member {

    private final String id; //final 키워드 사용
    private String name;

    //생성자 만들지 않았을때 : Variable 'id' might not have been initialized
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        //this.id = id; //Cannot assign a value to final variable 'id'
        this.name = name;
    }

    public void print(){
        System.out.println("id : " + id +"   name : " + name);
    }
}
