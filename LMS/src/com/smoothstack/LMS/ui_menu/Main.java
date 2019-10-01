package com.smoothstack.LMS.ui_menu;

import java.util.List;
//import java.util.InputMismatchExecption;
import java.util.Scanner;

import com.smoothstack.LMS.dao.*;
import com.smoothstack.LMS.entity.*;
import com.smoothstack.LMS.service.*;

// ============================================= Main Class ================================================
public class Main {	
// *************************************** Console clear Function *************************
	public static void clr() {
		for (int i = 0; i < 38; i++)
			System.out.println();
	} // Creates new lines to push old entries up by calling clr() function

// =========================================================================================================	
// ****************************************** Add (Top Menu) *******************************************
	public static void add() {
		Scanner in = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("What are you adding?\n\n"
					+ "1) Book\n"
					+ "2) Author\n"
					+ "3) Publisher\n"
					+ "4) Go Back");
			choice = in.next();
			
			if(choice.equals("1")) {
				addBook();
			} else if (choice.equals("2")) {
				addAuthor();
			} else if (choice.equals("3")) {
				addPublisher();
			} else if (choice.equals("4")) {
				break;
			} else {
				System.out.println("Invalid entry!!\n");
			}
		} while (true);
	}

// -------------------------------------- Add Publisher (SubMenu) ------------------------------------
	private static void addPublisher() {
		Scanner in = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("1) Enter New Publisher name\n"
					+ "2) Go Back");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("New Publisher Name: ");
				choice = in.next();
			}
			else if (choice.equals("2")){
				break;	
			}
			else {
				System.out.println("Invalid entry !!\n");
				}
		}while(true);
	}
// -------------------------------------- Add Author (SubMenu) ----------------------------------------
	private static void addAuthor() {
		Scanner in = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("1) Enter New Author name\n"
					+ "2) Go Back");
			choice = in.next();	
			
			if (choice.equals("1")) {		
				System.out.println("New Author Name: ");
				choice = in.next();	
			}
			else if (choice.equals("2")){
				break;	
			}
			else {
				System.out.println("Invalid entry !!\n");
			}
		
		}while (true);		
	}
// ---------------------------------------- Add Book (SubMenu) ------------------------------------------
	private static void addBook() {
		Scanner in = new Scanner(System.in);
		String choice = null;
		do {
			System.out.println("To add a book you would also need to know its author and publisher."
					+ "\nIf you don't have that information enter 'X' to exit and come back later."
					+ "\nIf you do have the required information enter anything other than 'x'.");
			
			String bookName = null;
			String author = null; 
			String publisher = null;			
			
			System.out.println("Enter Book Name: ");
			bookName = in.nextLine();
			if(bookName.equalsIgnoreCase("x")) {
				break;
			}
			System.out.println("Enter Book Author: ");
			author = in.nextLine();
			if(author.equalsIgnoreCase("x")) {
				break;
			}
			System.out.println("Enter Book Publisher: ");
			publisher = in.nextLine();
			if(publisher.equalsIgnoreCase("x")) {
				break;
			}
			/*
			Book book = new Book();
			book.setBookName(bookName);
			book.setBookAuthor(bookAuthor);
			book.setBookPublisher(bookPublisher);
			bs.addBook(book);
			*/
			System.out.println("[+] Book Added!");
		
			System.out.println("Do you want to add another book? (Y or N)");
			choice = in.nextLine();
			
			if(choice.equalsIgnoreCase("y")) {
				System.out.println();
			}
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println();
				break;
			}
			else {
				System.out.println("Invalid entry !!\n Exiting...\n");
				break;
			}
		
		}while (true);
	}

// =========================================================================================================
// ******************************************* Edit (Top Menu) *******************************************
	private static void edit() {
			Scanner in = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("What are you editing?\n\n"
					+ "1) Book\n"
					+ "2) Author\n"
					+ "3) Publisher\n"
					+ "4) Go Back");
				choice = in.next();
			
				if(choice.equals("1")) {
						editBook();
					} else if (choice.equals("2")) {
						editAuthor();
					} else if (choice.equals("3")) {
						editPublisher();
					} else if (choice.equals("4")) {
						break;
					} else {
						System.out.println("Invalid entry!!\n");
				}	
			} while (true);
		}

// -------------------------------------- Edit Publisher (SubMenu) ------------------------------------
	private static void editPublisher() {
			Scanner in = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("1) Enter what Publisher you would like to edit\n"
						+ "2) Go Back");
				choice = in.next();
				if (choice.equals("1")) {
				}
				else if (choice.equals("2")){
					break;	
				}
				else {
					System.out.println("Invalid entry !!\n");
					}
			}while(true);
		}
// -------------------------------------- Edit Author (SubMenu) ----------------------------------------
	private static void editAuthor() {
			Scanner in = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("1) Enter what Author you would like to edit\n"
						+ "2) Go Back");
				choice = in.next();	
				
				if (choice.equals("1")) {		

				}
				else if (choice.equals("2")){
					break;	
				}
				else {
					System.out.println("Invalid entry !!\n");
				}
			
			}while (true);		
		}
// ---------------------------------------- Edit Book (SubMenu) ------------------------------------------
	private static void editBook() {
			Scanner in = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("1) Enter what Book you would like to edit\n"
						+ "2) Go Back");
				choice = in.next();
				
				if (choice.equals("1")) {
					
				}
				else if (choice.equals("2"))
				{
					break;
				}
				else {
					System.out.println("Invalid entry !!\n");
				}
			}while (true);
		}

	
// =========================================================================================================
// ******************************************* Delete (Top Menu) *******************************************
	private static void delete() {
				Scanner in = new Scanner(System.in);
				String choice = null;
				do {
					System.out.println("What are you deleting?\n\n"
						+ "1) Book\n"
						+ "2) Author\n"
						+ "3) Publisher\n"
						+ "4) Go Back");
					choice = in.next();
				
					if(choice.equals("1")) {
							deleteBook();
						} else if (choice.equals("2")) {
							deleteAuthor();
						} else if (choice.equals("3")) {
							deletePublisher();
						} else if (choice.equals("4")) {
							break;
						} else {
							System.out.println("Invalid entry!!\n");
					}	
				} while (true);
			}

// -------------------------------------- Delete Publisher (SubMenu) ------------------------------------
	private static void deletePublisher() {
				Scanner in = new Scanner(System.in);
				String choice = null;
				do {
					System.out.println("1) Enter what Publisher you would like to delete\n"
							+ "2) Go Back");
					choice = in.next();
					if (choice.equals("1")) {
					
					}
					else if (choice.equals("2")){
						break;	
					}
					else {
						System.out.println("Invalid entry !!\n");
						}
				}while(true);
			}
// -------------------------------------- Delete Author (SubMenu) ----------------------------------------
	private static void deleteAuthor() {
				Scanner in = new Scanner(System.in);
				String choice = null;
				do {
					System.out.println("1) Enter what Author you would like to delete\n"
							+ "2) Go Back");
					choice = in.next();	
					
					if (choice.equals("1")) {		
						
					}
					else if (choice.equals("2")){
						break;	
					}
					else {
						System.out.println("Invalid entry !!\n");
					}				
				}while (true);		
			}
// ---------------------------------------- Delete Book (SubMenu) ------------------------------------------
	private static void deleteBook() {
				Scanner in = new Scanner(System.in);
				String choice = null;
				do {
					System.out.println("1) Enter what Book you would like to delete\n"
							+ "2) Go Back");
					choice = in.next();
					
					if (choice.equals("1")) {	
					}
					
					else if (choice.equals("2")) {
						break;
					}
					
					else {
						System.out.println("Invalid entry !!\n");
					}
				}while (true);
			}
/* =========================================================================================================
 *  ------------------------------------------ Main Menu (Top) -------------------------------------------	
 * =========================================================================================================
*/
	public static void main(String[] args) {
		
		// Welcome note and Main Menu + prompt for input
		System.out.println("Welcome to Smoothstack's Library Management System!");
		
		Scanner in = new Scanner(System.in);
		
		String choice = null;
		do {
			System.out.println("\nPlease Choose between 1 and 4");
			System.out.println("1) Add an entry\n" 
					+ "2) Edit an enrty\n" 
					+ "3) Delete an entry\n\n" 
					+ "Enter X to exit");

			choice = in.next();

			if (choice.equals("1")) {
				add();
			} 
			else if (choice.equals("2")) {	
				edit();	
			} 
			else if (choice.equals("3")) {
				delete();
			} 
			else if (choice.equalsIgnoreCase("x")) {
				clr();
				System.out.println("Thank you for Using Smoothstack LMS\nGoodbye!");
				break;
			} 
			else {
				System.out.println("Invalid entry !!\n");
			}
		} while (true);
	}

}// End of main
