package com.labprogrames;

public class Movie {
	int movieid;
	String movieName;
	String heroName;
	int availableseats;
	String theaterName;
	 static String managerName;

	void displayMovieDetails() {
		System.out.println("movieid:" + movieid);
		System.out.println("movieName:" + movieName);
		System.out.println("heroName:" + heroName);

	}

	void displayTheaterDetails() {
		System.out.println("availableseats:" + availableseats);
		System.out.println("theaterName:" + theaterName);
		System.out.println("managerName:" + managerName);

	}

	void bookSeat() {
		availableseats--;
		System.out.println("remaining availableseats:"+availableseats);

	}

	 static void changemanager() {
		managerName ="kavi" ;
		System.out.println(managerName);

	}

	public static void main(String[] args) {

		Movie M = new Movie();
		M.movieid = 101;
		M.movieName = "kgf";
		M.heroName = "ram";
		M.availableseats = 200;
		M.theaterName = "pvr";
		M.managerName = "rohit";
		M.displayMovieDetails();
		M.displayTheaterDetails();
		M.bookSeat();
		

		Movie M1 = new Movie();
		M1.movieid = 102;
		M1.movieName = "king";
		M1.heroName = "nag";
		M1.availableseats = 100;
		M1.theaterName = "innn";
		M1.displayMovieDetails();
		M1.displayTheaterDetails();
		M1.bookSeat();
		M1.changemanager();

	}

}
