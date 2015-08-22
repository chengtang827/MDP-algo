package Âü¹þ¶Ù¾àÀë;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private int nodeId;
	
	private List<Edge> edges;
	
	private int f;
	
	private int g;
	
	private int h;
	
	private int x;
	
	private int y;
	
	private Node prev=null;
	
	public Node(int nodeId,int x,int y){
		this.nodeId=nodeId;
		this.x=x;
		this.y=y;
	}
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	
	
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getNodeId(){
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	public ArrayList<Node> surroundingNodes(){
		ArrayList<Node> nodeList=new ArrayList<Node>();
		
		for(Edge edge:edges){
			nodeList.add(edge.theOtherNode(this));
		}
		
		return nodeList;
	}
	
	public Edge commonEdge(Node node){
		for(Edge edge:edges){
			if(node.equals(edge.theOtherNode(this))){
				return edge;
			}
		}
		return null;
	}
	
	public int findH(Node end){
		int h=Math.abs(this.getX()-end.getX())+Math.abs(this.getY()-end.getY())*10;
		return h;
	}
	
}
