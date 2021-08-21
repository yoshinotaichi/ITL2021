<<<<<<< HEAD
import java.io.*;
import java.net.*;

public class Readnet {
	public static void main(String[] args)	{
		byte[] buff = new byte[1024];
		Socket readsock = null;
		InputStream instr = null;
		boolean cont = true;

		try {
			readsock = new Socket ( args[0], Integer.parseInt(args[1]) );
			instr = readsock.getInputStream();
		} catch( Exception e ){
			System.err.println("network error");
			System.exit(1);
		}

		while ( cont ) {
			try {
				int n = instr.read( buff );
		System.out.write(buff, 0, n);
		} catch (Exception e) {
			cont=false;
		  }
		}

		try {
			instr.close();
		} catch (Exception e) {
			System.err.println("network error");
			System.exit(1);
		}
	}
}
=======


	import java.io.*;
	import java.net.*;

	public class Readnet {
		public static void main( String[] args ) {

			byte[] buff = new byte[1024];

			Socket readsock = null;

			InputStream instr = null;

			boolean cont = true;

			try {

				readsock = new Socket ( args[0], Integer.parseInt( args[1] ) );
				instr = readsock.getInputStream();

			} catch( Exception e ) {

				System.err.println("Network Error");
				System.exit(1);

			}

			while( cont ){

				try{
					int n = instr.read( buff );
					System.out.write( buff,0,n );

				} catch( Exception e ){
					cont = false;
				}

			}

			try {
				instr.close();
			} catch( Exception e ) {
				System.err.println( "Network Error" );
				System.exit(1);
			}

		}
	}
>>>>>>> 9df9de1c683e7ca576d32a14b3fe1d2f899c6f21
