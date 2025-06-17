package arrays;

public class JavaArrays {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
		
        System.out.println("Length: " + fruits.length);
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + i + ": " + fruits[i]);
        }
        System.out.print("\n");
        
        
        // Using for-each
        System.out.println("Using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.print("\n");
        
        
        // 2D Array
        System.out.println("2D Array:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

	}

}
