package com.example.sort;
import java.util.*;

public class custom
{
  public static void main(String [] args)
  {
    try
    {
      int i=10/Integer.parseInt(args[0]);
    }

    catch(ArithmeticException f)
    {
      System.out.println(f);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally
    {
      System.out.print("End point");
    }
  }
}
