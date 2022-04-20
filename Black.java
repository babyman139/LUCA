package week_13;

import java.util.*;

public class Black {
	Scanner scan = new Scanner(System.in);

	public void bChoosePiece(int x, int y) {
		
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

class BPawn implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		// can move 0,-1 or 0,-2 IF on row 2 or 1,-1/-1,-1 IF there is an enemy piece on
		// that square
		// basic move = 0,-1 if currentX, currentY - 1 = - then true
		// first move is equal to 0,-2 if currentX, currentY - 2 = - and currentY = 7
		// then true and currentX, currentY - 1 = -
		// captureRight is equal to 1,-1 if currentX + 1, currentY - 1 =
		// PA,RO,KN,BI,KI,QU then true
		// captureLeft is equal to -1,-1 if currentX - 1, currentY - 1 =
		// PA,RO,KN,BI,KI,QU then true
		return false;
	}

	@Override
	public void moveTo(int x, int y) {
		// if x and y are true in the previous method then proceed, otherwise return
		// if cant move to x,y return, if can continue in func
		if (!canMoveTo(x, y)){
			return;
		}

		// error 

	}

}

class BRook implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		// can move 0,-1 or 0,-2 IF on row 2 or 1,-1/-1,-1 IF there is an enemy piece on
		// that square
		// basic move = 0,-1 if currentX, currentY - 1 = - then true
		// first move is equal to 0,-2 if currentX, currentY - 2 = - and currentY = 7
		// then true and currentX, currentY - 1 = -
		// captureRight is equal to 1,-1 if currentX + 1, currentY - 1 =
		// PA,RO,KN,BI,KI,QU then true
		// captureLeft is equal to -1,-1 if currentX - 1, currentY - 1 =
		// PA,RO,KN,BI,KI,QU then true
		return false;
	}

	@Override
	public void moveTo(int x, int y) {
		// if x and y are true in the previous method then proceed, otherwise return
		// error

	}

}

class BKnight implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		// can move -2,1 or -2,-1 or -1, 2 or -1,-2 or 1,2 or 1,-2 or 2,1 or 2,-1
		// if currentX -2 and currentY +1 = -,PA,RO,KN,BI,KI,QU
		// if currentX -2 and currentY -1 = -,PA,RO,KN,BI,KI,QU
		// if currentX -1 and currentY +2 = -,PA,RO,KN,BI,KI,QU
		// if currentX -1 and currentY -2 = -,PA,RO,KN,BI,KI,QU
		// if currentX +2 and currentY +1 = -,PA,RO,KN,BI,KI,QU
		// if currentX +2 and currentY -1 = -,PA,RO,KN,BI,KI,QU
		// if currentX +1 and currentY +2 = -,PA,RO,KN,BI,KI,QU
		// if currentX +1 and currentY -2 = -,PA,RO,KN,BI,KI,QU
		return false;

	}

	@Override
	public void moveTo(int x, int y) {
		
	}
	
}

	class BBishop implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		// can move x,x
		//standard move down/right is     for i=1 i<8 i++ if currentX + i and currentY + i == - true and repeat, if ==  PA,RO,KN,BI,KI,QUtrue and break then  if else break
		//standard move down/left is     for i=1 i<8 i++ if currentX - i and currentY + i ==  - true and repeat, if ==PA,RO,KN,BI,KI,QU true and break  then  if else break
		//standard move up/left is     for i=1 i<8 i++ if currentX - i and currentY - i ==  - true and repeat, if == PA,RO,KN,BI,KI,QU true and break then if else break
		//standard move up/right is     for i=1 i<8 i++ if currentX + i and currentY - i == - true and repeat, if ==PA,RO,KN,BI,KI,QU true and break  then  if else break
		return false;
	}

	@Override
	public void moveTo(int x, int y) {
		
	}
	
}

		class BKing implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		// can move -1,-1 or -1,0 or -1,1 or 0,1 or 0,-1 or 1,1 or 1,0 or 1,-1
		// if currentX -1 and currentY +1 = -,PA,RO,KN,BI,KI,QU
		// if currentX -1 and currentY -1 = -,PA,RO,KN,BI,KI,QU
		// if currentX -1 and currentY = -,PA,RO,KN,BI,KI,QU
		// if currentX +1 and currentY = -,PA,RO,KN,BI,KI,QU
		// if currentX +1 and currentY +1 = -,PA,RO,KN,BI,KI,QU
		// if currentX +1 and currentY -1 = -,PA,RO,KN,BI,KI,QU
		// if currentX and currentY +1 = -,PA,RO,KN,BI,KI,QU
		// if currentX and currentY -1 = -,PA,RO,KN,BI,KI,QU
		return false;
	}

	@Override
	public void moveTo(int x, int y) {
		
	}
	
}

class BQueen implements Movable {

	@Override
	public boolean canMoveTo(int x, int y) {
		//can move x,0 or x,x or 0,x
		// standard move down is     for i=1 i<8 i++ if currentY + i ==  - true and repeat, if ==  PA,RO,KN,BI,KI,QU true and break then  if else break
		// standard move up is     for i=1 i<8 i++ if currentY - i ==  - true and repeat, if ==  PA,RO,KN,BI,KI,QU true and break then  if else break
		// standard move right is     for i=1 i<8 i++ if currentX + i  == - true and repeat, if ==  PA,RO,KN,BI,KI,QU true and break then  if else break
		// standard move left is     for i=1 i<8 i++ if currentX - i  == - true and repeat, if ==  PA,RO,KN,BI,KI,QU true and break then  if else break
		//standard move down/right is     for i=1 i<8 i++ if currentX + i and currentY + i == - true and repeat, if ==  PA,RO,KN,BI,KI,QUtrue and break then  if else break
		//standard move down/left is     for i=1 i<8 i++ if currentX - i and currentY + i ==  - true and repeat, if ==PA,RO,KN,BI,KI,QU true and break  then  if else break
		//standard move up/left is     for i=1 i<8 i++ if currentX - i and currentY - i ==  - true and repeat, if == PA,RO,KN,BI,KI,QU true and break then if else break
		//standard move up/right is     for i=1 i<8 i++ if currentX + i and currentY - i == - true and repeat, if ==PA,RO,KN,BI,KI,QU true and break  then  if else break
		return false;
	}

	@Override
	public void moveTo(int x, int y) {
		
	}
	
}