class Three{
public static void main(String args[]){
int p=2000,t=5,n=12;
double r=.08;

double amount=p*Math.pow(1+(r/n),n*t);
double interest=amount-p;
System.out.println(interest);
}}