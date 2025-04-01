// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("ala ma kota ");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

// zad 4 silnia
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner skan = new java.util.Scanner(System.in);
        System.out.println("Podaj liczbe której oblicyc silnie ");
        int a = skan.nextInt();
        int silnia = 1;
        for(int i=1; i<=a; i++){
            silnia *=i;
        }
        System.out.println("Silnia z "+a+" wynsoi: "+silnia);
        skan.close();
    }
}

// tabliczka mnozenia 
  import java.util.Scanner;

public class Main
{
    public static void main(String[] args)    
    {
        Scanner keyboard = new Scanner (System.in);
        int x=1, y=1;
        System.out.print("Enter rows ");
        x = keyboard.nextInt();
        System.out.print("Enter columns ");
        y = keyboard.nextInt();

        for (int i=1; i<=x; i++) 
        {
            for (int j=1; j<=y; j++)
            {
            	int a = i*j;
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
    }
}
//choinka 
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        int height = o.nextInt();
  
  
        for (int i = 1; i<=height; i++)
        {
            for(int j=0;j<height-i;j++)System.out.print(" ");
            for (int j = 0; j<(i*2)-1; j++)System.out.print("*");
            System.out.println(" ");
        }
  
    }
}
