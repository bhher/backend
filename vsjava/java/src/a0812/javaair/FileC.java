package a0812.javaair;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileC {
    private FlightManager fm = new FlightManager();

    public void ticketSaveFile(Map<String, Flight> reservationMap, String name) {
       try{
        File file = new File("c:\\ticket\\ticket.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        if(file.isFile() && file.canWrite()){
            bufferedWriter.write(fm.ticketPrint(reservationMap,name));
            bufferedWriter.flush();
        }
        System.out.println("파일저장을 완료");
        bufferedWriter.close();

       }catch(IOException e){
        System.out.println("파일저장실패");
       }
    }

    public void upload() {
        try{
            File file = new File("C:\\ticket\\schedule.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("===============================================");
            while((line = bufferedReader.readLine()) != null){
                //txt 파일 한줄씩읽어서 / 기준으로 나누고 flights 에 새로운 객체로 추가
                System.out.println(line);
                String [] flight = line.split("/");
                FlightManager.getFlights().add(new Flight(flight[0],flight[1],Integer.parseInt(flight[2]),Boolean.parseBoolean(flight[3])));
                //flights 리스트에 추가 
            }    

        }catch(FileNotFoundException e){
            System.out.println("schedule.txt 파일을 찾을수 없습니다.");
        }catch(IOException e){
            System.out.println("파일 일기 실패");
        }
    }


}
