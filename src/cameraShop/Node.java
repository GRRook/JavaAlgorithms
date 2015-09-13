package cameraShop;

class Node {
	int key;
	String data;
	Node leftChild;
	Node rightChild;
	Node parent;
	
	public Node(){		
	}
	
	public Node(int key, String data){
		this.key = key;
		this.data = data;
	}
}
