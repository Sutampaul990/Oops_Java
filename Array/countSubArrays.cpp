#include<bits/stdc++.h>
using namespace std;

int count(vector<int> &arr,int k){
    unordered_map<int,int> mpp;
    int presum = 0,cnt = 0;
    mpp[0] = 1;
    for(int i=0;i<arr.size();i++){
        presum += arr[i];
        int remove = presum - k;
        cnt += mpp[remove];
        mpp[presum] = 1;
    }
    return cnt;
}

int main(){
    vector<int> arr = {1,2,3,-3,1,1,1,4,2,-3};
    int k =3;
    cout<<"Count of all subarrays : "<<count(arr,k)<<endl;
    return 0;
}