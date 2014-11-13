package edu.hrbeu.link.view;
//一个Piece对象代表界面上的一个方块，方块上的图片，方块代表的二维数组中的哪个元素，左上角在界面的x，y坐标
public class Piece {
	//方块对应的图片
	private PieceImage image;
	//该方块的左上角的x坐标
	private int beginX;
	//该方块的左上角的y坐标
	private int beginY;
	//该对象在Piece[][]数组中一维索引值
	private int indexX;
	//该对象在Piece[][]数组中二维索引值
	private int indexY;
	
	//设置该Piece对象在棋盘数组中的位置
	public Piece(int indexX, int indexY){
		this.indexX = indexX;
		this.indexY = indexY;
	}
	//判断两个Piece上的图片是否相同
	public boolean isSameImage(Piece other){
		if(image == null){
			if(other.image != null){
				return false;
			}
		}
		//只要Piece封装图片ID相同，即认为两个Piece相等
		return image.getImageId() == other.image.getImageId();
	}

	public PieceImage getImage() {
		return image;
	}

	public void setImage(PieceImage image) {
		this.image = image;
	}

	public int getBeginX() {
		return beginX;
	}

	public void setBeginX(int beginX) {
		this.beginX = beginX;
	}

	public int getBeginY() {
		return beginY;
	}

	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}

	public int getIndexX() {
		return indexX;
	}

	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}

	public int getIndexY() {
		return indexY;
	}

	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}
	
	
}
