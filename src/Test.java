public class Test {
	static{
		print(10);
		}
		static void print (int x) {
		System.out.println (x);
		System.exit(0);
		}
}
/*correct option is c:
 It will compile and run printing out "10“
  
 explanation:
 in jdk 1.6,it will run,print a message and terminate.the run time system needs to load the class
 before it can look for main method 'so the static initializer will run first and print "10".
 after that System.exit(0) will be called terminating the program before an error can be thrown
 
 in jdk 1.7 or above it will throw "main method not found please write public static void main(String args[])
 to get the output"
 
 after 1.7 version of jdk some changes are made in java language as it needs main method to run
*/