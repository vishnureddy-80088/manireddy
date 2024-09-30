class FibonacciExample2{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  


https://github.com/Cohesity2022/certified-kubernetes-administrator/tree/main/Cluster%20Setup

kubeadm join 192.168.211.255:6443 --token g3qtxf.atjnqiqqfqat66q0 \ --discovery-token-ca-cert-hash sha256:6053682078c3f65735a341c81c11ab533fc28795f2cec3a8c9152fd6c8288485
7guayc.z8cqungwk2wv1qai
