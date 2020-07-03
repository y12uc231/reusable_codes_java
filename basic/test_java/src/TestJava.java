import java.util.*;

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

        /***
         * Conversions from string to characters and similar operations for integers
         * 1. Whats the difference character, string and CharSequence ?
          */
//        char inp = 'c';
//        String inpToString = Character.toString(inp);
//
//        System.out.println(Character.toString(inp));
//
//        int inpInt = 231;
//        String intToString = Integer.toString(inpInt);
//
          //String to int
//        String numInString = "2342";
//        int stringToInt = Integer.parseInt(numInString);
//
//        System.out.println(stringToInt*2);

        //int to String
//        int intVal = 234;
//        String strValForInt = String.valueOf(intVal);

        //char to int
//        char val = '2';
//        System.out.println(Integer.valueOf(Character.toString(val)));

//        int val = 323;
//        Float val2float = new Float(val);
//        System.out.println(val2float.floatValue());

//        String tmpString = "sdf";
//        System.out.println(tmpString.);
//
//        /****
//         * String and array operations on character arrays
//         */
//        String charInp = "Satya234sdf";
//        char[] charArray = charInp.toCharArray();
//
//        for (int i = 0 ; i < charArray.length ; i++ ) {
//            if (charArray[i] >= '0' && charArray[i] <= '9') {
//                System.out.println(Integer.parseInt(String.valueOf(charArray[i]))*2);
//            }
//        }


        /******
         * Java Predefined Classes as data structures.
         * 1. How to append in bulk in Java data structures.
         * 2. How to delete in bulk in Java data structures.
         * 3. How to initialize Java data structures with some initial bulk value similar to array initializations.
         * 4.
         */
        //List, ArrayList : Initializations , operations and conversions.

        //Queue<Integer> que = new Queue<>();

//        Stack<String> stackStringVals = new Stack<>();
//        stackStringVals.push("sdfs");
//        System.out.println(stackStringVals.pop());
//
//        boolean out = true;
//        out |= false;
//        System.out.println(!out);
//        List<Character> arguments;
//        List<Character> listInts = new ArrayList<>();
//        listInts.add('3');
//        listInts.add('4');
//        Character[] val = listInts.toArray(new Character[0]);
//        char result = 'f';
//        String name = "Satyapriya";
//        System.out.println(name.substring(0,3).equals(name.substring(3,4)));
//        System.out.println(Arrays.toString(val));
//        System.out.println(Boolean.valueOf(false).compareTo(false));
        Map.Entry<Integer, Integer> entry = new Map.Entry<Integer, Integer>() {
            int key, value;

            @Override
            public Integer getKey() {
                return null;
            }

            @Override
            public Integer getValue() {
                return null;
            }

            @Override
            public Integer setValue(Integer value) {
                return null;
            }
        };




    }
}
