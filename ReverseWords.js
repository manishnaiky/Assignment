function ReverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
const inputSentence = "Hello CloudVandana";
const reversed = reverseWordsInSentence(inputSentence);
console.log(reversed);