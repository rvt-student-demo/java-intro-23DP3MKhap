package lv.rvt;

public class Stars {
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }

        System.out.println("");

   }
    
   public static void christmasTree(int height){
    int star = 1;

    
    for (int i = 0; i<height; i++){
        printSpaces(height-i);
        printStars(star);
        star += 2;
        }
    for (int i = 0; i<2; i++){
        printSpaces(height-1);
        printStars(3);
    }

   }




   public static void printTriangle(int size){

    for (int i = 0; i < size; i++){
        printSpaces(size-i);
        printStars(i+1);
    }

}

   public static void printSpaces(int number){
    for (int i = 0; i < number; i++){
        System.out.print(" ");
    }
   }





}
