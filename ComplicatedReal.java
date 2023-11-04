// Program perekrutan agen mata-mata 'The Silent Agency'
import java.util.Scanner;
public class ComplicatedReal {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        char response;
        String[] answerKey1 = {"144", "25", "Vanuatu"};

        System.out.println("WELCOME!");
        System.out.println("sstt!! KEEP SILENT!");
        System.out.print("Type 'OK'  ---  ");
        String responseOK = scan1.nextLine();
        if (responseOK.equalsIgnoreCase("OK")) {
            System.out.println("Are you ready? ");
            System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
            response = scan1.next().charAt(0);
            if (response == 'Y' || response == 'y') {
                System.out.println("MESSAGE: Congratulations! You're a lucky person!");
                System.out.println("MESSAGE: We are future-human from Andromeda Galaxy. And we need something help from you! ");
                System.out.println("MESSAGE: If you can complete the tasks we give to you, we will give you a prize!");
                System.out.println("Do you interest about us? (Y/N)");
                response = scan1.next().charAt(0);
                if (response == 'Y' || response == 'y') {
                    System.out.println("MESSAGE: We really appreciate your decision!");
                    System.out.println("MESSAGE: Okay, we will show you our rules first");
                    System.out.println("Rule No. 1 -- KEEP SILENT!");
                    System.out.println("Rule No. 2 -- KEEP SECRET!");
                    System.out.println("Rule No. 3 -- Don't share this information to ANYONE!");
                    System.out.println("Do you understand? (Y/N)");
                    response = scan1.next().charAt(0);
                    if (response == 'Y' || response == 'y') {
                        System.out.println("MESSAGE: Okay, we will test your IQ. Because we want a SMART PEOPLE not a STUPID PEOPLE.");
                        System.out.println("MESSAGE: Let's see if you can answer this question");
                        System.out.println("WARNING: You only have one chance to answer!");
                        System.out.println("Question 1 -- If 5=25, 6=36, 7=49, then 12=?");
                        System.out.println("Question 2 -- How many prime numbers under 100? ");
                        System.out.println("Question 3 -- This is a country located in Pacific Ocean. The location is quite close to Australia.");
                        System.out.println("              The country's initial is 'V'. What country is it?");
                        System.out.println("Your Answer: ");
                        System.out.print("Question 1 -- ");
                        String answerUser1 = scan2.nextLine();
                        System.out.print("Question 2 -- ");
                        String answerUser2 = scan2.nextLine();
                        System.out.print("Question 3 -- ");
                        String answerUser3 = scan2.nextLine();
                        if ((answerUser1.equals(answerKey1[0])) && (answerUser2.equals(answerKey1[1])) && (answerUser3.equalsIgnoreCase(answerKey1[2]))) {
                            System.out.println("MESSAGE: You are smart enough!");
                        }
                    } else {
                        System.out.println("MESSAGE: STUP*D! It's just a simple question and you can't understand it.");
                        System.out.println("         THROW AWAY YOUR BRAIN!!!");
                    }
                } else {
                    System.out.println("MESSAGE: Please pay attention to your decision. If your planet has some problem, we can't help you!");
                }
            } else {
                System.out.println("MESSAGE: Why are you not ready? We really need you!");
            }
        }
        
    }
    
}