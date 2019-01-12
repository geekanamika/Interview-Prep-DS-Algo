#include <iostream>
#include<list>
using namespace std;

// create graph class
class graph{
    int v;
    list<int> *l;
    public:
        graph(int ver) {
            v = ver;
            // list of adjacency of v vertices of int type allocated dynamically
            l = new list<int> [v];
        }
        
        void addEdge(int u, int v, bool bidir = true) {
            // push edge from u->v
            l[u].push_back(v);
            // if bidir is true, it means it's bidirectional & push in vice-versa too
            if(bidir) {
                l[v].push_back(u);
            }
        }
        
        void printList() {
            // traverse through every list
            for(int i=0; i<v; i++) {
                // for ith list, print all it's adjacent nodes
                cout<<i<<"-> ";
                for(int ver: l[i]) {
                    cout<<ver<<", ";
                }
                cout<<endl;
            }
        }
};

int main() {
	// let's say graph has 5 nodes
	graph g(5);
	// nodes and edges
	g.addEdge(0,1);
	g.addEdge(0,4);
	g.addEdge(4,3);
	g.addEdge(1,2);
	g.addEdge(1,3);
	g.addEdge(3,2);
	g.printList();
	return 0;
}