package com.arrays;

class CustomArray {
	private int[] ar;
	private int size;

	CustomArray(int size) {
		this.size = size;
		ar = new int[size];

	}

	private boolean isValidIndex(int indexPosition) {
		boolean flag = true;
		if (indexPosition < 0 || indexPosition >= this.size) {
			flag = false;
		}
		return flag;
	}

	public void insertElement(int indexPosition, int ele) {
		if (!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
			return;
		} else if (this.ar[indexPosition] != 0) {
			System.out.println("position is not empty");
			return;
		}
		this.ar[indexPosition] = ele;
		System.out.println("element added at the indexPosition" + indexPosition);
	}

	public void readArray() {
		System.out.print("[");
		for (int i = 0; i < this.ar.length; i++) {
			System.out.print(this.ar[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}

	public void readElementAtGivenIndex(int indexPosition) {
		if (!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
			return;
		} else if (this.ar[indexPosition] == 0) {
			System.out.println("no element found at indexPosition" + indexPosition);
			return;
		}
		System.out.println("elemnt present at indexosition:" + indexPosition + " = " + this.ar[indexPosition]);
	}

	public void updateArray(int indexPosition, int updateElement) {
		if (!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
			return;

		} else if (this.ar[indexPosition] == 0) {
			System.out.println("cant perform updation");
			return;
		}

		this.ar[indexPosition] = updateElement;
	}

	public void deleteArray(int indexPosition) {
		if (!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
		} else if (this.ar[indexPosition] == 0) {
			System.out.println("cant prform deletion");
			return;
		}
		this.ar[indexPosition] = 0;
	}

}

public class test1 {

	public static void main(String[] args) {
		CustomArray obj = new CustomArray(5);
		obj.readArray();
		obj.insertElement(2, 10);
		// obj.readArray();
		obj.readElementAtGivenIndex(2);

		obj.deleteArray(2);
		obj.readElementAtGivenIndex(2);

	}

}