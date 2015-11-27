package com.epam.game.util;

import java.util.ArrayList;
import java.util.List;

import com.epam.game.algorithm.CrossingAlgorithm;
import com.epam.game.algorithm.RightHandAlgorithm;
import com.epam.game.algorithm.WaveAlgorithm;
import com.epam.game.model.Duck;
import com.epam.game.model.Labyrinth;

public class GameUtil {

	public static List<CrossingAlgorithm> buildAlgorithms(){
		List<CrossingAlgorithm> algs = new ArrayList<CrossingAlgorithm>();
		algs.add(new WaveAlgorithm());
		algs.add(new RightHandAlgorithm());
		return algs;
	}
	
	public static List<Duck> createPlayers(){
		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(new Duck("player one"));
		ducks.add(new Duck("player two"));
		return ducks;
	}
	
	public static void play(Labyrinth labyrinth, List<CrossingAlgorithm> buildAlgorithms, List<Duck> ducks){
		
	}
}
