package array.frequency;

public class HighestFrequency {

	public static void main(String[] args){
		int[] a={8, 6, 8, 5, 5, 8, 5,5,5,5,5,5,6, 10, 8, 8, 7};
		int element=getHighestFrequencyElement(a);	
		System.out.println("Highest Frequency Elelment is: "+element);	
	}
	public static int getHighestFrequencyElement(int[] a){
		int min=a[0], max=a[0];
		for(int x:a){
			if(x>max)
				max=x;
			else if(x<min)
				min=x;
		}
		int[] freq=new int[max-min+1];
		for(int i=0;i<a.length;i++){
			freq[a[i]-min]++;
		}
		int element=a[0], maxFrequency=1;
		
		for(int i=0;i<freq.length;i++){
			if(freq[i]>maxFrequency){
				maxFrequency=freq[i];
				element=i+min;
			}
		}
	return element;
	}		
}







