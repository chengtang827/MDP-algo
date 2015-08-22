package Âü¹ş¶Ù¾àÀë;

import java.util.List;

public class Graph {

	private List<Node> nodeList;
	
	private List<Edge> edgeList;

	
	public Graph(List<Node> nodeList, List<Edge> edgeList){
		this.nodeList=nodeList;
		this.edgeList=edgeList;
	}
	
	public List<Node> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<Node> nodeList) {
		this.nodeList = nodeList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	
	
}
