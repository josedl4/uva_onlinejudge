import sys

def bigMod(b, p, m):
    if(p == 0): return 1

    if(p % 2 == 1):
        part1 = b % m
        part2 = bigMod(b, p - 1, m)
        return (part1 * part2) % m
    
    else:
        half = bigMod(b, p/2, m)
        return (half * half) % m

text = input()
while (text != ""):
    b = int(text)
    text = input()
    p = int(text)
    text = input()
    m = int(text)
    try:
        text = input()
    except:
        text = ""
    result = bigMod(b, p, m)
    print(result) 