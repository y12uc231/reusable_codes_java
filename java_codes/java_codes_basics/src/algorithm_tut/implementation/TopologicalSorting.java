package algorithm_tut.implementation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class Edge {
    int x;
    List<Integer> neighbors;

    Edge(int x) {
        this.x = x;
        this.neighbors = new ArrayList<>();
    }

    void addEdge(int y) {
        this.neighbors.add(y);
    }

}


public class TopologicalSorting {

    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        // Push current vertex to stack
// which stores result
        stack.push(Integer.valueOf(v));
    }

    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();

        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper
// function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        // Print contents of stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }


//    public List<Integer> topologicalSorting(List<Edge> graph) {
//        /**
//         * 1. Find node with no out
//         */
//
//        List<Integer>  result = new ArrayList<>();
//        for (int i = 0 ;i < graph.size() ;i++) {
//
//         }
//
//
//        return result;
//    }


    // My Code  : https://leetcode.com/problems/alien-dictionary/

    public boolean topologyRecurse(Stack<Character> stackChar, boolean[] seen, boolean[] visited, HashMap<Character, List<Character>> edges, Character source) {
        for (int j = 0 ; j < edges.get(source).size(); j++) {
            if (seen[edges.get(source).get(j) - 'a'] == false && visited[edges.get(source).get(j) - 'a'] == false) {
                seen[edges.get(source).get(j) - 'a'] = true;
                boolean isCycle = topologyRecurse(stackChar, seen, visited, edges, edges.get(source).get(j));
                if (isCycle) return true;
            } else if (seen[edges.get(source).get(j) - 'a'] == false && visited[edges.get(source).get(j) - 'a'] != false) {
                return true;
            }
        }
        stackChar.push(source);
        visited[source-'a'] = true;
        return false;
    }

    public Stack<Character> topologySorting(HashMap<Character,List<Character>> edges) {
        Stack<Character> stackChar = new Stack<>();
        boolean[] visited = new boolean[26];
        boolean[] seen = new boolean[26];
        for(char i : edges.keySet()) {
            if (visited[i-'a'] == false) {
                seen[i-'a'] = true;
                boolean isCycle = topologyRecurse(stackChar, seen, visited, edges, i);
                if (isCycle == true) return null;
            }
        }
        return stackChar;
    }


}
