


public class Main {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //calculating (3 * 4   +   5 * 7)^2

        //3 * 4
        int part01 = calculator.multiply( 3 , 4);

        //5 * 7
        int part02 = calculator.multiply( 5 , 7);

        //part01(3 * 4)   +   part02(5 * 7)
        int sum = calculator.add( part01 , part02);

        // (3 * 4   +   5 * 7)^2
        int result = calculator.square( sum );

        System.out.println( "(3 * 4   +   5 * 7)^2 =  "   + result );



        //space line
        System.out.println();



        //caluculating (4 + 7)^2  + ( 8 + 3 )^2

        int part1 = calculator.add( 4 , 7);

        int part2 = calculator.square(part1);

        int part3 = calculator.add(8 ,3);

        int part4 = calculator.square(part3);

        int part5 = calculator.add(part2 , part4 );

        System.out.println( "(4 + 7)^2  + ( 8 + 3 )^2 = "   + part5);


    }
}