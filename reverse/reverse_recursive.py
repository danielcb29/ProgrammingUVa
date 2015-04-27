#revserse recursive
def reverse_recursive(secuence):
	lenght_sec = len(secuence)
	if secuence == '':
		return ''
	else:
		out = secuence[lenght_sec-1] + reverse_recursive(secuence[:lenght_sec-1])
		return out 

print reverse_recursive('abs')
print reverse_recursive('abc defg hijk')