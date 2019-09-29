package br.edu.ifpb.padroes.model;

import br.edu.ifpb.padroes.build.MazeGeneralBuilder;

public class MazeDirector {
	protected MazeGeneralBuilder magic;

	public MazeDirector(MazeGeneralBuilder mazer) {
		this.magic = mazer;
	}
	
	public void buildMaze() {
		this.magic.makeMaze();
	}
	
	public Maze getMagic() {
		return this.magic.getMaze();
	}
	
	
}
