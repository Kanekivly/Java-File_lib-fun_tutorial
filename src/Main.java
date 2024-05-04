import java.io.File;
import java.util.Scanner;


public class Main
{
    /*
    Author: Kanekiy
     whatsappChannel: https://whatsapp.com/channel/0029VadVtU3JUM2gAlVaWF1a
     Facebook: https://www.facebook.com/kanekivly
     Telegram: @kanekivly
     
     Some comments are necessary to read & understand
     not hard its simple
    */

	public static void main(String[] args)
	{   
    /*
    deletion function for all files and dirs removed
    why?, this is just a friendly learning tool
    hides and unhide etc can also be implemented on android java
    which can be used to prank a friend by hiding all their dirs and other fies
    by putting a dot before the names
    you can restore them manually if the tool becomes slow due to your device
    by removing the dots on rename opt , using file managers that shows hidden files & dir
    etc, e.g: google files(turn show hidden files on settings) also on Zarchiver
    have fun, follow , fork , im just using github for openSource projects
    and dont forget to star (hehe)
    By me: Kanekivly
    Whatsapp: Ghoulcode
    find link on my gihub profile even telegram profile link is there
    you can send message
    my upcoming projects wont be just tutorials but bigger expect more
    
    ,*/
        System.out.println("|=================Ghoulcode==================|");
        System.out.println("|             (deadly)Hide&Seek              |");
		System.out.println("|     Hide and unhide local storage test     |");
		System.out.println("| [1]List_Files      [2]List_Hidden(disabled)|");
        System.out.println("| [3]Disclaimer      [4]Info-bugs-about tool |");
		System.out.println("|==========={}Advanced options{}=============|");
        System.out.println("| [5]Hide_Files      [6]unHide_Files         |");
        System.out.println("|                    [0]Exit                 |");
        System.out.println("|================By_Kanekivly================|");
//will be needed to break nested loop   
breakloop:
		while(true){
		 Scanner scan = new Scanner(System.in);
		  System.out.print("choose opt: ");
		 int opt = scan.nextInt();
         switch(opt){
             case 1:
              listall();
              continue;
             case 2:
                 listhd();
                 continue;
             case 3:
                 discl();
                 continue;
             case 4:
                 inf();
                 continue;
             case 5:
                 hide();
                 continue;
             case 6:
                 unhide();
                 continue;
             case 0:
                 System.out.println("Exiting");
                 
                 break breakloop;
             default:
             System.out.println("invalid opt");
             System.out.println("Termated (exit) !!");
              
             break breakloop;
         }
         //i made it one script so that i dont confuse beginners with making alot modules
		/*
        //disabled if/else since where using Switch() statement
		 if(opt == 1){
		   hide();
		   continue;
		 }else if(opt == 2){
			 unhide();
			 continue;
		 }else{
			 System.out.println("invalid opt");
			 System.out.println("terminated!");
			 break;
		 }*/
      }
  }
  static void discl(){
      System.out.println("Hey, you are free to use this though there are few (buts)");
      System.out.println("[one] the hide option may take time though on android it might not Hide the Android Folder");
      System.out.println("[two] This is just for fun dont use it reckless or adding delete func to delete your friends all data, haha but please dont its harmful for a tip add read external storage permission");
      System.out.println("[three] This tool is works but not that accurate it might even refuse to unhide which will make you unhide manually read top comment, but try again like thrice it will definetly work!!");
      System.out.println("[four] I can make it less fun and as a ransom**** anyway if you want that feature contacr... hahaha (note) just dont kill the fun , i tried not do any harm");
  }
  static void inf(){
      System.out.println("This Tool has few issues not harmful.or anything like that");
      System.out.println("+It might not hide all files, guessing its device speed & on android i think you cannot hide the Android folder , use this opt twice i guess");
      System.out.println("+It might not unhide all which definetly need to be used twice, only unhide folders after storage path , cause i didnt make a feature that go throug the entire files and folders");
      System.out.println("+Removed the all_files deletion option");
      System.out.println("+if you choose option2 it will list as booleans , check code and its comments , its openSource, maybe you can contribute and give a solution ill also make an updata hahaha");
      System.out.println("+theres no option 7 its 0 for exit hahaha");
      }
  static void listhd(){
      //this path was from my SD-Card on my android phone
        File str = new File("storage/427C-0B14");
        /*Android local storage:
        File str = new File("storage/emulated/0/");
        
        on your pc just choose a drive path or make the code to scan more than one drives
        e.g
       File str = new File("C:\\Users\Deskop\"); and so on depends where you want to hide em
       
        */
        String[] list = str.list();
        for(String lst : list){
          /*tried to convert boolean to string
          but output still shows as boolean even when its a string
          so this is a disappointment , but if a file in 
          numer 2 has a dot it will printOut as true if not
          it will show false but not the file name
          until further update
          */
          
          //tried using regex to get dotted files works fine but stil output is boolean
           String conv = String.valueOf(lst.matches("^\\./g"));
           System.out.println(conv);
        }
    }
    static void listall(){
        File str = new File("storage/427C-0B14");
        String[] list = str.list();
        for(String lst : list){
            //list all filse simple as that
            System.out.println(lst);
        }
    }
	static void hide(){
		File setorage = new File("storage/427C-0B14");
		File[] difiles = setorage.listFiles();

		for(File dilist : difiles){
			//checking files and folders are actually there , only those after the string on (setorage)
			if(dilist.isFile() || dilist.isDirectory()){
				String Lebitxo_lefsa = "."+dilist.getName();
				/* 
                changing all files and folders to start with a dot
                before their names
				 */
				File file_efsa = new File(dilist.getParent(), Lebitxo_lefsa);
				dilist.renameTo(file_efsa);
				 
                //listing them
                /*if you dont mind contributing
                you might find that this test tool takes time putting those dots.
                which means its slow only when hidding
                you can write a solution only if you dont mind, forking,
                and give credits
                but ill do so too, this is just a test im sharing with you guys
                */
				System.out.println(dilist);
			}
		}
	}static void unhide(){
		File setorage = new File("storage/emulated/0");
		File[] difiles = setorage.listFiles();
		//String[] dif = setorage.list();

		for(File dilist : difiles){
			System.out.println(dilist);
			if(dilist.getName().startsWith(".")){
				String Lebitxo_lefsa = dilist.getName().replace(".", "");
				File file_ebonolo = new File(dilist.getParent(), Lebitxo_lefsa);
				dilist.renameTo(file_ebonolo);
				//dilist.renameTo(new File(Lebitxo_lefsa));
				System.out.print(dilist);
			}
		}
	}
}
