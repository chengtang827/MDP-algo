package Âü¹þ¶Ù¾àÀë;

public class Edge {
	
	private Node node1;
	
	private Node node2;
	
	private int length;

	public Edge(Node node1,Node node2){
		this.node1=node1;
		this.node2=node2;
		this.length=Math.abs(node1.getX()-node2.getX())+Math.abs(node1.getY()-node2.getY())*10;;
	}
	
	public Node theOtherNode(Node thisNode){
		if(thisNode.getNodeId()==node1.getNodeId()){
			return node2;
		}
		else{
			return node1;
		}
	}
	
	public Node getNode1() {
		return node1;
	}

	public void setNode1(Node node1) {
		this.node1 = node1;
	}

	public Node getNode2() {
		return node2;
	}

	public void setNode2(Node node2) {
		this.node2 = node2;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	

	
	
	
	
	
	
	
}
