package Model;

import Model.IGrid;
import Model.ITronModel;

/**
 * <h1>The  Model class</h1>
 * 
 * 
 * @version 1.0
 */
public class TronModel implements ITronModel{
	private IGrid grid;
	/**
	 * 
	 *
	 * @see Model.ITronModel#getGrid()
	 */
	public IGrid getGrid() {
		return grid;
	}
	/**
	 * 
	 * @see Model.ITronModel#setGrid(Model.IGrid)
	 */
	public void setGrid(IGrid grid) {
		this.grid = grid;
	}

	
	
	
}
