public class shapes{

    public static void main(String[] args){
        // Create a new shape object

        pyramid(5);
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
            for (int x = 0; x < (2*i-1); x++ ){
                
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
}