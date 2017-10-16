package exams.quiz01.fall2017;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akoubaa
 */
public class TreeTest {
    public static void main(String []args){
        
        Tree tree = new Tree ();
        
        tree.add(new Node("N0"), 0);
        tree.add(new Node("N1"), 1);
        tree.add(new Node("N2"), 1);
        tree.add(new Node("N3"), 2);
        tree.add(new Node("N4"), 2);
        tree.add(new Node("N5"), 2);
        tree.add(new Node("N6"), 2);
        tree.add(new Node("N7"), 2);
        
        for (Node n: tree.getTree()){
            System.out.println(n);
        }
        
        File file = new File("tree.txt");
        try {
            FileWriter fw = new FileWriter(file);
            for (Node n: tree.getTree()){
            fw.write(n+"\n");
            
        }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(TreeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        tree.getTree().get(5).setLevel(1);
        
        
        System.out.println("\nChildren of the root");
        for (Node n: tree.getTree()){
            if (n.getLevel()==1)
            System.out.println(n);
        }
    }   
}
