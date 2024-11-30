public class ForLoopWithContinue {
    public static void main(String[] args) {
        String test = "";
        for(int i = 0; i< 5; i++){
            if(i==2){
                continue;
            }
            test = test + i + " ";
        }
        System.out.println(test);
    }
}


