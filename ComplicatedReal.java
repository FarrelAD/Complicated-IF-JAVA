// Program perekrutan agen mata-mata 'The Silent Agency'
import java.util.Scanner;
public class ComplicatedReal {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        char response, userCat, upperCase_userCat, userPizza, upperCase_userPizza, userVegan, upperCase_userVegann;
        String[] answerKey1 = {"144", "25", "Vanuatu"};
        String nameUser, countryUser, schoolUser = "";
        int ageUser, schoolUserInput;

        System.out.println("WELCOME!");
        System.out.println("sstt!! KEEP SILENT!");
        System.out.print("Type 'OK'  ---  ");
        String responseOK = scan1.nextLine();
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        if (responseOK.equalsIgnoreCase("OK")) {
            System.out.println("Are you ready? ");
            System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
            response = scan1.next().charAt(0);
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            if (response == 'Y' || response == 'y') {
                System.out.println("MESSAGE: Congratulations! You're a lucky person!");
                System.out.println("MESSAGE: We are future-human from Andromeda Galaxy. And we need something help from you! ");
                System.out.println("MESSAGE: If you can complete the tasks we give to you, we will give you a prize!");
                System.out.println("Do you interest about us?");
                System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                response = scan1.next().charAt(0);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                if (response == 'Y' || response == 'y') {
                    System.out.println("MESSAGE: We really appreciate your decision!");
                    System.out.println("MESSAGE: Okay, we will show you our rules first");
                    System.out.println("Rule No. 1 -- KEEP SILENT!");
                    System.out.println("Rule No. 2 -- KEEP SECRET!");
                    System.out.println("Rule No. 3 -- Don't share this information to ANYONE!");
                    System.out.println("Do you understand? ");
                    System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                    response = scan1.next().charAt(0);
                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
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
                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                        if ((answerUser1.equals(answerKey1[0])) && (answerUser2.equals(answerKey1[1])) && (answerUser3.equalsIgnoreCase(answerKey1[2]))) {
                            System.out.println("MESSAGE: You are smart enough!");
                            System.out.println("MESSAGE: We've gone quite far. But we don't know your identity.");
                            System.out.println("MESSAGE: We use your data for the success of our mission.");
                            System.out.println("MESSAGE: Do you agree to share your identity? ");
                            System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                            response = scan1.next().charAt(0);
                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                            if (response == 'Y' || response == 'y') {
                                System.out.println("MESSAGE: Thank you for trusting us! We hope we can work well together");
                                System.out.println("MESSAGE: Please fill in the following questions below!");
                                System.out.println("1st -- What is your name?");
                                System.out.print("YOUR NAME -- ");
                                nameUser = scan2.nextLine();
                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                if (nameUser != null) {
                                    System.out.println("2nd -- How old are you?");
                                    System.out.print("Your age (NUMBER ONLY)-- ");
                                    ageUser = scan1.nextInt();
                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                    if ((ageUser != 0) && (ageUser >= 18)) {
                                        System.out.println("3nd -- Which country are you from?");
                                        System.out.print("Your country -- ");
                                        countryUser = scan2.nextLine();
                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                        if (!countryUser.equalsIgnoreCase("America")) {
                                            System.out.println("3rd -- What is your educational background?");
                                            System.out.println("WARNING: CHOOSE ONE!");
                                            System.out.println("1. Junior High School");
                                            System.out.println("2. Senior High School");
                                            System.out.println("3. Bachelor's degree graduate");
                                            System.out.println("4. Master's degree graduate");
                                            System.out.println("5. PhD graduate");
                                            System.out.print("YOUR ANSWER (NUMBER ONLY) -- ");
                                            schoolUserInput = scan1.nextInt();
                                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                            if (schoolUserInput == 1) {
                                                schoolUser = "Junior High School";
                                            } else if (schoolUserInput == 2) {
                                                schoolUser = "Senior High School";
                                            } else if (schoolUserInput == 3) {
                                                schoolUser = "Bachelor's degree graduate";
                                            } else if (schoolUserInput == 4) {
                                                schoolUser = "Master's degree graduate";
                                            } else if (schoolUserInput == 5) {
                                                schoolUser = "PhD graduate";
                                            }
                                            if ((schoolUserInput > 0) && (schoolUserInput <= 5)) {
                                                System.out.println("4th -- Do you like cat?");
                                                System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                                                userCat = scan1.next().charAt(0);
                                                upperCase_userCat = Character.toUpperCase(userCat);
                                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                if (userCat == 'N' || userCat == 'n') {
                                                    System.out.println("5th -- Do you like pizza?");
                                                    System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                                                    userPizza = scan1.next().charAt(0);
                                                    upperCase_userPizza = Character.toUpperCase(userPizza);
                                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                    if (userPizza == 'Y' || userPizza == 'y') {
                                                        System.out.println("6th -- Are you a vegan?");
                                                        System.out.print("Type 'Y' for YES. 'N' for NO  ---  ");
                                                        userVegan = scan1.next().charAt(0);
                                                        upperCase_userVegann = Character.toUpperCase(userVegan);
                                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                        if (userVegan == 'N' || userVegan == 'n') {
                                                            System.out.println("MESSSAGE: Thank you for the data you provide to us");
                                                            System.out.println("THIS IS YOUR DATA: ");
                                                            System.out.printf("-- Name: %s \n", nameUser);
                                                            System.out.printf("-- Your age: %d \n", ageUser);
                                                            System.out.printf("-- Country: %s \n", countryUser);
                                                            System.out.printf("-- Educational background: %s \n", schoolUser);
                                                            System.out.printf("-- Doesn't like cat: %c \n", upperCase_userCat);
                                                            System.out.printf("-- Like pizza: %c \n", upperCase_userPizza);
                                                            System.out.printf("-- Not vegan: %c \n", upperCase_userVegann);
                                                        } else {
                                                            System.out.println("MESSAGE: IS THAT REAL THAT YOU'RE A VEGAN??");
                                                            System.out.println("         HEY BRO! EVERY FOOD YOU EAT IS EQUALS FOR 1% OF NATURAL DAMAGE");
                                                        }
                                                    } else {
                                                        System.out.println("MESSAGE: Pizza is delicious. Why you don't like it?");
                                                    }
                                                } else {
                                                    System.out.println("MESSAGE: WHAT THE H*LL! YOU LIKE CATS???");
                                                    System.out.println("         You are just like humans in general. We don't like it!");
                                                }
                                            } else {
                                                System.out.println("MESSAGE: Sorry, we only accept people with good educational backgrounds");
                                            }
                                        } else {
                                            System.out.println("MESSAGE: Sorry we can't accept people from America");
                                        }
                                    } else {
                                        System.out.println("MESSAGE: Sorry, we can't a child like you");
                                    }
                                }
                            } else {
                                System.out.println("MESSAGE: You choose not to agree to our terms.");
                                System.out.println("         So, we cannot continue our mission. :(");
                            }
                        } else {
                            System.out.println("MESSAGE: That's so sad. You are not smart enough");
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
        scan1.close();
        scan2.close();
    }
    
}