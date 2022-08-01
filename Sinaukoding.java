public class Sinaukoding {

    public static void main(String[] args) {
        int limit = 20;
        int prime;
        for ( int i = 0; i <=limit; i++){
            prime = 0;
            for(int j = 1; j <= i; j ++){
                if(i%j == 0){
                    prime++;
                }
            }
            if(prime == 2){
                System.out.println(i + " adalah bilangan prima");
            }else{
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }
}