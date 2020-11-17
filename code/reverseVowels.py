class Solution:
    def reverseVowels(self, s: str) -> str:
        #print(self.swap(0,1,'23'))
        vowels='aeiouAEIOU'
        end=len(s)-1
        for i,c in enumerate(s):
            
            if c not in vowels:
                i+=1
            if s[end] not in vowels:
                end-=1

            if(c in vowels and s[end] in vowels and i<=end):
                print(i,end)
                print(c,s[end])
                # s= needed; assignment operation
                s=self.swap(i,end,s)
                #print(s)
                end-=1
                        
        return s
    
    def swap(self,i,j,s):
        s = list(s)
        #print(s)
        s[i], s[j] = s[j], s[i]
        print(s)
        print(''.join(s))
        return ''.join(s)
        
     
            
Input
"Egad! Loretta has Adams as mad as a hatter. Old age!"
stdout
0 50
E e
['e', 'g', 'a', 'd', '!', ' ', 'L', 'o', 'r', 'e', 't', 't', 'a', ' ', 'h', 'a', 's', ' ', 'A', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'a', ' ', 'h', 'a', 't', 't', 'e', 'r', '.', ' ', 'O', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! Loretta has Adams as mad as a hatter. Old agE!
2 48
a a
['e', 'g', 'a', 'd', '!', ' ', 'L', 'o', 'r', 'e', 't', 't', 'a', ' ', 'h', 'a', 's', ' ', 'A', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'a', ' ', 'h', 'a', 't', 't', 'e', 'r', '.', ' ', 'O', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! Loretta has Adams as mad as a hatter. Old agE!
7 44
o O
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'a', ' ', 'h', 'a', 's', ' ', 'A', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'a', ' ', 'h', 'a', 't', 't', 'e', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOretta has Adams as mad as a hatter. old agE!
12 40
a e
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'e', ' ', 'h', 'a', 's', ' ', 'A', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'a', ' ', 'h', 'a', 't', 't', 'a', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOrette has Adams as mad as a hattar. old agE!
15 37
a a
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'e', ' ', 'h', 'a', 's', ' ', 'A', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'a', ' ', 'h', 'a', 't', 't', 'a', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOrette has Adams as mad as a hattar. old agE!
18 34
A a
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'e', ' ', 'h', 'a', 's', ' ', 'a', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'A', ' ', 'h', 'a', 't', 't', 'a', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOrette has adams as mad as A hattar. old agE!
20 31
a a
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'e', ' ', 'h', 'a', 's', ' ', 'a', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'A', ' ', 'h', 'a', 't', 't', 'a', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOrette has adams as mad as A hattar. old agE!
24 28
a a
['e', 'g', 'a', 'd', '!', ' ', 'L', 'O', 'r', 'e', 't', 't', 'e', ' ', 'h', 'a', 's', ' ', 'a', 'd', 'a', 'm', 's', ' ', 'a', 's', ' ', 'm', 'a', 'd', ' ', 'a', 's', ' ', 'A', ' ', 'h', 'a', 't', 't', 'a', 'r', '.', ' ', 'o', 'l', 'd', ' ', 'a', 'g', 'E', '!']
egad! LOrette has adams as mad as A hattar. old agE!

Output
"egad! LOrette has adams as mad as A hattar. old agE!"
Expected
"egad! LOretta has adams as mad As a hatter. old agE!"        