package Âü¹þ¶Ù¾àÀë;

import java.util.ArrayList;

public class PathFinder {
	
	public ArrayList<Node> shortestPath(Node start, Node end){
		//to store the result
		ArrayList<Node> shortestPath=new ArrayList<Node>();
		//
		ArrayList<Node> expandList=new ArrayList<Node>();
		//
		ArrayList<Node> finishList=new ArrayList<Node>();
		//
		Node currentNode=start;
		expandList.add(currentNode);
		
		here:
		while(!finishList.contains(end)){
			
			for(Node node:currentNode.surroundingNodes()){
				
				int gTemp=currentNode.getG()+currentNode.commonEdge(node).getLength(); 
				int hTemp=node.findH(end);
				
				if(expandList.contains(node)){
					if(node.getG()>gTemp){
						node.setG(gTemp);
						node.setPrev(currentNode);
					}
				}
				if((!expandList.contains(node))&&(!finishList.contains(node))){
					node.setG(gTemp);
					node.setH(hTemp);
					node.setF(gTemp+hTemp);
					node.setPrev(currentNode);
					expandList.add(node);
				}
				if(node.equals(end)){
					break here;
				}
			}
			expandList.remove(currentNode);
			finishList.add(currentNode);
			//select the node in expandList with smallest f 
			currentNode=nextExpand(expandList);
				
		}
		Node temp=end;
		while(temp!=null){
			shortestPath.add(0, temp);
			temp=temp.getPrev();
		}
		
		
		return shortestPath;
	}
	
	private Node nextExpand(ArrayList<Node> nodeList){
		Node next=nodeList.get(0);
		for(int i=1;i<nodeList.size();i++){
			if(nodeList.get(i).getF()<next.getF()){
				next=nodeList.get(i);
			}
		}
		return next;
	}
}	
