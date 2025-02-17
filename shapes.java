public class Shapes{

    public static void main(String[] args){
        // Create a new shape object

        // pyramid(15);
        // square(5);
        // triangle(5);
        // upsideDownTriange(15);
        // numberTriangle(5);
    }

    public static void triangle(int height){

        int spaces = height;

        for (int i=0; i<height+1; i ++){

            String space = "";
            String stars = "";
            
            //spaces
            for (int j=0; j < spaces; j ++ ){
                space += "";
            }

            //stars
            for (int x = 0; x < (i); x++ ){
                
                stars += "*";
            }
            System.out.println(space+stars);
            // System.out.println();

            spaces --;
        }
    }

    public static void pyramid(int height){

        int spaces = height;

        for (int i=0; i<height+1; i ++){
            String stars = "";
            
            //spaces
            for (int j=0; j < spaces+1; j ++ ){
                stars += " ";
            }

            //stars
            for (int x = 0; x <= (2*i-2); x++ ){
                stars += "*";
            }

            System.out.println(stars);
            spaces -= 1;
        }
    }

    public static void square(int height){
        for (int i = 0; i < height; i++){
            String square = "";
            for (int x = 0; x < height; x++){
                square += "*";
            }
            System.out.println(square);
        }
    }

    public static void upsideDownTriange(int height){
        
        int stars_across = height; //nuber of stars per line

        while (stars_across > 0) {

            String line = "";

            for (int i =0; i < stars_across; i++) {
                line += "*";
            }
            System.out.println(line);

            stars_across -= 1;
        }
    }

    public static void numberTriangle(int height){

        for (int i = 1; i < height+1; i++){
            String line = "";

            for (int j = 1; j < i+1; j++){
                line += i;
                // System.out.println(i);
            }
            System.out.println(line);
        }
    }

}
