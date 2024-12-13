package a1213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Brain implements Interface {

static HashMap<String , String> Word = new HashMap<>();
    static final String FILE_NAME = "C:\\junsuk\\vsjava\\java\\src\\a1213\\words2.txt";

    public Brain(){
       loadWordsFromFile();
    }

    private void loadWordsFromFile() {
      try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME), "UTF-8"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            if(parts.length == 2){
                Word.put(parts[0],parts[1]);
            } 
        }

      }catch(IOException e){
        System.out.println("파일을 읽는 중 오류가 발생했습니다.");
      }
    }
    @Override
    public void Menu() {
        // TODO Auto-generated method stub
        System.out.println("등록된 단어 수: \n" + Word.size());
        System.out.println("---- 선택 해주세요. ----");
        System.out.println("1. 단어 등록 ");
        System.out.println("2. 단어 조회 ");
        System.out.println("3. 단어 삭제 ");
        System.out.println("4. 테스트 ");
        System.out.println("5. 단어 목록보기 ");
        System.out.println("6. 종료 ");
        System.out.println("-----------------------");
    }


    @Override
    public void AddWord() {
        String Eng = null;
        String Kor = null;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("등록할 영단어를 입력하세요(목록으로 돌아가려면 Menu 입력) : ");
            Eng = sc.nextLine();
            if(Eng.equalsIgnoreCase("menu")){
                break;
            }else{
                if(Word.containsKey(Eng) == true){ //Word라는 맵에 입력한 단어가 있으면
                    System.out.println(" 이미 입력된 단어입니다. 수정을 원하시면 삭제 후 다시 입력해주세요.");
                }else{
                    System.out.print(" 뜻(한글)을 입력하세요 : ");
                    Kor = sc.nextLine();
                }
    
                try{
                    Word.put(Eng , Kor);
                    saveWordsToFile();
                    }catch(Exception e){
                        System.out.println("다시 입력해 주세요");
                        e.printStackTrace();
                    }finally{
                        System.out.println(" 입력되었습니다. ");
                    }
                }
    
            }
            
        }
                    
        private void saveWordsToFile() {
             try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_NAME), StandardCharsets.UTF_8))) {
                    for(Map.Entry<String, String> entry : Word.entrySet()){
                        writer.write(entry.getKey() + "=" + entry.getValue());
                        writer.newLine();
                    }
                }catch(IOException e){
                    System.out.println("파일 저장중 오류가 났습니다.");
            }
        }
                    
    @Override
    public void DeleteWord() {
       Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====단어목록====");
            for(Map.Entry<String,String> entry : Word.entrySet()){
                System.out.println("# "+ entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("=================");
            System.out.print("삭제할 영단어를 입력하세요(목록으로 돌아가려면 Menu 입력) : ");
            String EngDel = sc.nextLine();
            if(EngDel.equalsIgnoreCase("menu")){
                break;
            }else{
                if(Word.containsKey(EngDel)==true){
                    System.out.println("입력한단어는 " +EngDel+"입니다.");
                    Word.remove(EngDel);
                    System.out.println("삭제되었습니다.");
                    saveWordsToFile();
                }else{
                    System.out.println("등록되지 않은 단어입니다.");
                }

            }
            
        }
        
    }

    @Override
    public void Exit() {
       System.out.println("영단어장을 종료합니다.");
   }

   

    @Override
    public void Test() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.시작하기");
            System.out.println("2.종료하기");
            int a = sc.nextInt();
            sc.nextLine();
            if(a==1){
                int count = 0;
                int totalCount = 0;
                System.out.println("====뜻에 맞는 영단어를 입력하세요");
                for(Map.Entry<String,String> entry: Word.entrySet()){
                    String ValueVar = entry.getValue(); //한글
                    System.out.println(ValueVar);
                    String Answer = sc.nextLine();
                    if(Answer.equals(entry.getKey())){//영어 단어 입력한 영단어와 일치하면
                       count++; 
                    }else{
                        System.out.println("틀렸습니다. (답 : " +entry.getKey() + ")\n");
                    }
                    totalCount++;
                }
                System.out.println("결과 : " + count +"/"+ totalCount + "\n");
                break;
            }else if(a==2){

            }else{
                System.out.println("1또는 2를 입력해 주세요.");
            }

        }
        
    }

    @Override
    public void WordList() {
        System.out.println("====단어목록보기====");
        for(Map.Entry<String,String> entry : Word.entrySet()){
            System.out.println("# "+ entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("=================");
        while(true){
            System.out.println("목록으로 돌아가려면 Menu 입력");
            Scanner sc = new Scanner(System.in);
            String Menu = sc.nextLine();
            if(Menu.equalsIgnoreCase("menu")){
                break;
            }else{
                System.out.println("오류");
            }
        }
        
    }

    @Override
    public void WordSearch() {//단어 조회
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("조회할 영단어를 입력하세요(목록으로 돌아가려면 Menu 입력) : ");
            String Eng = sc.nextLine();
            if(Eng.equalsIgnoreCase("menu")){
                break;
            }else{
                if(Word.containsKey(Eng)==true){
                    System.out.println(Word.get(Eng));
                }else{
                    System.out.println("등록되지 않은 단어입니다.");
                }

            }
            
        }
       
        
    }
    
}
