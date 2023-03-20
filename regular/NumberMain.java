class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
}
class CheckMobileNumber{
  void validateMobileNumber(String number) throws InvalidMobileNumberException{
    if(number.length()==10){
      System.out.println("valid mobile number");
    }
    else{
      throw new InvalidMobileNumberException("Invalid Mobile Number");
    }
  }
}
class NumberMain{
  public static void main(String args[]){
    CheckMobileNumber num=new CheckMobileNumber();
    try{
      num.validateMobileNumber("92857485");
    }
    catch(InvalidMobileNumberException e){
      System.out.println(e);
    }
  }
}
