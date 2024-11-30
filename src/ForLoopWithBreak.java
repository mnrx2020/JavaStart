public class ForLoopWithBreak {
    public static void main(String[] args) {
        String test = "";
        for(int i = 0; i< 5; i++){
            test = test + i + " ";
            if(i==2){
                break;
            }
        }
        System.out.println(test);
    }
}


