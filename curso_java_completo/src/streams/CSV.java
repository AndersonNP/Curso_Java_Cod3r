package streams;

import java.io. * ;

public class CSV {
  public static final String delimiter = ";";
  public static void read(String csvFile) {
    try {
      File file = new File(csvFile);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = " ";
      String[] tempArr;
      String teste ="";
      while ((line = br.readLine()) != null) {
    	  teste = line;
        tempArr = line.split(delimiter);
        if(tempArr[0].equals("CODPRC")) continue;
        for (String tempStr: tempArr) {
          System.out.print(tempStr + " | ");
        }
        //System.out.println();
        break;
      }
      
      byte[] testeBytes = teste.getBytes();
      System.out.println("\n\n" + testeBytes[0]);
      
      String stringTeste = new String(testeBytes);
      
      System.out.println("\n\n" + stringTeste);
      
      testeBytes = stringTeste.getBytes();
      
      System.out.println("\n\n" + testeBytes[0]);
      
      stringTeste = new String(testeBytes);
      
      System.out.println("\n\n" + stringTeste);
      
      br.close();
    }
    catch(IOException ioe) {
      ioe.printStackTrace();
    }
  }
  public static void main(String[] args) {
    //csv file to read
    String csvFile = "C:\\teste2.csv";
    CSV.read(csvFile);
  }
}