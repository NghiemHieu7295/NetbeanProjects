package session8;

import java.util.*;

class OneDimension{
    int marks[];
        
    public void storeMarks(){
        marks = new int[4];
        System.out.println("Storing marks. Please wait...");
        marks[0] = 65;
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }
        
    public void displayMarks(){
        System.out.println("Marks are:");
        //Normal for loop
        for(int count = 0; count < marks.length; count++){
            System.out.println(marks[count]);
        }
        
        //Enhanced for loop <=> "for each"
        for(int count:marks){
            System.out.println(count);
        }
    }
}

class TwoDimension{
    int marks[][];
    int[][] scores = {{1, 2, 3}, {4}, {5, 6, 7}};
    
    public void storeMarks(){
        marks = new int[4][2];
        System.out.println("Storing marks. Please wait...");
        
        marks[0][0] = 23;
        marks[0][1] = 65;
        marks[1][0] = 42;
        marks[1][1] = 47;
        marks[2][0] = 60;
        marks[2][1] = 75;
        marks[3][0] = 75;
        marks[3][1] = 50;
    }
    
    public void displayMarks(){
        System.out.println("Marks are:");
        for(int row = 0; row < marks.length; row++){
            System.out.println("Roll no." + (row + 1));
            for(int col = 0; col < marks[row].length; col++){
                System.out.println(marks[row][col]);
            }
        }
    }
}

class ArrayLists{
    ArrayList marks = new ArrayList();
    
    public void storeMarks(){
        System.out.println("Storing marks. Please wait...");
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }
    
    public void displayMarks(){
        System.out.println("Marks are:");
        System.out.println("Iterating ArrayList using for loop:");
        for(int i = 0; i < marks.size(); i++){
            System.out.println(marks.get(i));
        }
        System.out.println("----------------------------");
        Iterator imarks = marks.iterator();
        System.out.println("Iterating ArrayList using Iterator:");
        while(imarks.hasNext()){
            System.out.println(imarks.next());
        }
        System.out.println("----------------------------");
        
        Collections.sort(marks);
        System.out.println("Sorted list is: " + marks);
    }
}

class Strings{
    String str = "Hello";
    Integer strLength = 5;
    
    public void displayStrings(){
        System.out.println("String length is: " + str.length());
        System.out.println("Character at index 2 is: " + str.charAt(2));
        System.out.println("Concatenated string is: " + str.concat(" World"));
        System.out.println("String comparison is: " + str.compareTo("World"));
        System.out.println("Index of o is: " + str.indexOf("o"));
        System.out.println("Last index of l is: " + str.lastIndexOf("l"));
        System.out.println("Replaced string is: " + str.replace('e', 'a'));
        System.out.println("Substring is: " + str.substring(2, 5));
        System.out.println("Integer to String is: " + strLength.toString());
        String str1 = " Hello ";
        System.out.println("Untrimmed string is: " + str1);
        System.out.println("Trimmed string is: " + str1.trim());
    }
}

class StringBuilders{
    StringBuilder str = new StringBuilder("JAVA ");
    /**
     * Displays strings using various StringBuilder methods
     * 
     * @return void
     */
    
    public void displayStrings(){
        System.out.println("Appended String is: " + str.append("7"));
        System.out.println("Inserted String is: " + str.insert(5, "SE "));
        System.out.println("Deleted String is: " + str.delete(4, 7));
        System.out.println("Reverse String is: " + str.reverse());
    }
}

class StringArray{
    String[] empID = new String[5];
    
    public void createArray(){
        System.out.println("Creating Array. Please wait...");
        for(int count = 1; count < empID.length; count++){
            empID[count] = "E00" + count;
        }
    }
    
    public void printArray(){
        System.out.println("The array is:");
        for(int count = 1; count < empID.length; count++){
            System.out.println("Employee ID is: " + empID[count]);
        }
    }
}

class Wrappers{
    public void calcResult(int num1, int num2, String choice){
        switch(choice){
            case "+":
                System.out.println("Result after addition is: "
                + (num1 + num2));
                break;
            case "-":
                System.out.println("Result after subtraction is: "
                + (num1 - num2));
                break;
            case "*":
                System.out.println("Result after multiplication is: "
                + (num1 * num2));
                break;
            case "/":
                System.out.println("Result after division is: "
                + (num1 / num2));
                break;
        }
    }
}

public class Session8 {
    
    public static void main(String[] args) {
        /*OneDimension obj = new OneDimension();
        obj.storeMarks();
        obj.displayMarks();*/
        
        /*TwoDimension obj = new TwoDimension();
        obj.storeMarks();
        obj.displayMarks();*/
        
        /*ArrayLists obj = new ArrayLists();
        obj.storeMarks();
        obj.displayMarks();*/
        
        /*Strings obj = new Strings();
        obj.displayStrings();*/
        
        /*StringBuilders obj = new StringBuilders();
        obj.displayStrings();*/
        
        /*StringArray obj = new StringArray();
        obj.createArray();
        obj.printArray();*/
        
        /*if(args.length == 3){
            System.out.println("First Name is: " + args[0]);
            System.out.println("Last Name is: " + args[1]);
            System.out.println("Designation is: " + args[2]);
        }
        else{
            System.out.println("Specify the First Name, Last Name"
                    + "and Designation");
        }*/
        
        if(args.length == 3){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            Wrappers obj = new Wrappers();
            obj.calcResult(num1, num2, args[2]);
        }
        else{
            System.out.println("Usage: num1 num2 operator");
        }
        
        /*Character chBox = 'A';
        char chUnbox = chBox;
        
        System.out.println("Character after autoboxing is: " + chBox);
        System.out.println("Character after unboxing is: " + chUnbox);*/
    } 
}