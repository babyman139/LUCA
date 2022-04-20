package week_13;

public class White {

	public void wChoosePiece(int x1, int y1) {

		// if x,y = pa
		// call bPawn.canMoveTo
		// call bPawn.MoveTo
		// break
		// if x,y = ro
		// call bRook
		// break
		// if x,y = kn
		// call bKnight
		// break
		// if x,y = bi
		// call bBishop
		// break
		// if x,y = qu
		// call bQueen
		// break
		// if x,y = ki
		// call bKing
		// break
		// else print error and restart.
	}
}

class WPawn implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}

class WRook implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}

class WKnight implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}

class WBishop implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}

class WKing implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}

class WQueen implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		return false;
	}

	@Override
	public void moveTo(int x, int y) {

	}

}