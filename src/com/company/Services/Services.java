package com.company.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.Controller.AdminController;
import com.company.Models.Category;
import com.company.Models.Products;

	public class Services {
		Scanner in = new Scanner(System.in);  
		public void addProduct() {
			for(int i=0;i<AdminController.categories.size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(i).getName());
            }
			System.out.println("Enter your choice:");
			int catChoice = in.nextInt();
			System.out.println("Enter the product to be added");
            String product = in.next();
            System.out.println("Enter the price of the product");
            int price = in.nextInt();
            System.out.println("Enter the number of products:");
            int numOfProducts = AdminController.getValue();
            Products pr = new Products();
            pr.setName(product);
            pr.setNumberOfProducts(numOfProducts);
            pr.setPrice(price);
            AdminController.categories.get(catChoice-1).getProducts().add(pr);
            for(int i=0;i<AdminController.categories.get(catChoice-1).getProducts().size();i++) {
			    System.out.println(AdminController.categories.get(catChoice-1).getProducts().get(i).getName()+ " "+ AdminController.categories.get(catChoice-1).getProducts().get(i).getPrice());
              }
            }

		public void deleteProduct() {
			for(int i=0;i<AdminController.categories.size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(i).getName());
            }
			System.out.println("Enter your choice of category of the product to be deleted");
			int catChoice = in.nextInt();
			for(int i=0;i<AdminController.categories.get(catChoice-1).getProducts().size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(catChoice-1).getProducts().get(i).getName());
			}
			System.out.println("Enter your choice of product to be deleted");
		    int proChoice = in.nextInt();
		    AdminController.categories.get(catChoice-1).getProducts().remove(proChoice-1);
		    for(int i=0;i<AdminController.categories.get(catChoice-1).getProducts().size();i++) {
			    System.out.println(AdminController.categories.get(catChoice-1).getProducts().get(i).getName());
              }
		}

		public void addCategory() {
			Category ca = new Category();
			System.out.println("Enter the category to be added:");
			String category = in.next();
			ca.setName(category);
			ca.setProducts(new ArrayList<>());
			AdminController.categories.add(ca);
			for(int i=0;i<AdminController.categories.size();i++) {
			    System.out.println(AdminController.categories.get(i).getName());
            }
			}

		public void deleteCategory() {
			for(int i=0;i<AdminController.categories.size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(i).getName());
            }
			System.out.println("Enter your choice of category to be deleted");
			int catChoice = in.nextInt();
			AdminController.categories.remove(catChoice-1);
			for(int i=0;i<AdminController.categories.size();i++) {
			    System.out.println(AdminController.categories.get(i).getName());
            }
		}

		public void updateDetails() {
			Products pr = new Products();
			for(int i=0;i<AdminController.categories.size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(i).getName());
            }
			System.out.println("Enter your choice of category of the product to be updated");
			int catChoice = in.nextInt();
			for(int i=0;i<AdminController.categories.get(catChoice-1).getProducts().size();i++) {
				System.out.println((i+1)+". "+AdminController.categories.get(catChoice-1).getProducts().get(i).getName());
			}
			System.out.println("Enter your choice of product to be updated");
			int proChoice = in.nextInt();
		    System.out.println("Enter what to update in product name");
		    String pro = in.next();
		    System.out.println("Enter price of the product");
		    int pri = in.nextInt();
		    System.out.println("Enter number of products");
		    int num = in.nextInt();
		    pr.setName(pro);
            pr.setNumberOfProducts(num);
            pr.setPrice(pri);
		    AdminController.categories.get(catChoice-1).getProducts().remove(proChoice-1);
		    AdminController.categories.get(catChoice-1).getProducts().add(pr);
		    for(int i=0;i<AdminController.categories.get(catChoice-1).getProducts().size();i++) {
		    	System.out.println(AdminController.categories.get(catChoice-1).getProducts().get(i).getName()+ " "+ AdminController.categories.get(catChoice-1).getProducts().get(i).getPrice());
              }
		}

		public void login() {
			// TODO Auto-generated method stub
			
		}

		public void signup() {
			// TODO Auto-generated method stub
			
		}

	
}
