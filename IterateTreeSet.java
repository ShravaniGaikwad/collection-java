
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class IterateTreeSet {
     public static void main(String[] args) {
  TreeSet<String> treeset = new TreeSet<String>();
  treeset.add("Red");
  treeset.add("Green");
  treeset.add("Orange");
  treeset.add("White");
  treeset.add("Black");
  for (String element : treeset) {
    System.out.println(element);
    }
 }
}
