package edu.hrbeu.link.board;

import edu.hrbeu.link.object.LinkInfo;
import edu.hrbeu.link.view.Piece;

public interface GameService {
	//控制游戏开始的开发
	void start();
	
	//返回二维数组
	Piece[][] getPiece();
	
	boolean hasPieces();
	
	Piece findPiece(float touchX, float touchY); 
	
	LinkInfo link(Piece p1, Piece p2);
}
