package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;

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
		loadFile();
		Addwords.printModel();

	}

	public String[] getLine() {
		return line;
	}

	public void setLine(String[] line) {
		this.line = line;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public Word getAddwords() {
		return Addwords;
	}

	public void setAddwords(Word addwords) {
		Addwords = addwords;
	}

	public String[] getSonnet() {
		return sonnet;
	}

	public void setSonnet(String[] sonnet) {
		this.sonnet = sonnet;
	}

	public float getOff() {
		return off;
	}

	public void setOff(float off) {
		this.off = off;
	}

	///// This loads the file ////

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

	}

	@Override
	public String toString() {
		return "DANI [line=" + Arrays.toString(line) + ", words=" + Arrays.toString(words) + ", Addwords=" + Addwords
				+ ", sonnet=" + Arrays.toString(sonnet) + ", off=" + off + "]";
	}

}
