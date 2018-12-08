import java.io.RandomAccessFile;

class DiskInitializer
{
    public static void main(String[] args) throws Exception
    {
    	RandomAccessFile file = new RandomAccessFile("src/disk.txt","rw");
    	StringBuilder sb = new StringBuilder();
    	for( int i=0 ; i<20480000+1024000 ; i++ )	sb.append((char)0);
    	file.write(sb.toString().getBytes());
    	file.close();
    }
}