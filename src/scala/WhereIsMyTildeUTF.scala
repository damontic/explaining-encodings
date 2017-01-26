def print_bytes(some_bytes : Array[Byte]) = {
	some_bytes foreach {
		x => print(x toHexString)
		print(" ")
	}
	println
}

def print_in_various_formats(letter : String) : Unit = {
	val letter_bytes = letter.getBytes()
	print_bytes(letter_bytes)

	val u = new String(letter_bytes, "utf-8")
	println("As UTF-8:\t\t" + u)
	print_bytes(u.getBytes)

	val c = new String(letter_bytes, "cp1252")
	println("As cp1252:\t\t" + c)
	print_bytes(c.getBytes)

	val i = new String(letter_bytes, "ISO-8859-2")
	println("As ISO-8859-2:\t\t" + i)
	print_bytes(i.getBytes)
	println
}

List("á","Á", "é", "É", "í", "Í", "ó", "Ó", "ú", "Ú", "ñ", "Ñ") map print_in_various_formats
