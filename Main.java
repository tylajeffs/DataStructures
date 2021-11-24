import java.util.ArrayList;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        //variables
        Stack<String> stack = new Stack<>();
        ArrayList<String> inputLines = new ArrayList<>();
        String currentLine;



        //create scanner to read file
        Scanner s = new Scanner(System.in);

        currentLine = s.nextLine();

        inputLines.add(currentLine);

        //store the data in arraylist
        while(!currentLine.contains("***"))
        {
            currentLine = s.nextLine();
            inputLines.add(currentLine);
        }

        //close scanner
        s.close();





        //go through each line in the arraylist and do the correct action
        for(String line: inputLines)
        {

            if(line.contains("PUSH"))
            {
                //isolate the data from the input line
                String data = line.replace("PUSH ", "");

                //push the data onto the stack
                stack.push(data);
            }
            else if(line.contains("POP"))
            {
                //pop
                stack.pop();
            }
            else if(line.contains("CLEAR"))
            {
                //clear the stack
                stack.clear();
            }
            else if(line.contains("PRINT"))
            {
                //print the stack
                stack.printAllNodes();
            }

        }


    }



}