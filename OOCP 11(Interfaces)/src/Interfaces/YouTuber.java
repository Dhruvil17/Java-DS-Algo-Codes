package Interfaces;

public abstract interface YouTuber extends VideoEditor {

	abstract void makeVideo();
	
	default void editVideo()
	{
		System.out.println("Video is being edited by YouTuber");
	}
}
