#include<iostream>
using namespace std;
int main() {
  char ch;
  int a, b;
  do {
    cin>>ch;
    cout.flush();
    switch(ch){
    default: "Invalid operation. Try again.";
                break;
      case 'X': exit(0);
      case 'x': exit(0);
      case '+': cin>>a>>b;
                cout<<a+b<<endl;
                break;
      case '-': cin>>a>>b;
                cout<<a-b<<endl;
                break;
      case '*': cin>>a>>b;
                cout<<a*b<<endl;
                break;
      case '/': cin>>a>>b;
                if(b!=0){
                  cout<<a/b<<endl;
                }
                break;
      case '%': cin>>a>>b;
                if(b!=0){
                  cout<<a%b<<endl;
                }
                break;
      
    }
  }	while(1);
}