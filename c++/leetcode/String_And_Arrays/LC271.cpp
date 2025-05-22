#include <iostream>
#include <vector>

using namespace std;

// Encodes a list of strings to a single string.
string encode(vector<string> &strs)
{
    string res;
    for (const auto &s : strs)
    {
       res += "#";
        res += std::to_string(s.length());
        res += s;
     
    }
    return res;
}

// Decodes a single string to a list of strings.
vector<string> decode(string s)
{
    std::vector<std::string> res;
    int i = 0;
    int n = s.size();

    for (; i < n; )
    {
        if (s[i] == '#') {
            ++i;               
        }

        std::string cur;
        int len = s[i] - '0';  
        ++i;                    

      
        while (len-- > 0 && i < n) {
            cur += s[i++];
        }

        res.push_back(cur);
    }

    return res;
}

int main()
{

    vector<string> a = {"",""};
    vector<string> b;
    b = decode(encode(a));
    for(int i = 0;i<b.size();i++){
        cout << b[i]<< endl;
    }
    return 0;
}