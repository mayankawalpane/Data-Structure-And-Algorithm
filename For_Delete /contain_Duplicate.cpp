#include <iostream>      
#include <vector>
#include <unordered_set>
using namespace std;   

bool isDuplicate(std::vector<int>& nums) {
    std::unordered_set<int> seen;
    for (int num : nums) {
        if (!seen.insert(num).second) {
            return true;
        }
    }
    return false;
}


int main() {             
    cout << "Hello!";    
    return 0;            
}
