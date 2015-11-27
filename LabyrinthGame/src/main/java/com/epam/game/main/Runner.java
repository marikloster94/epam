package com.epam.game.main;

import java.util.List;

import com.epam.game.algorithm.CrossingAlgorithm;
import com.epam.game.load.LabyrinthLoader;
import com.epam.game.load.LabyrinthLoaderFromFile;
import com.epam.game.model.Duck;
import com.epam.game.model.Labyrinth;
import com.epam.game.util.GameUtil;

public class Runner {

	public static void main(String [] args){
		LabyrinthLoader loader  = new LabyrinthLoaderFromFile();
		Labyrinth labyrinth = loader.load();
		List<CrossingAlgorithm> algorithms = GameUtil.buildAlgorithms();
		List<Duck> ducks = GameUtil.createPlayers();
		GameUtil.play(labyrinth, algorithms, ducks);
		
	}
}
