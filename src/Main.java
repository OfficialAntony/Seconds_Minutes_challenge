public class Main {
    public static void main(String[] args) {
       String results=seconds(34);
        System.out.println("time ="+results);
        String NewResults=seconds(45,20);
        System.out.println("time ="+NewResults);
    }
    public static String seconds(int sec) {
        if (sec >= 0) {
            return ("seconds ="+sec);
        }
        else {
            return "INVALID INPUT!";
        }
    }
    public static String seconds(int sec,int min) {
        if (sec <=59 && min>=0 ) {
            return "seconds ="+sec+" minutes ="+min;
        }
        else {
            return "INVALID INPUT!";
        }
    }
}