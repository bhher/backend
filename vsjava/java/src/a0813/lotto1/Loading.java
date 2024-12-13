package a0813.lotto1;

public class Loading {

    public void loading() {
        //프로그램을 주어진 시간동안 대기하도록 하는 처리
        try{
            Thread.sleep(3000);
            //3000ms - 3초동안 대기
        }catch(InterruptedException e){
            e.printStackTrace();
            //스레드가 잠자는 도중에 인터럽트(중단)이 들어오면
            //InterruptedException 발생
        }

    }

}
