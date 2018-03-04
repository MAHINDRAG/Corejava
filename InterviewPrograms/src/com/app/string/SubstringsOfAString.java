package com.app.string;

public class SubstringsOfAString {
	public static void main(String[] args) {
	    String Tecnotree = "Tecnotree";
	    String tree = "tree";
	    char[] TecnotreeArray = Tecnotree.toCharArray();
	    char[] treeArray = tree.toCharArray();
	    System.out.println(isPresent(treeArray, TecnotreeArray));
	}

	public static boolean isPresent(char[] tree, char[] Tecnotree) {
		for (int i = 0; i < Tecnotree.length - tree.length+1; i++) {
	        for (int j = 0; j < tree.length; j++) {
	            if (Tecnotree[i + j] == tree[j]){
	                if (j == tree.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
	
	/*
	 * public static void main(String[] args) {
	    String Tecnotree = "Tecnotree";
	    String tree = "tree";
	    char[] TecnotreeArray = Tecnotree.toCharArray();
	    char[] treeArray = tree.toCharArray();
	    System.out.println(isPresent(treeArray, TecnotreeArray));
	}

	public static boolean isPresent(char[] tree, char[] Tecnotree) {
		for (int i = 0; i < Tecnotree.length - tree.length+1; i++) {
	        for (int j = 0; j < tree.length; j++) {
	            if (Tecnotree[i + j] == tree[j]){
	                if (j == tree.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
	 * 
	 */
}
