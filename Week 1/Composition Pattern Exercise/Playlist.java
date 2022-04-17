public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void play(){
	    for(IComponent component : playlist){
	        component.play();
	    }
	}

    public void setPlaybackSpeed(float: speed){
	    for(IComponent component : playlist){
	        component.setPlaybackSpeed(speed);
	    }
	}
	
	public String getName(){
	    return playlistName;
	}
	
	public void add(component: IComponent){
	    playlist.add(component);
	}
	
	public void remove(component: IComponent){
	    playlist.remove(component);
	}
    

}
