package deleterepeat;

//删除文件中相似的序列。
import java.io.*;

public class delete_abudent {

	 @SuppressWarnings("unused")
	public static void main(String []args){
		  @SuppressWarnings("unused")
		String br1_line1,br1_line2; 
		 try{
			 
			   BufferedReader br1 = new BufferedReader(new FileReader("pfamID.txt"));
			   BufferedWriter bw = new BufferedWriter(new FileWriter("un_pfamID.txt",true));
			   
			//   System.out.println("1");
			   // BufferedReader br3 = new BufferedReader(new FileReader("unbundent_nonFamMember_Seq.txt"));
			   
             int m=1;
              
              br1_line1=br1.readLine();
          //    System.out.println("1");
          //    br1_line2=br1.readLine();
             // bw.write("1"+"\n");
            //  bw.write("2"+"\n");
            bw.write(br1_line1+"\n");
          //   bw.write(br1_line2+"\n");
              bw.flush();
              //bw.close();
              
              
		      while(br1.ready()){
		    	  br1_line1 = br1.readLine();
		    //	  br1_line2 = br1.readLine();
		    	  
		    	  
		    	  
		    	  String br2_line;
		    	 // int i=1;
		    	  BufferedReader br2 = new BufferedReader(new FileReader("un_pfamID.txt"));
		    	  int k=0; int i=0; int n=0;
		    	  while(br2.ready()){
		    		//  br2.readLine();
		    		  br2_line= br2.readLine();
		    		  i++;
		    		 // System.out.println(br2_line);
		    		//  if(br2_line.equals(br1_line2))
		    		  
		    			//  i++; 
		    		  
		    		  if(br2_line.length()!= br1_line1.length())n++;
		    		 k=0;
		    		  if(br2_line.length()==br1_line1.length()){
		    			  int j = 0;
		    			  while(j<=(br1_line1.length()-1)){ 
		    				  if(br1_line1.charAt(j)!=br2_line.charAt(j))k++;
		    				  j++;
		    			  } 
		    			if(k>0) n++;  // 超过5个碱基不一样，认为是不一样的序列就写入
		    		  }
		    		  
		    		  
		    			  
		    		 
		    		  
		    		  
		    		  
		    		  	  
		    		 
		    	  }
		    	  if(n==i){
		    		  m++;
		    		  bw.write(br1_line1+"\n");
		    	    //  bw.write(br1_line2+"\n");
		    	      
		    	  }
		    	  bw.flush();
		    	  br2.close();
		      }
		      bw.close();
		      br1.close();
		      
		      
		   
		   }
		   catch(Exception e){
			   System.out.println("error");
		   }
  }
}