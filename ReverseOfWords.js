function reverse(string){
    var word=string.split(' ');
    var reverse=word.map(function(word){
        return word.split('').reverse().join('');
    });
    var reverseWord=reverse.join(' ');
    return reverseWord;
    }
    var string="It's very nice to meet you";
    var reversedString=reverse(string);
    console.log(reversedString);
