package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.company.Controller.AdminController;
import com.company.Controller.UserController;

public class Example {
            static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) throws InputMismatchException{
			System.out.println("Enter your choice:"+ "\n" + "1.Admin" + "\n" + "2.Users" + "\n" + "3.Logout from Application");
			int loginChoice = getValue();
			while(true) {	
						switch(loginChoice) {
						case 1:{
							AdminController admin = new AdminController();
							admin.handleAdmin();
							break;
						}
						case 2:{
							UserController user = new UserController();
							user.handleUser();
							break;
						}
						case 3:{
							System.out.println("Thanks for visiting our website see you soon...");
							return;
						}
						default:
							System.out.println("Enter valid input");
							break;
						}
						System.out.println("Enter your choice:"+ "\n" + "1.Admin" + "\n" + "2.Users" + "\n" + "3.Logout from Application");
						loginChoice = getValue();
				}

					}

		public static int getValue() {
			while(true) {
				try {
					int n = sc.nextInt();
					return n;
				}catch(Exception e) {
					System.out.println("Please enter the valid input");
					continue;
				}
			}
		}
		}

