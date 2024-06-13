package _02_02;
class Ticket{
  private String destination;
  private double price;
  private boolean isReturn;

  public Ticket(){

  }
  
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }
  public String getDestination(){
    return destination;
  }
  public double getPrice(){
    return price;
  }
  public boolean getIsReturn(){
    return isReturn;
  }
  
}