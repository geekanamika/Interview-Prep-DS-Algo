/**

Output
0-> 1, 4, 
1-> 2, 
2-> 4, 3, 
3-> 5, 4, 

0 1 4 2 3 5 
*/

#include <iostream>
#include <map>
#include<limits.h>
#include <list>
#include <queue>
using namespace std;

template<typename T>
class Graph {
	map<T, list<T>> adjList;
	public:
		void addEdgeInList(T u, T v, bool dir = false) {
			adjList[u].push_back(v);
			if(dir)
				adjList[v].push_back(u);
		}

		void printList() {
			for (auto l : adjList) {
				cout<<l.first<<"-> ";
				for(T n : l.second) {
					cout<<n<<", ";
				}
				cout<<endl;
			}
			
		}

		void singleSourceShortestPath(T src) {
			// adding source in queue of node T type
			queue<T> q;
			// create a map to track distance from source
			map<T, int > dis;
			map<T, T > parent;
			// all distance as INT_MAX initially
			for(auto n: adjList) {
				dis[n.first] = INT_MAX;
			}
			q.push(src);
			dis[src] = 0;
			parent[src] = 0;
            
			// traverse till queue is not empty
			while(!q.empty()) {
				T temp = q.front();
				//cout<<temp<<" ";
				q.pop();
				// for each un-visited neighbour node of temp, 
				// add in queue, mark them visited too
				for(auto neighbour: adjList[temp]) {
					if(dis[neighbour]== INT_MAX) {
						q.push(neighbour);
						dis[neighbour] = dis[temp] + 1;
						parent[neighbour] = temp;
					}
				}
			}
			cout<<"node\tparent\tdistance"<<endl;
			// print all distance & it's parent from source node 0
			for(auto n: adjList) {
			    // get key as node
			    T node = n.first;
				cout<<node<<"\t"<<parent[node]<<"\t"<<dis[node]<<endl;
			}
		}
};



int main() {
	Graph<int> g;
	g.addEdgeInList(0,1);
	g.addEdgeInList(1,2);
	g.addEdgeInList(0,4);
	g.addEdgeInList(2,4);
	g.addEdgeInList(2,3);
	g.addEdgeInList(3,5);
	g.addEdgeInList(3,4);
	g.printList();
	cout<<endl;
	g.singleSourceShortestPath(0);
	cout<<endl;
	return 0;
}