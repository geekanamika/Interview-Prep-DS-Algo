#include <iostream>
#include <utility> 
#include<algorithm>
using namespace std;

bool myComparator(pair<string, int> emp1, pair<string,int> emp2) {
    if(emp1.second == emp2.second)
        return emp1.first < emp2.first;
    
    return emp1.second > emp2.second;
}

int main() {
	pair<string, int> emp[10];
	int n;
	cin>>n;
	cin.ignore(255, '\n');
	string name;
	int salary;
	for(int i=0; i<n; i++) {
	    cin>>name;
	    cin>>salary;
	    emp[i].first = name;
	    emp[i].second = salary;
	    //cin.ignore(255, '\n');
	}
	sort(emp, emp+n, myComparator);
	
	for(int i=0; i<n; i++) {
	    cout<<emp[i].first<<" "<<emp[i].second<<endl;
	}
	return 0;
	
}