#revserse recursive without out
def reverse_recursive_without_out(secuence):
	lenght_sec = len(secuence)
	if secuence == '':
		return ''
	else:
		secuence = secuence[lenght_sec-1] + reverse_recursive_without_out(secuence[:lenght_sec-1])
		return secuence 

print reverse_recursive_without_out('abs')
print reverse_recursive_without_out('abc defg hijk')