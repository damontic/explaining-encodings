def print_in_various_formats(letra) = {
	val bytes_de_letra = letra.getBytes()
	println("As UTF-8:\t\t" + new String(letra, "utf-8"))
	println("As cp1252:\t\t" + new String(letra, "cp1252"))
	println("As windows-1252:\t" + new String(letra, "windows-1252"))
	println("As ISO-8859-2:\t\t" + new String(letra, "ISO-8859-2"))
}


val u = "ú"
