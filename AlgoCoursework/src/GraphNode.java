/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raveen
 */
public class GraphNode {
    
    // this is to store the x coordinate of the node.
    private int xValue;
    
    // this is to store the y coordinatate of the node.
    private int yValue;
    
    // this is to store the a star cost or the f cost of this node.
    private double fCost;
    
    // this is to store the g cost of this node.
    private double gCost;
    
    // this is to store the hcost or the heuristic cost of this node.
    private double hCost;
    
    // this is to store the node in which this node is connected to.
    GraphNode parent;
    
    // overloading the contructor to set the x coordinate and the y coordinate when creating a node.
    public GraphNode(int xValue, int yValue){
        this.xValue = xValue;
        this.yValue = yValue;
    }
    
    // overloading the constructor to set x, y, hCost, gCost and fCost of a node when creating it.
    public GraphNode(int xValue, int yValue, double hCost, double gCost, double fCost){
        
        this.xValue = xValue;
        this.gCost = gCost;
        this.yValue = yValue;
        this.hCost = hCost;
        this.fCost = fCost;
    }

    
    public int getxValue() {
        return xValue;
    }

    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public void setyValue(int yValue) {
        this.yValue = yValue;
    }

    public double getfCost() {
        return fCost;
    }

    public void setfCost(double fCost) {
        this.fCost = fCost;
    }

    public double getgCost() {
        return gCost;
    }

    public void setgCost(double gCost) {
        this.gCost = gCost;
    }

    public double gethCost() {
        return hCost;
    }

    public void sethCost(double hCost) {
        this.hCost = hCost;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }
}
