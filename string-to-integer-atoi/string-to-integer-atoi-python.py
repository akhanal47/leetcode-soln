class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.replace('"','').strip()
        n = ''
        mul = 1
        if s!= '':
            if s[0] == '-':
                mul = -1
                s = s[1:]
            elif s[0] == '+':
                mul = 1
                s = s[1:]
            for i in range(0,len(s)):
                if s[i].isdigit():
                    n = n + str(s[i])
                else:
                    break
            if n == '':
                si = 0
            else:
                si = int(n)*mul
                if si < (-1*pow(2,31)):
                    si = -1*pow(2,31)
                elif si >= (pow(2,31)-1):
                    si = (pow(2,31)-1)
                else:
                    pass
            return si
        else:
            return (0)
