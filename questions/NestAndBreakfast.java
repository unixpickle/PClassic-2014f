import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class NestAndBreakfast {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new FileReader 
												("NestAndBreakfastIN.txt"));
		
		while (br.ready()) {
			String line = br.readLine();
			
			String[] data = line.split(" ");
			int num = Integer.parseInt(data[0]);
			int[] reservations = new int[num];
			for (int i = 0; i < num; i++) {
				reservations[i] = Integer.parseInt(data[i+1]);
			}
			
			System.out.println(maxReservations(reservations));
		}
		
		
		br.close ();
	}

	private static long maxReservations(int[] reservations) {
                //Fill in this stub
        }
}
