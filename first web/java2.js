function display() {
   var wordRef = document.getElementById('word')
   var SubmitRef = document.getElementById('Submit')
   var textInfo = wordRef.type
   if(textInfo === 'password') {
    wordRef.type = "text"
    SubmitRef.innerHTML = "hide password"
   } else {
    wordRef.type = "password"
    SubmitRef.innerHTML = "show password"  
   }
}