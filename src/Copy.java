import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public  void copy(String path_read,String path_wirte) {
		
		File r_fd = new File(path_read);
		File w_fd = new File(path_wirte);

		if (!r_fd.exists()) {
			System.out.println("file is not exit!!");
			System.exit(1);
		}

		InputStream input = null;
		OutputStream output = null;

		try {
			input = new FileInputStream(r_fd);
			output = new FileOutputStream(w_fd,true);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (input != null && output != null) {

			int temp = 0;
			try {
				while ((temp = input.read()) != -1) {
					output.write(temp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				input.close();
				output.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
