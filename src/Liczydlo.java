public class Liczydlo {
    public static void main(String[] args) {
        System.out.println("Aplikacja liczydło");
        int numberThree=0;
        int number[]=new int[]{2,3,7,3,3,5,2};
        for (int i=0; i< number.length; i++){
            if (number[i]==3){
                numberThree++;
            }
        }
        System.out.println("Liczba trójek w tablicy wynosi: "+numberThree);
    }
}
