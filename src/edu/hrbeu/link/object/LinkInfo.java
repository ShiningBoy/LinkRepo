package edu.hrbeu.link.object;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;

//List, 保存了连接线需要经过的点
public class LinkInfo {
	//用于保存连接点
	private List<Point> points = new ArrayList<Point>();
	/*
	 * 两个方块间最多3条线段项链，最多2个拐点，加上相连两个方块的中心，最多4个连接点，最少2个连接点
	 */
	
	//两个Point能直接相连
	public LinkInfo(Point p1, Point p2){
		points.add(p1);
		points.add(p2);
	}
	
	//p2为p1-p3之间的转折点
	public LinkInfo(Point p1, Point p2, Point p3){
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}
	//p2,p3为p1-p4之间的转折点
	public LinkInfo(Point p1, Point p2, Point p3, Point p4){
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
	}
	//返回链接集合
	public List<Point> getLinkPoints(){
		return points;
	}
}
