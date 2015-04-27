#jadencase.py
def toJadenCase(string):
    array = string.split(" ")
    return " ".join(x[0].upper() + x[1:] for x in array)