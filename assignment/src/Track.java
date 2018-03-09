
public class Track {

	private String trackname = "";
	private String artist = "";
	int tracknumber = 0;
	int duration = 0;
	
	public void setTrack(String trackname, String artist, int tracknumber, int duration){
		this.trackname = trackname;
		this.artist = artist;
		this.tracknumber = tracknumber;
		this.duration = duration;
	}
	
	public String gettrackname(){
		return trackname;
	}
	public String getartist(){
		return artist;
	}
	public int gettracknumber(){
		return tracknumber;
	}
	public int getduration(){
		return duration;
	}
	
}
