
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);
            String special = "AEF HILMNORSX";
          for (int i = 0  ; i< name.length() ; i++)
          {
                char a = name.charAt(i);
                System.out.print("Give me");
                if (special.indexOf(a) != -1)
                {
                System.out.print(" an ");
                } 
                else {
                System.out.print(" a ");
                }               
                System.out.print(a + ": " + a + "!\n" );

                }
                for(int j=0;j<times;j++){
                        System.out.println(name+" ! ! !");
                }
          }
        }
