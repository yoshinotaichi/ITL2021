<<<<<<< HEAD
import	java.io.*;
import	java.net.*;
import	java.util.*;

class	Netclock {
	public static void	main(String[]	args) {
		ServerSocket	servsock	=	null;
		Socket	sock;
		OutputStream	out;
		String	outstr;
		int	i;
		Date	d;

		try	{
			servsock	=	new	ServerSocket(6000,	300);

			while(true)
			{
				sock	=	servsock.accept();

				d	=	new	Date();
				outstr	=	"\n"
								+	"Hello, this is Netclock server."
								+	"\n"	+	d.toString()	+	"\n"
								+	"Thank you."	+	"\n";

				out	=	sock.getOutputStream();
				for(i=0;	i<outstr.length();	i++)
					out.write((int)	outstr.charAt(i));
				out.write('\n');

				sock.close();
			}
		}
		catch	(IOException	e)	{
			System.exit(1);
		}
	}
}
=======


   import	java.io.*;
   import	java.net.*;
   import	java.util.*;

   class	Netclock {
   	public static void	main(String[]	args) {

   		ServerSocket	servsock	=	null;
   		Socket	sock;
   		OutputStream	out;
   		String	outstr;
   		int	i;
   		Date	d;


   		try	{

   			servsock	=	new	ServerSocket(6000,	300);


   			while(true)
   			{
   				sock	=	servsock.accept();

   				d	=	new	Date();
   				outstr	=	"\n"
   								+	"Hello, this is Netclock server."
   								+	"\n"	+	d.toString()	+	"\n"
   								+	"Thank you."	+	"\n";


   				out	=	sock.getOutputStream();
   				for(i=0;	i<outstr.length();	i++)
   					out.write((int)	outstr.charAt(i));
   				out.write('\n');


   				sock.close();
   			}
   		}
   		catch	(IOException	e)	{
   			System.exit(1);
   		}
   	}
   }
>>>>>>> 9df9de1c683e7ca576d32a14b3fe1d2f899c6f21
