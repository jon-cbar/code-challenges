function vowelsAndConsonants(s) {
    const letters = s.split('');
    let consonants = [];
    letters.forEach(char => {
        switch (char) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                console.log(char);
                break;
            default:
                consonants.push(char);
                break;
        }
    });
    consonants.forEach(consonant => {
        console.log(consonant);
    });
}
