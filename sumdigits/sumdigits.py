#sumdig
def sumDigits(number):
    numst = str(number)
    result = 0
    for dig in numst:
        if dig == '-':
            pass
        else:
            result += int(dig)
    return result

def sumDigits2(number):
    return sum(int(d) for d in str(abs(number)))