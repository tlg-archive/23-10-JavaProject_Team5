package io.trivia;

public class AsciiArt extends CallAscii{
	String ascii;

	public void loadTitle() throws InterruptedException {
		System.out.println("  _______ _                           _   _           ______                    _   _                   _ ");
		Thread.sleep(400);
		System.out.println(" |__   __| |                         | \\ | |         |  ____|                  | | (_)                 | |");
		Thread.sleep(375);
		System.out.println("    | |  | |__  _ __ _____      __   |  \\| | ___     | |__  __  _____ ___ _ __ | |_ _  ___  _ __  ___  | |");
		Thread.sleep(350);
		System.out.println("    | |  | '_ \\| '__/ _ \\ \\ /\\ / /   | . ` |/ _ \\    |  __| \\ \\/ / __/ _ \\ '_ \\| __| |/ _ \\| '_ \\/ __| | |");
		Thread.sleep(325);
		System.out.println("    | |  | | | | | | (_) \\ V  V /    | |\\  | (_) |   | |____ >  < (_|  __/ |_) | |_| | (_) | | | \\__ \\ |_|");
		Thread.sleep(300);
		System.out.println("    |_|  |_| |_|_|  \\___/ \\_/\\_/     |_| \\_|\\___/    |______/_/\\_\\___\\___| .__/ \\__|_|\\___/|_| |_|___/ (_)");
		Thread.sleep(275);
		System.out.println("                                                                         | |                              ");
		Thread.sleep(250);
		System.out.println("                                                                         |_|                              ");
	}



}