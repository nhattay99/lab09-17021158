import java.io.*;
import java.util.Scanner;
//doc, ghi du lieu kieu character
public class Utils {
    public static String ReadContentFromFile(String path){//doc tu tep
        try{//b1: tao doi tuong luong va lien ket nguon du lieu
            File file =new File(path);
            FileReader fileReader= new FileReader(file);
            //doc du lieu tu tep
            BufferedReader bufferedReader = new BufferedReader(fileReader);//doc du lieu theo dong tu reader, trong doc co ca bo dem
            String line;
            String str="";
            while ((line= bufferedReader.readLine())!= null)
                str+=line;
            //dong luong
            fileReader.close();
            bufferedReader.close();
            return str; //tra ve chuoi vua doc

        } catch (IOException e){
            return null;
        }
    }
    //ghi va xoa noi dung da co san trong tep
    public static void WriteContentToFile(String path){
        try{
            //tao doi tuong luong va lien ket nguon du lieu
        File file =  new File(path); //duong dan
        file.delete(); //xoa du lieu trong tep
        FileWriter fileWriter = new FileWriter(file);
        //nhap du lieu tu ban phim
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            fileWriter.write(str);
            //dong luong
            fileWriter.close();
    }catch (IOException e){}
    }
    //ghi vao tep
    public static void WriteContinueFile(String path){
       try {
            File file =new File(path);
            FileWriter fileWriter = new FileWriter(file);
            Scanner scanner =new Scanner(System.in);
            String str= scanner.next();
            fileWriter.write(str);
            fileWriter.close();
        }catch (IOException e){}
    }
    //tim kiem tep trong thu muc
    public static File FindFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if(file.exists()){//kiem tra xem file co ton tai
            if(file.getName().endsWith(fileName)){//so sanh ten file voi fileName truyen vao
                System.out.println(file.getAbsolutePath());//in duong dan toi file
            }
            else
               return null;
        }
       return file;
    }
}
