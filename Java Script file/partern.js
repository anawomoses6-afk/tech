const prompt = require("prompt-sync")();
let number = Number(prompt("Enter number: "));
while(true){
if (Number.isNaN(number)) {
console.log("Enter a valid number");
    }else if (number > 50) {
    console.log("number is more than 50. try later");
    } else if (number <= 0) {
}else{
    for(let index = 1; index <= number; index++){ 
    if(index % 2 ==0){
    console.log(" # # # #")
    
    }else{
        console.log("# # # #")        
       }
       }
     
       
  }    
}



