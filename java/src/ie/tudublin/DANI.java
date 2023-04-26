package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] line;
	String[] words;
	Word Addwords = new Word();

	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	String[] sonnet;

	public String[] writeSonnet() {
		return null;
	}

	public void setup() {

		colorMode(HSB);

	}

	public void loadFile() {

		line = loadStrings("small.txt");

		for (String s : line) {

			s = s.toLowerCase();

			words = split(s, ' ');

			for (String word : words) {
				word = word.replaceAll("[^\\w\\s]", "");

				Addwords.addWord(word);

			}

		}

	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);
		loadFile();

	}
}
