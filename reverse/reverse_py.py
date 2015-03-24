#reverse_py.py
def reverse(secuence):
	length_sec = len(secuence)
	out =""
	while length_sec > 0:
		out += secuence[length_sec-1]
		length_sec -= 1
	print out

reverse('abc def ghi')
