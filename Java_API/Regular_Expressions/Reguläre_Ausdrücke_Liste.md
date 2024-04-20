Anker:
    ^: Beginnt mit
    $: Endet mit
    \b: Wortgrenze
    \B: Keine Wortgrenze

Quantifizierer:
    *: Null oder mehr Vorkommen
    +: Ein oder mehr Vorkommen
    ?: Null oder ein Vorkommen
    {n}: Genau n Vorkommen
    {n,}: Mindestens n Vorkommen
    {n,m}: Mindestens n und höchstens m Vorkommen

Zeichenklassen:
    \d: Ziffer (entspricht [0-9])
    \D: Nicht-Ziffer
    \w: Wortzeichen (Buchstaben, Ziffern oder Unterstrich)
    \W: Nicht-Wortzeichen
    \s: Leerzeichen (Leerzeichen, Tabulator, Zeilenumbruch)
    \S: Nicht-Leerzeichen

Alternativen und Gruppierungen:
    |: Oder
    (): Gruppierung und Erfassung

Escapezeichen:
    .: Jedes Zeichen außer Zeilenumbruch
    \: Escapezeichen für Sonderzeichen

Zeichenklassen:
    [...]: Zeichenklasse (z.B. [aeiou] entspricht einem Vokal)
    [^...]: Negierte Zeichenklasse (z.B. [^0-9] entspricht allem außer Ziffern)