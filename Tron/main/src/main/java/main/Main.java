package main;
import Controller.GameController;
import Controller.IController;
import Model.Grid;
import Model.ITronModel;
import Model.TronModel;
import View.Frame;
import View.IView;

public abstract class Main {

    public static void main(final String[] args) {
    	// on charge le model
    	final ITronModel model = new TronModel();
    	//on set la grid
    	model.setGrid(new Grid());
    	//on charge  avec model
    	final IView view = new Frame(model);	
    	//et on charge le controlleur
    	IController game = new GameController(model, view);
    	//on lance le jeu
    	game.play();
    	
    }

}
