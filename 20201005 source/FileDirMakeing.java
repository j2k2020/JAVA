import java.io.File;

public class FileDirMakeing {
		public boolean make(String fname) {
			File f=new File(fname);
			//System.out.println(f.isDirectory());
			if(f.isDirectory() && f.exists()) {
				System.out.println(fname + "폴더가 이미 존재합니다.");
				return false;
			}
			return f.mkdir();
		}
		
		public boolean delete(String fname) {
			File f=new File(fname);
			if(!f.exists()) {
				System.out.println(fname+"폴더가 존재하지 않습니다.");
				return false;
			}
			return f.delete();
		}
		
		public boolean rename(String fname, String newname) {
			File f=new File(fname);
			if(!f.exists()) {
				System.out.println(fname+"폴더가 존재하지 않습니다.");
				return false;
			}
			return f.renameTo(new File(newname));
		}
		
		public static void main(String[] arg) {
			FileDirMakeing fm=new FileDirMakeing();
			//fm.make("src\\aaa");
			//System.out.println(fm.make("aaa"));
			fm.make("aaa");
			//fm.delete("aaa");
			fm.rename("aaa","bbb");
		}
		
}
