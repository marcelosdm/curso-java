import java.util.ArrayList;
import java.util.List;

public class ArrayPratica {
	public static void main(String[] args) {
		
		String[] bands = new String[3];
		
		bands[0] = "The Beatles";
		bands[1] = "Pink Floyd";
		bands[2] = "Pearl Jam";
		
//		for tradicional
		for (int i = 0; i < bands.length; i++) {
			System.out.println(bands[i]);
		}

//		forEach
		for (String band : bands) {
			System.out.println("Artist : " + band);
		}

//		lambda
		List<String> songs = new ArrayList<>();
		songs.add("Let It Be");
		songs.add("Alive");
		songs.add("Wish You Were Here");
		
		songs.parallelStream().forEach(song -> {
			System.out.println("Song: " + song);
		});
		
//		while
		int totalTracks = 14;
		int trackNumber = 1;
		
		while(trackNumber <= totalTracks) {
			System.out.println("Playing track number " + trackNumber);
			trackNumber++;
		}
	}
}
