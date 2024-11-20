package a1120;

public class RoleEx {
    public static void main(String[] args) {
        Role role =Role.ADMIN;

         // 역할 출력
         System.out.println("현재 역할: " + role);           // 출력: 현재 역할: ADMIN
         System.out.println("일반 사용자 역할: " + Role.USER); // 출력: 일반 사용자 역할: USER

        // 역할 확인
        if (role == Role.ADMIN) {
            System.out.println("관리자 권한이 있습니다.");   // 출력: 관리자 권한이 있습니다.
        } else if (role == Role.USER) {
            System.out.println("일반 사용자입니다.");        // 출력: 일반 사용자입니다.
        }
        //enum 타입을 쓰는 이유
        // 1. 가독성 ADMIN , USER 같이 의미를 쉽게 알수 있음
        // 2. 안정성 
        //String role = "ADMIN" // 오타가능성이 크다.
        // 3. 유지보수성 
        //값이 변경되거나 추가될경우, enum 을 사용하면 해당값의 정의만수정
        

    }
}
