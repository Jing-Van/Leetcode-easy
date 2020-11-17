class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words=s.split()
        l=len(words)
        if l>0:
            for i,word in enumerate(words):
                if i==l-1:
                    return len(word)
        else:
            return 0