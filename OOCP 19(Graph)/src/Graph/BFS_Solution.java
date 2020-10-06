package Graph;
import java.util.*;

class Graph
{
	private static LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graph(int v)
	{
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public void BFS(int source)
	{
		// BFS uses more memory for its Queue operation whereas DFS uses memory in linear fashion. It is more efficient
		boolean visited[] = new boolean[adj.length];
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		
		q.add(source);
		visited[source] = true;
		
		while(!q.isEmpty())
		{
			int top = q.peek();
			System.out.println("Visited : "+top);
			q.poll();
			
			for(int i=0;i<adj[top].size();i++)
			{
				int neighbour = adj[top].get(i);
				if(visited[neighbour]==false)
				{
					visited[neighbour] = true;
					q.add(neighbour);
				}
			}
		}
	}
	public int BFS(int source, int destination)
	{
		boolean visited[] = new boolean[adj.length];
		
		int parent[] = new int[adj.length];
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		
		q.add(source);
		visited[source] = true;
		parent[source] = -1;
		
		while(!q.isEmpty())
		{
			int top = q.peek();
			if(top==destination)
			{
				break;
			}
			q.poll();
//			for(int i=0;i<adj[source].size();i++)
//			{
//				int neighbour = adj[source].get(i);
//				if(visited[neighbour]==false)
//				{
//					visited[neighbour] = true;
//					q.add(neighbour);
//					parent[neighbour] = top;
//				}
//			}
			for(int neighbour: adj[top])
			{
				if(!visited[neighbour])
				{
					visited[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = top;
				}
			}
		}
		int distance = 0;
		int current = destination;
		
		while(parent[current]!=-1)
		{
			System.out.print(current+" -> ");
			current = parent[current];
			distance++;
		}
		System.out.println(current);
		return distance;
	}
}

public class BFS_Solution {

	public static void main(String[] args) {
		
		// Graph -> Important Data Structure used in Competitive Programming and asked in Interviews
		// Here we will be suing adjacency list to implement Graph efficiently
		// Using array of LinkedList
		
		Scanner sc = new Scanner(System.in);
		
		int v,e;
		System.out.print("Enter the number of vertices : ");
		v = sc.nextInt();
		System.out.print("Enter the number of edges : ");
		e = sc.nextInt();
		
		Graph g = new Graph(v);
		
		System.out.println("Enter "+e+" edges :");
		
		for(int i=0;i<e;i++)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}
		int source, destination, choice = 0;
		
		System.out.println("Enter 1 for whole traversal of the graph.\nEnter 2 for traversing through source and destination of the graph.");
		choice = sc.nextInt();
		
		if(choice==1)
		{
			System.out.print("Enter the source for BFS Traversal : ");
			source = sc.nextInt();
			g.BFS(source);
		}
		else
		{
			System.out.print("Enter the source for BFS Traversal : ");
			source = sc.nextInt();
			System.out.print("Enter the destination for BFS Traversal : ");
			destination = sc.nextInt();
			
			int distance = g.BFS(source,destination);
			System.out.println("Minimum distance is "+distance);
		}
		sc.close();
	}
}
