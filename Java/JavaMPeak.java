/*
Kevin Nguyen
Basic Java program

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaMPeak"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaMPeak {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		int[] = {1,2,3,4,5,6,3,2,1,5};
	}

	//peakIndexInMountainArray will output the peak which is the ith index
	public int peakIndexInMountainArray(int[] A) {
        //local declarations
        int i = 0, length = A.length, result = 0;
        
        //iterate over all items
        while(i < length) {
            if((i > 0) && (A[i-1] < A[i]) && (A[i] > A[i+1])) {
                result = i;
            }
            i++;
        }
        
        return result;
    }	
}