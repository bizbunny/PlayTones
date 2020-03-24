package assignment2;

import algs4.StdAudio;
import algs4.StdIn;
//Anh Nguyen
public class PlayTones {
	public static void playingTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}
	public static void main(String[] args) {
		StdIn.fromFile("data/a2song.txt");
		double[] notes = StdIn.readAllDoubles();
		for(double notePlayed: notes) {
			playingTone(notePlayed,0.25);
		}
		StdAudio.close();
		System.exit(0);
	}

}
