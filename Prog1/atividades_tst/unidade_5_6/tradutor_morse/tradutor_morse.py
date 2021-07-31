def tradutor_morse(palavra):
	traducao = ''
	for c in range(len(palavra)):
		if palavra[c] == '.-':
			traducao += 'a'
		if palavra[c] == '-...':
			traducao += 'b'
		if palavra[c] == '-.-.':
			traducao += 'c'
		if palavra[c] == '-..':
			traducao += 'd'
		if palavra[c] == '.':
			traducao += 'e'
		if palavra[c] == '..-.':
			traducao += 'f'
		if palavra[c] == '--.':
			traducao += 'g'
		if palavra[c] == '....':
			traducao += 'h'
		if palavra[c] == '..':
			traducao += 'i'
		if palavra[c] == '.---':
			traducao += 'j'
		if palavra[c] == '-.-':
			traducao += 'k'
		if palavra[c] == '.-..':
			traducao += 'l'
		if palavra[c] == '--':
			traducao += 'm'
		if palavra[c] == '-.':
			traducao += 'n'
		if palavra[c] == '---':
			traducao += 'o'
		if palavra[c] == '.--.':
			traducao += 'p'
		if palavra[c] == '--.-':
			traducao += 'q'
		if palavra[c] == '.-.':
			traducao += 'r'
		if palavra[c] == '...':
			traducao += 's'
		if palavra[c] == '-':
			traducao += 't'
		if palavra[c] == '..-':
			traducao += 'u'
		if palavra[c] == '...-':
			traducao += 'v'
		if palavra[c] == '.--':
			traducao += 'w'
		if palavra[c] == '-..-':
			traducao += 'x'
		if palavra[c] == '-.--':
			traducao += 'y'
		if palavra[c] == '--..':
			traducao += 'z'
	return traducao
			
assert tradutor_morse(['.--.', '-.--', '-', '....', '---', '-.']) == 'python'	
