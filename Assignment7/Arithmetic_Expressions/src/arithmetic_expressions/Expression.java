/*
 * Jasen Ratnam
 * Program for Computer Science with Maths.
 * In Vanier College.
 */
package arithmetic_expressions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


/**
 * Calculate infix expressions with integer operands.
 * Using only one of / % * + - binary operators in the expressions.
 * Assignment 4
 * Date : 2017-05-01
 * @author Jasen Ratnam
 */

public class Expression 
{

    /**
     * Store a user supplied infix expression.
     */
    public String infix;
    
    /**
     * Constructor: initializes infix to expr.
     * @param expr value to initializes the infix.
     */
    public Expression(String expr)
    {
        infix = expr;
    }
    
    /**
     * Default constructor with expr = 0.
     */
    public Expression()
    {
        this("0");
    }
    
    /**
     * Resets the infix to a new infix given.
     * @param infix new given infix.
     */
    public void reset(String infix)
    {
        this.infix = infix;
    }
    
    private Queue<String> Tokenize()
    {
        //prepare a queue of string items.
        Queue<String> queue = new LinkedList<>();
        //remove all the spaces in infix.
        String infixWithNoSpaces = infix.replaceAll("[\t\n ]", "");
        //define the characters allowed in an infix expression.
        String delimiters = "*/+-()%";
        //create a StringTokenizer, telling it to return the delimiters as tokens.
        StringTokenizer tokenizer = new StringTokenizer(infixWithNoSpaces, delimiters, true);
        while(tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            queue.add(token);  // queue up the tokens
            //System.out.println("|" + token + "|");
        }
        return queue;
    }
    
    /**
     * Evaluate the expression whose infix tokens are stored in a queue, q.
     * @param q queue with stored infix.
     * @return the answer of the expression.
     */
    public static Integer evaluate(Queue<String> q)
    {
        final int ADDITIVE_OPERAND = 1;
        final int MULTIPLITIVE_OPERAND = 2;
        final int RIGHT_PAREN = -1;
        final int LEFT_PAREN = 0;
        Stack<Integer> valStack = new Stack<>();
        Stack<String> opStack = new Stack<>();
        Iterator<String> qIter = q.iterator();
        while (qIter.hasNext())
        {
            String token = qIter.next();
             //System.out.println("|" + token + "|");
            Scanner scan = new Scanner(token);
            if (scan.hasNextInt())
            {
                Integer x = scan.nextInt();
                valStack.push(x);
            }
            
            else if (precedence(token) == 0)
            {
                opStack.push(token);
            }
            
            else if (precedence(token) == -1)
            {
                //System.out.println("==>" + token);
                while(! opStack.empty() && !("(".equals(opStack.peek())) )
                {
                    applyStackTopOperator(opStack, valStack);
                }
                
                if(opStack.empty() || opStack.peek() == "(")
                {
                    throw new IllegalArgumentException("Missing left parenthesis");
                }
                else
                {
                    opStack.pop();
                }
            }
            
             else if (precedence(token) == 1 || precedence(token) == 2)
             {
                 while(! opStack.empty() && precedence(token) <= precedence(opStack.peek()))
                 {
                    applyStackTopOperator(opStack, valStack);
                 }
                 opStack.push(token);
             }
            
             else // invalid token in the infix queue.
             {
                 throw new IllegalArgumentException("Error found: A token in the infix queue is invalid");
             }     
        }
        
        while (!opStack.empty())
        {
            applyStackTopOperator(opStack, valStack);
        }
        
        if(valStack.empty())
        {
            throw new IllegalArgumentException("Something wrong; perhaps missing an operand.");
        }
        if(valStack.size() > 1)
        {
            throw new IllegalArgumentException("Too many operands.");
        }
        else
        {
            Integer answer = valStack.peek();
            valStack.pop();
            return answer;
        }
        
    }
    
    /**
     * Evaluates and returns the result of this infix.
     * Delegates evaluation task to the evaluate method above.
     * Handles any possible exceptions thrown by evaluate.
     * @return
     */
    public Integer eval()
    {
        Integer result = null;
        try
        {
            Queue<String> infixQueue = Tokenize();  // Tokenize
            result = evaluate(infixQueue); // evaluate
            return result;  //done
        } // unless exceptions were thrown by tokenize() and/or evaluate(...) above.
        catch(NumberFormatException e)
        {
            System.out.println("Operand must be an integer: " + e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid arithmetic operation: " + e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Invalid infix expression: " + e.getMessage());
        }
        catch(Exception e)  // catch any other exceptions
        {
            System.out.println("Unexpected error: " + e.getMessage());
            //e.printStackTrace();
        }
        // returns null to indicate that evalution was aborted.
        // due to one of the expections above.
        return null;
    }
    
    /**
     * Returns the percedence of the supplied operator.
     * 0 = "(".
     * 1 = " + - ".
     * 2 = " * / % ".
     * if op is invalid, throw exception.
     * @param op the operator of which the percedence is needed. 
     * @return the number corresponding to the percedence.
     */
    public static int precedence(String op) 
    {
        if(")".equals(op))
        {
            return -1;
        }
        else if("(".equals(op))
        {
            return 0;
        }
        if("+".equals(op) || "-".equals(op))
        {
            return 1;
        }
        if("*".equals(op) || "/".equals(op)|| "%".equals(op))
        {
            return 2;
        }
        System.out.println("current token" + op);
        {
            throw new IllegalArgumentException("op is invalid.");
        }
        
    }
    
    /**
     * Does the operations using the ops and the vals.
     * throws 4 exceptions.
     * @param opStack the stack containing the operators.
     * @param valStack thee stack containing the variables.
     */
    public static void applyStackTopOperator(Stack<String> opStack, Stack<Integer> valStack)
    {
        if(opStack.empty())
        {
            throw new IllegalArgumentException("Missing oprator");
        }
        if(opStack.peek().equals("("))
        {
            throw new IllegalArgumentException("Missing right parenthesis");
        }
        String op = opStack.peek();
        opStack.pop();
        
        if(valStack.empty())
        {
            throw new IllegalArgumentException("Missing operand");
        }
        Integer v2 = valStack.peek();
        valStack.pop();
        
        if(valStack.empty())
        {
            throw new IllegalArgumentException("Missing operand");
        }
        Integer v1 = valStack.peek();
        valStack.pop();
        
        if(op.equals("+"))
        {
            Integer result = v1 + v2;
            valStack.push(result);  
        }
        
        else if(op.equals("-"))
        {
            Integer result = v1 - v2;
            valStack.push(result);
        }
        
        else if(op.equals("*"))
        {
            Integer result = v1 * v2;
            valStack.push(result);
        }
        
        else if(op.equals("/"))
        {
            if(v2 == 0)
            {
               throw new ArithmeticException("Division by zero not defined");
            }
            Integer result = v1 / v2;
            valStack.push(result);
        }
        
        else if(op.equals("%"))
        {
             if(v2 == 0)
            {
               throw new ArithmeticException("Division by zero not defined");
            }
            Integer result = v1 % v2;
            valStack.push(result);
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }
    
    @Override
    public String toString()
    {
        String display = "";
        char[] array = infix.toCharArray();
        for (char ch : array)
        {
            display += ch +  " " ;
        }   
        return display;
    } 
}

