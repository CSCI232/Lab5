package edu.montana.csci;

/**
 *
 * @author barrionuevo
 */
import java.util.ArrayList;

public class Graph {
    protected ArrayList<Vertex> vertices = new ArrayList<>();
    private ArrayList<Edge> edges = new ArrayList<>();
    
    public void addVertex(Vertex v) {
        this.vertices.add(v);        
    }
    
    public void addEdge(Edge e) {
        this.edges.add(e);
    }
    
    public void removeEdge(Edge e){
    	this.edges.remove(e);
    }
    
    public void removeVertex(Vertex v){
     	this.vertices.remove(v);
    }
    
    public ArrayList<Vertex> getVertices() {
        return this.vertices;        
    }
    
    public ArrayList<Edge> getEdges() {
        return this.edges;
    }
    
    public void clearEdges() {
    	edges.clear();
    }
}
