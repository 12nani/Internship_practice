class InvalidExpressionException extends Exception{
  InvalidExpressionException(String str){
    super(str);
  }
}
class Calculator{
  char op;int result,a=10,b=5;
  void add(char op) throws InvalidExpressionException{
    if(op=='+'){
      result=a+b;
      System.out.println("after adding the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  void sub(char op) throws InvalidExpressionException{
    if(op=='-'){
      result=a-b;
      System.out.println("after substracting the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  void mul(char op) throws InvalidExpressionException{
    if(op=='*'){
      result=a*b;
      System.out.println("after multiplying the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  void div(char op) throws InvalidExpressionException{
    if(op=='/'){
      result=a/b;
      System.out.println("after dividing the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
}
class Calculatormain{
  public static void main(String args[]){
    Calculator operator=new Calculator();
    try{
      operator.add('+');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    try{
      operator.sub('-');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    try{
      operator.mul('*');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    try{
      operator.div('/');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
  }
}