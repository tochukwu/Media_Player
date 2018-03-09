
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

	public static Scanner in = new Scanner(System.in);
	public static ArrayList<Track> mytracks = new ArrayList<Track>();
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		do{
			System.out.println("***MainClass System***");
			System.out.println("");
			System.out.println("1 Add a Track");
			System.out.println("2 List a Track");
			System.out.println("3 Sreach a Track");
			System.out.println("4 Delete a Track");
			System.out.println("5 reorder");
			System.out.println("6 Random Track");
			System.out.println("");
			System.out.println("Enter a menu Option: ");
			
			menu = in.nextInt();
			switch(menu){
			
			case 1:
				createTrack();
				break;
			
			case 2:
				listTrack();
				break;
				
			case 3:
				findTrack();
				break;
				
			case 4:
				removeTrack();
				break;
			
			case 5:
				shuffle();
				break;
				
			case 6:
				reorder();
				break;
			}
		} while(menu != 0);
	}

	private static void reorder() {
				Collections.swap(mytracks,0,1);
				System.out.println(""+mytracks);
	}

	private static void shuffle(){
			 Collections.shuffle(mytracks);
			 System.out.println(""+mytracks);
		 }

	private static void	createTrack(){
		
		Track newtrack = new Track();
	
	System.out.println("track name");
	String trackname = in.next();

	System.out.println("track number");
	int tracknumber = in.nextInt();
	
	System.out.println("artist");
	String artist = in.next();
	
	System.out.println("duration");
	int duration = in.nextInt();
	
	newtrack.setTrack(trackname, artist, tracknumber, duration);
	
	mytracks.add(newtrack);
	
	}
	private static void listTrack(){
	String header = "\nTrackName tArtist\tTrackNumber\tDuration\n";
		   header += "\n\t---\t----\t-----\t-----\n";
		   
		   System.out.println("\t\t******mp3 songs******"+header );
		
		for(int i = 0; i < mytracks.size() ; i ++){
			
			System.out.println("\t"+ mytracks.get(i).gettrackname() + "\t" +
								mytracks.get(i).getartist() + "\t" +
								mytracks.get(i).gettracknumber() + "\t" +
								mytracks.get(i).getduration());
			
			if(i == (mytracks.size() - 1)){
				System.out.println();
			}
		}
	}
	


private static void removeTrack(){

System.out.println("Enter track number: ");
int tracknumber = in.nextInt();
			
			for (int i = 0; i < mytracks.size(); i++){
				
				if (mytracks.get(i).gettracknumber() == tracknumber) {
					mytracks.remove(i);
					
					System.out.println("Track number "+ tracknumber + " has been deleted");
				}

			}
		}
	private static void findTrack(){
		
		System.out.println("Enter track number: ");
		int tracknumber = in.nextInt();
		
		for (int i = 0; i < mytracks.size(); i++){
			
			if (mytracks.get(i).gettracknumber() == tracknumber) {
				
				System.out.println( "Track name: " + mytracks.get(i).gettrackname()+ "\n" +
						"Artist: " + mytracks.get(i).getartist() + "\n" +
						"Dutation: " + mytracks.get(i).getduration() + "\n" +
						"Track number: " + mytracks.get(i).gettracknumber());
			}

		}
	}
	
}
