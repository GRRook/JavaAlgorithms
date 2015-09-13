package cameraShop;

public class BinaryTree {
	Node root;
	
	public BinaryTree(){	
	}
	
	public void add(int key, String data){
		Node nodeToAdd = new Node(key, data);
		
		if(root == null){
			root = nodeToAdd;						
		}
		
		traverseAndAddNode(root, nodeToAdd);
	}
	
	public boolean delete (int key){
		
		Node nodeToBeDeleted = find(key);
		
		if(nodeToBeDeleted != null){
			if(nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null){
				deleteNodeWithoutChild(nodeToBeDeleted);
				return true;
			}else if(nodeToBeDeleted.leftChild != null && nodeToBeDeleted.rightChild != null){
				deleteNodeWithTwoChildren(nodeToBeDeleted);
				return true;
			}else if(nodeToBeDeleted.leftChild != null){
				deleteNodeWithOneChild(nodeToBeDeleted);
				return true;
			}else if(nodeToBeDeleted.rightChild != null){
				deleteNodeWithOneChild(nodeToBeDeleted);
				return true;
			}
		}
		return false;
	}
	
	private void deleteNodeWithoutChild(Node nodeToBeDeleted){
		if(nodeToBeDeleted.parent.leftChild.key == nodeToBeDeleted.key){
			nodeToBeDeleted.parent.leftChild = null;
		}else if(nodeToBeDeleted.parent.rightChild.key == nodeToBeDeleted.key){
			nodeToBeDeleted.parent.rightChild = null;					
		}		
	}
	
	private void deleteNodeWithOneChild(Node nodeToBeDeleted){
		if(nodeToBeDeleted.parent.leftChild.key == nodeToBeDeleted.key){
			if(nodeToBeDeleted.leftChild != null){
				nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.leftChild;
			}else if(nodeToBeDeleted.rightChild != null){
				nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.rightChild;
			}
		}else if(nodeToBeDeleted.parent.rightChild.key == nodeToBeDeleted.key){
			if(nodeToBeDeleted.leftChild != null){
				nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.leftChild;
			}else if(nodeToBeDeleted.rightChild != null){
				nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.rightChild;
			}			
		}
	}
	
	private void deleteNodeWithTwoChildren(Node nodeToBeDeleted){
		Node minNode = minLeftTraversal(nodeToBeDeleted.rightChild);
		
		delete(minNode.key);
		
		minNode.parent = nodeToBeDeleted.parent;
		minNode.leftChild = nodeToBeDeleted.leftChild;
		minNode.rightChild = nodeToBeDeleted.rightChild;
		
		if(nodeToBeDeleted.parent == null){
			root = minNode;
		}else{
			if(nodeToBeDeleted.parent.leftChild.key == nodeToBeDeleted.key){			
				nodeToBeDeleted.parent.leftChild = minNode;			
			}else if (nodeToBeDeleted.parent.rightChild.key == nodeToBeDeleted.key){
				nodeToBeDeleted.parent.rightChild = minNode;
			}
		}
	}
	
	private Node minLeftTraversal(Node node){
		if(node.leftChild == null){
			return node;
		}		
		return minLeftTraversal(node.leftChild);
	}
	
	public Node find(int key){
		if(root != null){
			return findNode(root, new Node(key, "nodeToFind"));
		}
		return null;
	}
	
	private Node findNode(Node search, Node node){
		if(search == null){
			return null;
		}
		
		if(search.key == node.key){
			return search;
		}else{
			Node returnNode = findNode(search.leftChild, node);
			if(returnNode == null){
				returnNode = findNode(search.rightChild, node);
			}
			return returnNode;
		}
		
	}
	
	private void traverseAndAddNode(Node node, Node nodeToAdd){		
		if(nodeToAdd.key < node.key){
			if(node.leftChild == null){
				nodeToAdd.parent = node;
				node.leftChild = nodeToAdd;				
			}else{
				traverseAndAddNode(node.leftChild, nodeToAdd);
			}
		}else if(nodeToAdd.key > node.key){
			if(node.rightChild == null){
				nodeToAdd.parent = node;
				node.rightChild = nodeToAdd;
			}else{
				traverseAndAddNode(node.rightChild, nodeToAdd);
			}
		}
	}
	
	public void traverse(){
		if(root != null){
			Node nodeToTraverse = root;
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null){
				System.out.println(nodeToTraverse.data);
			}else{
				inOrderTraversal(nodeToTraverse);
			}
		}
	}

	private void preOrderTraversal(Node node){
		System.out.println(node.data);

		if(node.leftChild != null){
			preOrderTraversal(node.leftChild);
		}		
		
		if(node.rightChild != null){
			preOrderTraversal(node.rightChild);
		}
	}
	
	private void inOrderTraversal(Node node){
		if(node.leftChild != null){
			inOrderTraversal(node.leftChild);
		}
		
		System.out.println(node.data);
		
		if(node.rightChild != null){
			inOrderTraversal(node.rightChild);
		}
	}

	private void postOrderTraversal(Node node){
		if(node.leftChild != null){
			inOrderTraversal(node.leftChild);
		}
				
		if(node.rightChild != null){
			inOrderTraversal(node.rightChild);
		}
		
		System.out.println(node.data);
	}
}