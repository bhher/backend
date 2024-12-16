import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Candidate {
    private String name;
    private String political;
    public Candidate() {
    }
    public Candidate(String name, String political) {
        this.name = name;
        this.political = political;
    }

    public String toString() {
        return political +"\t"+ name +"\t"+ "후보";
    }
}

class Voter {
    private String name;
    private int gender;
    private int age;
    private String id;

    public void setVoter(String name,String gender,int age,String id) {
        this.name = name;
        this.gender = (gender == "남자") ? 0 : 1; // 남녀별 통계 위해 일단은 인트로 받아둠
        this.age = age;
        this.id = id;
    }
}
public class Main {
    static List<Integer> voteResults = new ArrayList<>();
    // 투표번호만 저장할거여서 어레이리스트만 작성
    static List<Candidate> candidateList = new ArrayList<>();
    private static void setCandidate() {
        candidateList.add(new Candidate("김김김", "국민의힘"));
        candidateList.add(new Candidate("민민민", "민주당"));
        candidateList.add(new Candidate("서서서", "정의당"));
    }
    //후보자 예시추가
    private static void votingNumResult() {
        for (int i = 0; i < candidateList.size(); i++) {
            int result = Collections.frequency(voteResults, i + 1);
            //리절트는 후보의 득표수
            System.out.println(candidateList.get(i) + ":" + result + "표");
        }
    }
    //Collections.frequency(객체를 담고 있는 컬렉션 인스턴스,기대하는 객체) 리턴은 기대객체와 일치하는 개수
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voter voter = new Voter();
        List<Voter> voterList = new ArrayList<>();
        setCandidate();
        while (true) {
            System.out.println("2025 대선투표");
            System.out.println("1.후보자 목록");
            System.out.println("2.투표");
            System.out.println("3.투표집계");
            System.out.println("4.투표종료");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    setCandidate();
                    for (int i = 0; i < candidateList.size(); i++) {
                        System.out.println(i+1+"."+candidateList.get(i));
                    }
                    break;
                case 2:
                    System.out.println("투표자의 정보를 입력해주세요");
                    System.out.print("이름:");
                    String name = scanner.nextLine();
                    System.out.print("성별:");
                    String gender = scanner.nextLine();
                    System.out.print("나이:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("주민번호:");
                    String id = scanner.nextLine();

                    voter.setVoter(name, gender, age, id);
                    voterList.add(voter);
                    for (int i = 0; i < candidateList.size(); i++) {
                        System.out.println(i+1+"."+candidateList.get(i));
                    }
                    int votingNum;
                    while (true) {
                        System.out.println("투표할 후보의 번호를 입력하세요:");
                        votingNum = scanner.nextInt();
                        if (votingNum > 0 && votingNum <= candidateList.size()) {
                            break;
                        } else {
                            System.out.println("후보군에 있지 않은 번호입니다. 다시 입력해주세요.");
                        }
                    }
                    voteResults.add(votingNum);
                    System.out.println("투표 완료되었습니다");
                    break;
                case 3:
                    System.out.println("투표 현황");
                    votingNumResult();
                    break;
                case 4:
                    return;
            }
        }
    }
}