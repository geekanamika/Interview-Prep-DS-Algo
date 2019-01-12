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

		void bfs(T src) {
			// adding source in queue of node T type
			queue<T> q;
			q.push(src);
			// create a map to track visited nodes
			map<T, bool> vis;
			vis[src] = true;
            
			// traverse till queue is not empty
			while(!q.empty()) {
				T temp = q.front();
				cout<<temp<<" ";
				q.pop();
				// for each un-visited neighbour node of temp, add in queue, mark them visited too
				for(auto neighbour: adjList[temp]) {
					if(!vis[neighbour]) {
						q.push(neighbour);
						vis[neighbour] = true;
					}
				}
			}
		}
};



int main() {
	Graph<int> g;
	g.addEdgeInList(1,2);
	g.addEdgeInList(0,1);
	g.addEdgeInList(0,4);
	g.addEdgeInList(2,4);
	g.addEdgeInList(2,3);
	g.addEdgeInList(3,5);
	g.addEdgeInList(3,4);
	g.printList();
	cout<<endl;
	g.bfs(0);
	return 0;
}