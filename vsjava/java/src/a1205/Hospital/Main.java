package a1205.Hospital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
   
        PatientManager pm = new PatientManager();
        Scanner sc =new  Scanner(System.in);
        System.out.println("\n\n");
        System.out.println(pm.hospital);
        System.out.println("\t\t    어서오세요. JAVA 병원입니다.");
    while(true){
        System.out.println("\n=========== 메인 메뉴 ===========\n");
        System.out.println("1. 환자 등록");
        System.out.println("2. 등록 정보 보기");
        System.out.println("3. 관리자 메뉴");
        System.out.println("0. 종료\n");
        System.out.print("입력 > ");
        int choice = -1;
        try{
            choice = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요");
            sc.next();
            continue;
        }

        switch (choice) {
            case 1:
                pm.patientAppointment(); //환자등록
                break;
            case 2:
                pm.patientPrint(); //환자조회
                break;
            case 3:
                if(!checkAdminPw()){
                    System.out.println("비밀번호가 틀렸습니다.");
                    break;
                }    
                pm.adminMenu();
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;    
            default:
                break;
            }
                    
        }
                    
                    
    }
                
        private static boolean checkAdminPw() {
            Scanner sc = new Scanner(System.in);
            System.out.print("관리자 비밀번호를 입력하세요> ");
            String adminPw = sc.nextLine();
            return "admin1234".equals(adminPw);
        }   


    }
