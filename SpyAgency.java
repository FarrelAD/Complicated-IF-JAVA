// Program perekrutan agen mata-mata 'The Silent Agency'
import java.util.Scanner;
public class SpyAgency {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        char response = 'n', userCat, upperCase_userCat, userPizza, upperCase_userPizza, 
            userVegan, upperCase_userVegann, responseSPY;
        String[] answerKey1 = {"144", "25", "Vanuatu"};
        String userName, countryUser, schoolUser = "", userMother, userAgency, upperCase_userAgency,
            userFeelString;
        int ageUser, schoolUserInput, userLongWork, userFeel;
        boolean nextMission = false;

        System.out.println("WELCOME!");
        System.out.println("sstt!! KEEP SILENT!");
        System.out.print("Type 'OK'  ---  ");
        String responseOK = scan1.nextLine();
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (responseOK.equalsIgnoreCase("OK")) {
            System.out.println("Are you ready? ");
            System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
            response = scan1.next().charAt(0);
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (response == 'Y' || response == 'y') {
                System.out.println("MESSAGE: Congratulations! You're a lucky person!");
                System.out.println("MESSAGE: We are future-human from Andromeda Galaxy. And we need something help from you! ");
                System.out.println("MESSAGE: If you can complete the tasks we give to you, we will give you a prize!");
                System.out.println("Do you interest about us?");
                System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                response = scan1.next().charAt(0);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                if (response == 'Y' || response == 'y') {
                    System.out.println("MESSAGE: We really appreciate your decision!");
                    System.out.println("MESSAGE: Okay, we will show you our rules first");
                    System.out.println("Rule No. 1 -- KEEP SILENT!");
                    System.out.println("Rule No. 2 -- KEEP SECRET!");
                    System.out.println("Rule No. 3 -- Don't share this information to ANYONE!");
                    System.out.println("Do you understand? ");
                    System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                    response = scan1.next().charAt(0);
                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
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
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if ((answerUser1.equals(answerKey1[0])) && (answerUser2.equals(answerKey1[1])) && (answerUser3.equalsIgnoreCase(answerKey1[2]))) {
                            System.out.println("MESSAGE: You are smart enough!");
                            System.out.println("MESSAGE: We've gone quite far. But we don't know your identity.");
                            System.out.println("MESSAGE: We use your data for the success of our mission.");
                            System.out.println("MESSAGE: Do you agree to share your identity? ");
                            System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                            response = scan1.next().charAt(0);
                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            if (response == 'Y' || response == 'y') {
                                System.out.println("MESSAGE: Thank you for trusting us! We hope we can work well together");
                                System.out.println("MESSAGE: Please fill in the following questions below!");
                                System.out.println("1st -- What is your name?");
                                System.out.print("SYSTEM: YOUR NAME -- ");
                                userName = scan2.nextLine();
                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                if (userName != null) {
                                    System.out.println("2nd -- How old are you?");
                                    System.out.print("SYSTEM: Your age (NUMBER ONLY)-- ");
                                    ageUser = scan1.nextInt();
                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    if ((ageUser != 0) && (ageUser >= 18)) {
                                        System.out.println("3nd -- Which country are you from?");
                                        System.out.print("SYSTEM: Your country -- ");
                                        countryUser = scan2.nextLine();
                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        if (!countryUser.equalsIgnoreCase("America")) {
                                            System.out.println("3rd -- What is your educational background?");
                                            System.out.println("WARNING: CHOOSE ONE!");
                                            System.out.println("1. Junior High School");
                                            System.out.println("2. Senior High School");
                                            System.out.println("3. Bachelor's degree graduate");
                                            System.out.println("4. Master's degree graduate");
                                            System.out.println("5. PhD graduate");
                                            System.out.print("SYSTEM: YOUR ANSWER (NUMBER ONLY) -- ");
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
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            if ((schoolUserInput > 0) && (schoolUserInput <= 5)) {
                                                System.out.println("4th -- Do you like cat?");
                                                System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                userCat = scan1.next().charAt(0);
                                                upperCase_userCat = Character.toUpperCase(userCat);
                                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                if (userCat == 'N' || userCat == 'n') {
                                                    System.out.println("5th -- Do you like pizza?");
                                                    System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                    userPizza = scan1.next().charAt(0);
                                                    upperCase_userPizza = Character.toUpperCase(userPizza);
                                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                    System.out.print("\033[H\033[2J");
                                                    System.out.flush();
                                                    if (userPizza == 'Y' || userPizza == 'y') {
                                                        System.out.println("6th -- Are you a vegan?");
                                                        System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                        userVegan = scan1.next().charAt(0);
                                                        upperCase_userVegann = Character.toUpperCase(userVegan);
                                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.flush();
                                                        if (userVegan == 'N' || userVegan == 'n') {
                                                            System.out.println("MESSSAGE: Thank you for the data you provide to us");
                                                            System.out.println("THIS IS YOUR DATA: ");
                                                            System.out.printf("-- Name\t\t\t\t: %s \n", userName);
                                                            System.out.printf("-- Your age\t\t\t: %d old years\n", ageUser);
                                                            System.out.printf("-- Country\t\t\t: %s \n", countryUser);
                                                            System.out.printf("-- Educational background\t: %s \n", schoolUser);
                                                            System.out.printf("-- Doesn't like cat\t\t: %c \n", upperCase_userCat);
                                                            System.out.printf("-- Like pizza\t\t\t: %c \n", upperCase_userPizza);
                                                            System.out.printf("-- Not vegan\t\t\t: %c \n", upperCase_userVegann);
                                                            System.out.println("Is that your real data?");
                                                            System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                            response = scan1.next().charAt(0);
                                                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                            System.out.print("\033[H\033[2J");
                                                            System.out.flush();
                                                            if (response == 'Y' || response == 'y') {
                                                                System.out.println("MESSAGE: Great! ");
                                                                System.out.println("MESSAGE: Have you ever been a spy agent? ");
                                                                System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                                responseSPY = scan1.next().charAt(0);
                                                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.flush();
                                                                if (responseSPY == 'Y' || responseSPY == 'y') {
                                                                    System.out.printf("MESSAGE: That's amazing! %s\n", userName);
                                                                    System.out.println("MESSAGE: What agency have you worked for?");
                                                                    System.out.print("YOU: ");
                                                                    userAgency = scan2.nextLine();
                                                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.flush();
                                                                    if (userAgency != null) {
                                                                        System.out.println("MESSAGE: How long have you worked there?");
                                                                        System.out.print("YOU: (Answer in years) - ");
                                                                        userLongWork = scan1.nextInt();
                                                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.flush();
                                                                        if (userLongWork > 0 ) {
                                                                            System.out.println("MESSAGE: How do you feel when you working there?");
                                                                            System.out.println("SYSTEM: Answer with number only!");
                                                                            System.out.println("1. Happy");
                                                                            System.out.println("2. Sad");
                                                                            System.out.println("3. Neutral");
                                                                            System.out.print("YOUR ANSWER --");
                                                                            userFeel = scan1.nextInt();
                                                                            if (userFeel == 1) {
                                                                                userFeelString = "Happy";
                                                                            } else if (userFeel == 2) {
                                                                                userFeelString = "Sad";
                                                                            } else if (userFeel == 3) {
                                                                                userFeelString = "Neutral";
                                                                            } else {
                                                                                userFeelString = "-";
                                                                            }
                                                                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                            System.out.print("\033[H\033[2J");
                                                                            System.out.flush();
                                                                            if (userFeel > 0 && userFeel <= 3) {
                                                                                System.out.println("MESSAGE: This is your data about your experience as an agent");
                                                                                System.out.printf("-- Agency\t: %s\n", userAgency);
                                                                                System.out.printf("-- How long\t: %d years\n", userLongWork);
                                                                                System.out.printf("-- Feeling\t: %s\n", userFeelString);
                                                                                System.out.println("MESSAGE: Do you want to continue?");
                                                                                System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                                                response = scan1.next().charAt(0);
                                                                                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                                System.out.print("\033[H\033[2J");
                                                                                System.out.flush();
                                                                                if (response == 'Y' || response == 'y') {
                                                                                    nextMission = true;
                                                                                }
                                                                            } else {
                                                                                System.out.println("MESSAGE: You don't input correctly. We need data about your feeling.");
                                                                            }
                                                                        } else {
                                                                            System.out.println("MESSAGE: You don't input correctly. Please don't troll us!");
                                                                        }
                                                                    } else {
                                                                        System.out.println("You don't input correctly. We really need your personal data experience");
                                                                    }
                                                                } else {
                                                                    System.out.println("MESSAGE: Do you like something secret?");
                                                                    System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                                    response = scan1.next().charAt(0);
                                                                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.flush();
                                                                    if (response == 'Y' || response == 'y') {
                                                                        System.out.println("MESSAGE: That's good! ");
                                                                        System.out.println("MESSAGE: What is your mother's name? ");
                                                                        System.out.println("SYSTEM: (Type 0 if you don't want to answer this question)");
                                                                        System.out.print("YOU: ");
                                                                        userMother = scan2.nextLine();
                                                                        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.flush();
                                                                        if (userMother.equals("0")) {
                                                                            System.out.println("MESSAGE: GOOD! You don't tell your secret mother name.");
                                                                            System.out.println("         BUT... ");
                                                                            System.out.println("         You already share your personal data information to us.");
                                                                            System.out.println("MESSAGE: HAHAHA... Don't worry we will keep your data confidential");
                                                                            System.out.println("MESSAGE: Are you still interested in us?");
                                                                            System.out.print("SYSTEM: Type 'Y' for YES. 'N' for NO  ---  ");
                                                                            response = scan1.next().charAt(0);
                                                                            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                                                                            System.out.print("\033[H\033[2J");
                                                                            System.out.flush();
                                                                            if (response == 'Y' || response == 'y') {
                                                                                nextMission = true;
                                                                            } else {
                                                                                System.out.println("MESSAGE: ONE WORD, THANKS!!");
                                                                                System.out.println("MESSAGE: Thank you for sharing your personal information!! :)");
                                                                            }
                                                                        } else {
                                                                            System.out.println("MESSAGE: STUP*D!! We said you should not give out any secret information!");
                                                                        }
                                                                    } else {
                                                                        System.out.println("MESSAGE: You can't go any further");
                                                                        System.out.println("MESSAGE: We only accept people who can keep something secret");
                                                                    }
                                                                }
                                                                if (nextMission) {
                                                                    System.out.println("MESSAGE: CONRATULATIONS! YOU'RE ACCEPTED TO BE OUR SPY AGENT!");
                                                                    System.out.println("WARNING: YOU NEED TO READ THIS PART!!!");
                                                                    System.out.println("MESSAGE: As long as you are a member of us, you must obery our rules");
                                                                    System.out.println("MESSAGE: What you have to remeber most is");
                                                                    System.out.println("         ... KEEP SECRET, KEEP SILENT!");
                                                                }
                                                            } else {
                                                                System.out.println("MESSAGE: HOW POSSIBLE THAT NOT TRUE? ");
                                                            }
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
                                        System.out.println("MESSAGE: Sorry, we can't accept a child like you");
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
