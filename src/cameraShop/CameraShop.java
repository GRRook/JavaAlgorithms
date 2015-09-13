package cameraShop;

public class CameraShop {

	public static void main(String[] args) {
		Node resultNode;
		boolean success;
		
		BinaryTree tree = new BinaryTree();
		
		tree.add(50, "TestData50");
		tree.add(25, "TestData25");
		tree.add(75, "TestData75");
		tree.add(10, "TestData10");
		tree.add(30, "TestData30");
		tree.add(60, "TestData60");
		tree.add(65, "TestData65");
		tree.add(80, "TestData80");
		tree.add(85, "TestData85");
		tree.add(1, "TestData1");
		tree.add(100, "TestData100");
		
		resultNode = tree.find(30);
		System.out.println(resultNode.key + ": " + resultNode.data);
		success = tree.delete(75);
		System.out.println("Result of delete is " + success);
		tree.traverse();
	}

}
