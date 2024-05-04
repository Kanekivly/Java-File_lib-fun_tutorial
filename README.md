<h2>File hide_unhide handler</h2>
/*
    Author: Kanekiy
     whatsappChannel: https://whatsapp.com/channel/0029VadVtU3JUM2gAlVaWF1a
     Facebook: https://www.facebook.com/kanekivly
     Telegram: @kanekivly
     
     Some comments are necessary to read & understand
     not hard its simple
    */

  <h3>let's see preview </h3>
  <img src="https://github.com/Kanekivly/Java-File_lib-fun_tutorial/blob/main/Screenshot_20240504-081852.png" width="auto" height="300" />
<p>listing files</p>
<img src="https://github.com/Kanekivly/Java-File_lib-fun_tutorial/blob/main/Screenshot_20240504-083627.png" width="auto" height="300" />
<p>unhide then list to preview </p>
<img src="https://github.com/Kanekivly/Java-File_lib-fun_tutorial/blob/main/Screenshot_20240504-083656.png" width="auto" height="300" />
<hr>
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
    */
    <h3>this are comments that are in the code they'll guide you and show you issues you may envoun</h3>
    ,*/
    //this path was from my SD-Card on my android phone
        File str = new File("storage/427C-0B14");
        /*Android local storage:
        File str = new File("storage/emulated/0/");
        
        on your pc just choose a drive path or make the code to scan more than one drives
        e.g
       File str = new File("C:\\Users\Deskop\"); and so on depends where you want to hide em
       
        */
