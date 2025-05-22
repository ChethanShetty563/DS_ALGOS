#include <iostream>
#include <algorithm>
#include <vector>
#include <unordered_map>
using namespace std;

vector<vector<string>> groupAnagrams(vector<string> &strs)
{
    unordered_map<string, vector<string>> res;

    vector<vector<string>> finalRes;

    for (string s : strs)
    {
        string temp = s;
        sort(temp.begin(), temp.end());
        if (res.count(temp) > 0)
        {
            res[temp].push_back(s);
        }
        else
        {
            vector<string> a;
            a.push_back(s);
            res[temp] = a;
        }
    }

    for (const auto &p : res)
    {
        finalRes.push_back(p.second);
    }

    return finalRes;
}

int main()
{
    std::vector<std::string> words = {
        "eat", "tea", "tan", "ate", "nat", "bat"};

    // 2) Call the grouping function
    auto groups = groupAnagrams(words);

    // 3) Print out each anagram group
    std::cout << "Anagram groups:\n";
    for (const auto &grp : groups)
    {
        std::cout << "[ ";
        for (const auto &w : grp)
        {
            std::cout << w << ' ';
        }
        std::cout << "]\n";
    }

    return 0;
}
