package com.syntax.javahomework;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    
		    switch (browser){
		      case "ChRoME":
		        System.out.println("Proceed with Chrome browser");
		        break;
		        case "FireFOX":
		          System.out.println("Proceed with Firefox browser");
		          break;
		          case "IE":
		            System.out.println("Proceed with IE browser");
		            break;
		            default:
		            System.out.println("Invalid browser");
		    }
		  }
		}
