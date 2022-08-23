//this program determine whether there is a protein in a strand of DNA
public class DNA {

    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
   
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
  
  
    int length = dna.length();
    System.out.println("Length: " +length);
  
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
  
    if (start != -1 && stop != -1 && (stop-start) % 3 == 0) {
        System.out.println("Protein: " +dna);
    } else {
      System.out.println("No protein");
    }
  
  }
  
    
  }