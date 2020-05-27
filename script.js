
    var add, sub,mul,div =false
    function v(character) {
        switch(character){
            case"+":
            add=true
            sub,mul,div=false
            break;
            case"-":
            sub=true
            div, add,mul=false
            break;
            case"*":
            mul=true
            div, add,sub=false
            break;
            case"/":
            div=true
            sub, add,mul=false
            break;
            default:
                break;

        }
        var currentValueOfInputField=document.getElementById("mainbox").value 
        currentValueOfInputField+=character
        document.getElementById("mainbox").value=currentValueOfInputField
        
    }
    function calculate(){
        var expression=document.getElementById("mainbox").value 
            if (add==true) {
          var indexOfPlus=expression.indexOf('+')
          var indexOfString=expression.length
          var op1=parseInt(expression.substring(0,indexOfPlus))
          var op2=parseInt(expression.substring(indexOfPlus+1,indexOfString))
          var sum=op1+op2
          document.getElementById("mainbox").value =sum      

            
        }
        else if (sub==true){
            var indexOfSub=expression.indexOf('-')
            var indexOfString=expression.length
            var op1=parseInt(expression.substring(0,indexOfSub))
            var op2=parseInt(expression.substring(indexOfSub+1,indexOfString))
            var subtract=op1-op2
            document.getElementById("mainbox").value =subtract     
  

        }
        else if (mul==true){
            var indexOfMul=expression.indexOf('*')
            var indexOfString=expression.length
            var op1=parseInt(expression.substring(0,indexOfMul))
            var op2=parseInt(expression.substring(indexOfMul+1,indexOfString))
            var multiplication=op1*op2
            document.getElementById("mainbox").value =multiplication   
  
        } else{
            var indexOfDiv=expression.indexOf('/')
            var indexOfString=expression.length
            var op1=parseInt(expression.substring(0,indexOfDiv))
            var op2=parseInt(expression.substring(indexOfDiv+1,indexOfString))
            var division=op1/op2
            document.getElementById("mainbox").value =division   
  
        }
       add,sub,mul,div=false 
    }
