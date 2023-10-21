function appendToDisplay(value){
        document.getElementById("display").value+=value;
}
function clearDisplay(value){
    document.getElementById("display").value =" ";
}

function calculateResult(value){
    try{
        const ans=eval(document.getElementById("display").value);
        document.getElementById("display").value=ans;
    }
    catch(error){
        document.getElementById("display").value=error;
    }

}