package a1203.singleton;

public class SingletonLogger {
    //생성자를 private로 설정 외부에서 새로운 인스턴스 생성금지
    //클래스 내부에 유일한 인스턴스 'private static'

    private static SingletonLogger instance;
    private SingletonLogger(){

    }
    public static SingletonLogger getInstance() {
        if(instance == null){//아직객체가 생성되지 않았으면
            synchronized(SingletonLogger.class){
                if(instance==null){
                    instance = new SingletonLogger();
                    //객체가 없으면 하나생성
                }
            }
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log: " + message);
    }




}
