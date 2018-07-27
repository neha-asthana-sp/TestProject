/* Check if string follows order of characters defined by a pattern or not*/
public class String_follow {
	static int count = 0;
	public static void main(String [] args)
	{
		
		String_follow sf = new String_follow();
		sf.count1();
		//System.out.println(sf.count1());
		sf.count11();
		String s = "nehaasthana";
		String s1 = "TEstMaster";
		String s12 = "TEstFeqature";
		String s13 = "TEstMasterFeqature";
		String s14 = "TEstBranchFeqature";
		
	}
	int count1()
	
	{
		count++;
		System.out.println("count1:"+count);
		return count;
		
	}
	void count11()
	
	{
		System.out.println("count11:"+count);
		count1();
		
		
	}
	}


