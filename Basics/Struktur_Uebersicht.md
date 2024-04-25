
    => [ <Rückgabewert>] == eckige Klammern bedeutet OPTIONAL

# kontroll-strukturen für den programmfluss

## if (if-else) statement - struktur

if ( <boolescher Ausdruck> ) {
    
    <ausdrücke> ;

} else if ( <boolescher Ausdruck> ) {
    <ausdrücke> 

} else {
    <ausdrücke> ;
}

## while-schleife

while (<boolescher ausdruck>) {

    <ausdrücke> ;
}
## do-while schleife

do {
    
    <ausdrücke> ;

} while (<boolescher ausdruck>) ;

## for-schleife

for (<datentyp> <bezeichner> = <wertA> ; <wertA> <operator> <wert> ; <inkrementor>) {

    < ausdrücke > ;
}

## for-each schleife

for (<datentyp> <bezeichner> : <iterable-objekt>) {

    < ausdrücke > ;
}

# Methoden

<zugriffsmodifier> [<static>] <Rückgabetyp> <Bezeichner> ([<Parameter>]) {

    <Ausdrücke> ;

    return [<Rückgabewert>] ;
}

# Ternärer Operator

<Datentyp> <Bezeichner> = (<boolsche Bedingung>) ? <Wert || Methode> : <Wert || Methode>

