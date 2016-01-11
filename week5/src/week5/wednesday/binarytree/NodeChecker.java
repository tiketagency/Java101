package week5.wednesday.binarytree;

import week5.wednesday.binarytree.BinaryTree.Node;

public class NodeChecker {

	public NodeChecker() {
	}

	public boolean isLeaf(Node node) {
		return node.right == null && node.left == null;
	}

	public boolean hasRightNode(Node node) {
		return node.right != null;
	}

	public boolean hasLeftNode(Node node) {
		return node.left != null;
	}
}
