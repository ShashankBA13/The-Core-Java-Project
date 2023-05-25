package org.java.compressionalgorithm;

public class HuffmanNode implements Comparable<HuffmanNode> {

    byte data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(byte data, int frequency, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}