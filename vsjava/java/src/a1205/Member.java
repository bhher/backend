
package a1205;

public class Member {

    public static int MALE = 0 ;        // 남자
    public static int FEMALE = 0 ;      // 여자
    private String name;    // 이름
    private int gender;     // 성별
    private int age;        // 나이
    public String getName() {
        return name;
    }
    public int getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


}