package exams.quiz01.fall2017;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class Tree {
    
    private ArrayList<Node> tree = new ArrayList<Node>();

    public Tree() {
    }

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void setTree(ArrayList<Node> tree) {
        this.tree = tree;
    }

    public void add(Node n, int level){
        n.setLevel(level);
        tree.add(n);
    }
    
    public void remove(Node n){
        tree.remove(n);
    }
    
    public boolean contains(Node n){
        return tree.contains(n);
    }
    
    public boolean isChild(Node np, Node nc){
        if (nc.getLevel()==np.getLevel()+1){
            return true;
        }
        return false;
    }
    
    
}
