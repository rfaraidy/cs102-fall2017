/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.quiz01.fall2017;


/**
 *
 * @author akoubaa
 */
public class Node {
    
    private String id;
    private int level;

    public Node(String id, int level) {
        setId(id);
        setLevel(level);
    }
    public Node(String id) {
        this(id, -1);
    }
    public Node (Node n){
        this(n.getId(), n.getLevel());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Node{" + "id=" + id + ", level=" + level + '}';
    } 
}
