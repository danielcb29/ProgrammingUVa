#revserse without out
def reverse_without_out(secuence):
	lenght_sec = len(secuence)
	while lenght_sec > 0:
		secuence += secuence[lenght_sec-1]
		lenght_sec -= 1
	secuence = secuence[(len(secuence)/2):len(secuence)] #Delete de old secuence, only need de reverse secuence
	print secuence

reverse_without_out('abs')
reverse_without_out('abc defg hijk')