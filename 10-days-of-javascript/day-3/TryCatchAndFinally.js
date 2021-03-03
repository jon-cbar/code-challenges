function reverseString(s) {
    let result = "";
    try {
        result = ((s.split("")).reverse()).join("");
    } catch (exception) {
        console.log(exception.message)
        result = s;
    } finally {
        console.log(result);
    }
}