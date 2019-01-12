vector<int> Solution::getRow(int A) {
    
    vector<int> ret;
    vector<int> temp;
    int i, j;
    ret.resize(1);
    ret[0] = 1;
    if(A>0)
        {
            ret.resize(2);
            ret[0] = 1;
            ret[1] = 1;
            
        }
    for(i=2; i<=A; i++) {
        temp.resize(i);
        j=0;
        // copy in temp vector
        while(j<i) {
            temp[j] = ret[j];
            j++;
        }
        ret.resize(i+1);
        ret[0] = 1;
        ret[i] = 1;
        for(j=1; j<i; j++) {
            ret[j] = temp[j] + temp[j-1];
        }
    }
    return ret;
}
