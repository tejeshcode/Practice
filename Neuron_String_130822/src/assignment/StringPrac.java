package assignment;

import java.util.Arrays;

public class StringPrac {

static void getReverse(String str) {

int len=str.length();
for(int i=len-1;i>=0;i--) {
System.out.print(str.charAt(i));

}
}

static void getReverse1(String str) {

String[] str1=str.split(" ");
for(int i=0;i<str1.length;i++) {
getReverse(str1[i]);
System.out.print(" ");
}
}

static void getAnagram(String str1,String str2) {
	
boolean status=true;
if(str1.length()!=str2.length()) {
System.out.println(str1+" and "+str2+" length are not same");

}else {
for(int i=0;i<str1.length();i++) {
if(str2.indexOf(str1.charAt(i))==-1){
System.out.println(str1+" and "+str2+" are not an Anagram");
status=false;
break;
}

}
if(status) {
System.out.println(str1+" and "+str2+" are  an Anagram");
}

}

}

static void getMulChar(String str) {

for(int i=0;i<str.length();i++) {
int count=str.lastIndexOf(str.charAt(i))-str.indexOf(str.charAt(i));;
if(count>0)
System.out.print(str.charAt(i)+",");
}
System.out.println("");
}

static void getVowCons(String str) {
	int vcount=0,ccount=0;
	String ldata=str.toLowerCase();
	for(int i=0;i<ldata.length();i++) {
		char ch=ldata.charAt(i);
		
		if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') {
		
			vcount++;
		
		}else {
			
			ccount++;
		
			}}
	System.out.println("Number of vowels are "+vcount+" Number of constants are "+ccount);
}

static void getSpChar(String str) {
	int count=0;
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		int Asciival=(int)ch;
		if((Asciival>=32 && Asciival <=47)||(Asciival>=58 && Asciival <=64)
				   ||(Asciival>=91 && Asciival <=96)||(Asciival>=123 && Asciival <=126)  ) {
		
			count++;
		
		}}
	System.out.println("Number of special character are "+count);
}

static void sortString(String str,int methodtype) {
	
	int size=str.length();
	char[] arr=str.toCharArray();
	
	if(methodtype==1) {
		
	Arrays.sort(arr);
		
	}else {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	   	}
		}
	String str1=new String(arr);
	System.out.println(str1.toString());
}

static void getpangram(String str) {
	
	
	char[] arr=(str.toLowerCase()).toCharArray();
	Arrays.sort(arr);
	
	String compstr="";
	for(int i=0;i<arr.length;i++) {
		if(compstr.indexOf(arr[i])==-1) {
			compstr=compstr+arr[i];
		}
	}
	
	char[] sortedarr=compstr.toCharArray();
	
	
	boolean flag=true;
	int initialnum=97,count=0;
	
	for(int i=0;i<sortedarr.length;i++) {
		
		
		
		if(((int)sortedarr[i]>=65 && (int)sortedarr[i]<=90)||((int)sortedarr[i]>=97 && (int)sortedarr[i]<=122)) {
		if((int)sortedarr[i]==initialnum) {
			
			count++;
			flag=true;
			
		}else{
		
			flag=false;
		}
		initialnum++;
		}
		
		
		
		
	}
	
	if(flag) {
		System.out.println("Given string is pangram ");
	}else {
		System.out.println("Given string is not pangram ");
	}
}

public static void main(String[] args) {

getReverse("iNeuron"); //assignment que1
System.out.println("");
getReverse1("Think Twice"); //assignment que2
System.out.println("");
getAnagram("race","earc");//assignment que3
getpangram("The quick brown fox jumps over the lazy dog");//assignment que4
getMulChar("raaaccee");//assignment que5
sortString("iNeuron",1);//assignment que 6 using array sort method
sortString("iNeuron",2);//assignment que 6 using array sort method
getVowCons("abcdefghijklmnopqrstuvwxyz"); //assignment que7
getSpChar("ab_c&%"); //assignment que8

}

}