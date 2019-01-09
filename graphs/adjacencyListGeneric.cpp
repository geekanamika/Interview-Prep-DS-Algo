#include <iostream>
#include <map>
#include <list>
using namespace std;

// make generic class
template <typename T> 
class Graph {
    // variables
    map<T, list<T>> gr;
    public:
        void addEdgeInList(T u, T v, bool bidir= true) {
            gr[u].push_back(v);
            if(bidir)
                gr[v].push_back(u);
        }
        
        void printList() {
            // for each node/key of hasmap
            for(auto i: gr) {
                // print key
                cout<<i.first<<"-> ";
                // print it's list of type T
                for(auto v: i.second) {
                    cout<<v<<", ";
                }
                cout<<endl;
            }
        }
};


int main() {
	Graph<string> g;
	g.addEdgeInList("putin", "trumph", false);
	g.addEdgeInList("putin", "modi", false);
	g.addEdgeInList("putin", "pope", false);
	g.addEdgeInList("modi", "trumph");
	g.addEdgeInList("yogi", "prabhu", false);
	g.addEdgeInList("prabhu", "modi", false);
	g.addEdgeInList("modi", "yogi");
	g.printList();
	return 0;
}