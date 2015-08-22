package Âü¹þ¶Ù¾àÀë;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		Node n1=new Node(1,1,1);
		Node n2=new Node(3,3,3);
		Node n3=new Node(2,3,1);
		Node n4=new Node(4,3,4);
		Node n5=new Node(5,6,3);
		
		Edge e1=new Edge(n1,n2);
		Edge e2=new Edge(n1,n3);
		Edge e3=new Edge(n1,n4);
		Edge e4=new Edge(n2,n5);
		Edge e5=new Edge(n3,n5);
		Edge e6=new Edge(n4,n5);
		
		ArrayList<Edge> l1=new ArrayList<Edge>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		ArrayList<Edge> l2=new ArrayList<Edge>();
		l2.add(e1);
		l2.add(e4);
		ArrayList<Edge> l3=new ArrayList<Edge>();
		l3.add(e2);
		l3.add(e5);
		ArrayList<Edge> l4=new ArrayList<Edge>();
		l4.add(e3);
		l4.add(e6);
		ArrayList<Edge> l5=new ArrayList<Edge>();
		l5.add(e4);
		l5.add(e5);
		l5.add(e6);
		
		n1.setEdges(l1);
		n2.setEdges(l2);
		n3.setEdges(l3);
		n4.setEdges(l4);
		n5.setEdges(l5);
		
		ArrayList<Node> path=new PathFinder().shortestPath(n1, n5);
		for(Node node:path){
			System.out.println(node.getNodeId()+" ");
		}
	}
	
}
