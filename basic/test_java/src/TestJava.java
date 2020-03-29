public class TestJava {

    public static void printToString(char[][] inp_strs) {
        for (int i = 0 ; i < inp_strs.length ; i++) {
            for (int j = 0 ; j < inp_strs[i].length ; j++ ) {
                System.out.print(inp_strs[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args) {

        // Testing string to char array for Java
//        String[] strs_input = new String[]{"sdf f", "se3 f"};
//        char[][] strs_input_chars = new char[strs_input.length][];
//        for (int i = 0 ; i < strs_input.length ; i++ ) {
//            strs_input_chars[i] = strs_input[i].toCharArray();
//        }
//        printToString(strs_input_chars);


        //Testing StringBuffer and StringBuilder operations
//        String inputString = "Hello";
//        StringBuffer inputStringBuffer = new StringBuffer(inputString) ;
//        inputStringBuffer.append(inputStringBuffer.toString());
//        System.out.println(inputStringBuffer.toString());


        /******
         * Java Predefined Classes as data structures.
         */
        //List, ArrayList : Initializations , operations and conversions.




    }
}
