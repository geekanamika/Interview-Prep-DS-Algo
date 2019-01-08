/**
Pascal Triangle
Asked in:  
Google
Amazon
Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]

*/

vector<vector<int> > Solution::solve(int A) {
    vector<vector<int>> ret;
    int i, j;
    ret.resize(A);
    for(i=0; i<A; i++) {
        ret[i].resize(i+1);
        ret[i][0] = 1;
        ret[i][i] = 1;
        if(i>1) {
            // generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
            for(int j=1; j<i; j++) {
                ret[i][j] = ret[i-1][j] + ret[i-1][j-1];
            }
        }
    }
    return ret;
}
