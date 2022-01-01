class Solution:
    def isPalindrome(self, x: int) -> bool:
        t=x
        print(t)
        rev=0
        while t!=0:
            rev=rev*10+int(t%10)
            print(rev)
            t=int(t/10)
            print(f"t={t}")
        print(rev)
        if(x==rev):
            return True
        return False
        