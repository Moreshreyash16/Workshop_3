package Bridgelabz.Workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheatre {
    ArrayList<String> movies=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public int nummovies;
    public void addmovies(int n){
        System.out.println("Enter movies");
        for (int i=0;i<=n;i++){
            String mv=sc.next();
            movies.add(mv);
        }
    }
    public void searchMovies(String s){
        if (movies.contains(s)){
            System.out.println("Movie Loading....");
        }
    }
    public void DeleteMovies(String s){
        if (movies.contains(s)){
            movies.remove(s);
            System.out.println("removed");
        }
    }
    public void show(){
        System.out.println(movies);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTheatre mt = new MovieTheatre();
        System.out.println("Enter number of movies");
        int n = sc.nextInt();
        mt.addmovies(n);
        System.out.println("The movies are ");
        mt.show();
        System.out.println("which movie do you want to watch ");
        String movi=sc.next();

        mt.searchMovies(movi);

        System.out.println("which movie do you want to Delete ");
        String mov=sc.next();
        mt.DeleteMovies(mov);
        mt.show();
    }
}
