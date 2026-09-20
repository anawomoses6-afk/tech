import java.util.Scanner;
public class Nokia5510{ 
	public static void main(String[] args){
		    Scanner input = new Scanner(System.in);

		      String mainMenu = """
      List of Menu Functions
  1.Phone book 
  2. Message
  3. Chat
  4. Call register
  5. Tones
  6. Settings
  7. Call divert
  8. Music
  9. Games
  10. Calculator
  11. Reminder
  12. Clock
  13. Profile
  14. Service
  15. SIM service
  """;
		System.out.println(mainMenu);
		int mainMenuChoice = input.nextInt();

		switch(mainMenuChoice){
			case 1:	System.out.println("Phone book");
				  String phoneBookMenu = """
				
  1. Search
  2. Service
  3. Add name
  4. Erase
  5. Edit
  6. Copy
  7. Assign
  8. Send b' card
  9. Options 
  10. Speed dials
  11.Voice tags
  """;
				System.out.println(phoneBookMenu);
				int phoneBookMenuChoice = input.nextInt();

				switch(phoneBookMenuChoice){
					case 1: System.out.println("Search");break;
					case 2:	System.out.println("Service Nos."); break;
					case 3: System.out.println("Add name");break;
					case 4: System.out.println("Erase"); break;
					case 5: System.out.println("Edit");break;
					case 6: System.out.println("Copy"); break;
					case 7: System.out.println("Assign tone"); break;
					case 8: System.out.println("Send b'card");break;
					case 9: System.out.println("Options"); 
						String optionsMenu = """
  1. Memory in use 
  2. Type of view
  3. Memory status
  """ ;
						System.out.println(optionsMenu);
						int optionMenuChoice = input.nextInt();
						
						switch(optionMenuChoice){
							case 1: System.out.println("Memory");break;	
							case 2: System.out.println("Memory");break;
							case 3: System.out.println("Memory status");break;
							default:System.out.println("Invalid"); break;
						}		
						break;
					case 10:System.out.println("Speed dials");break;
					case 11:System.out.println("Voice tags"); break;
					default:System.out.println("Invalid Input");break;
				}
				break;
			case 2:	System.out.println("Message");
					String messageMenu = """
    1. Write Message
    2. Inbox
    3. outbox
    4. picture
    5. Templetes
    6. Simily
    7. Message Settings
    8. Info sevice
    9. Voice mailbox number
    10.Service command editor
    """ ;
					System.out.println(messageMenu);
					int messageMenuChoice = input.nextInt();

					switch(messageMenuChoice){
						case 1: System.out.println("Write Message");break;
						case 2:	System.out.println("Inbox"); break;
						case 3:	System.out.println("outbox");break;
						case 4:	System.out.println("picture"); break;
						case 5:	System.out.println("Templetes"); break;
						case 6:	System.out.println("Simily"); break;
						case 7:	System.out.println("Message Settings"); break;
						case 8:	System.out.println("Info sevice"); break;
						case 9:System.out.println("Voice mailbox number"); break;
						case 10: System.out.println("Show call duration"); break;
						default: System.out.println("Invalid");break;
					}
			case 3:	System.out.println("Chat"); break;
			case 4:	System.out.println("Call Register");
				    String callMenuRegister = """
				
    1. Missed calls
    2. Recieved calls
    3. Dialled numbers
    4. Erase recent call lists
    5. Show call duration
    6. Show call costs
    7. Call cost settings
    8. Prepaid credit

    """ ;			
				System.out.println(callMenuRegister); 
				int callMenuChoice = input.nextInt();

				switch(callMenuChoice){
					case 1: System.out.println("Missed calls");break;
					case 2:	System.out.println("Recieved calls"); break;
					case 3:	System.out.println("Dialled calls");break;
					case 4:	System.out.println("Erase recent call lists");break;
					case 5:	System.out.println("Show call duration");
						        
						        String showCallDurationMenu = """
						
    1. Last call duration 
    2. All calls duration
    3. Received calls duration
    4. Dialled calls duration
    5. Clear timers
    """;				
            
        System.out.println(showCallDurationMenu);
				int showCallDurationMenuChoice = input.nextInt();
				    	switch(showCallDurationMenuChoice){
							case 1: System.out.println("Last call duration"); break;
							case 2: System.out.println("All calls duration"); break;
							case 3: System.out.println("Recieved calls' duration"); break;
							case 4: System.out.println("Dialled calls' duration"); break;
							case 5: System.out.println("Clear timers");break;
							default: System.out.println("Invalid Input");break;
						}
						break; 
					case 6: System.out.println("Show call costs");
						String showCallCostsMenu = """
    1. Last call cost
    2. All calls cost
    3. Clear counters
    """ ;		
						System.out.println(showCallCostsMenu); 
						int showCallCostsMenuChoice = input.nextInt();

						switch(showCallCostsMenuChoice){
							case 1: System.out.println("Last call cost");break;
							case 2:	System.out.println("All calls cost"); break;
							case 4:	System.out.println("Clear counters");break;
							default:System.out.println("Invalid"); break;			
						}
						break;
					case 7: System.out.println("Call cost settings");break;
					case 8: System.out.println("Prepaid credit");break;
					default: System.out.println("Invalid");break;
				}
		
          		break;
			  case 5:	System.out.println("Tones"); 
				    		  String tonesMenu = """
        1. Ringing tone
        2. Ringing volume
        3. Incoming call alert
        4. Message alert tone
        5. Keypad tone
        6. Warning tones
        7. Vibrating alert
        8. Screen saver
        """;					  
				System.out.println("tonesMenu");
				int tonesMenuChoice = input.nextInt();
				switch(tonesMenuChoice){
							case 1: System.out.println("Ringing tone");break;
							case 2: System.out.println("Ringing volume"); break;
							case 3: System.out.println("Message alert tone");break;
							case 5: System.out.println("Incoming call alert");break;
							case 5:	System.out.println("Keypad tone");break;
							case 6: System.out.println("Warning tones");break;
							case 7: System.out.println("Vibrating alert");break;
							case 8: System.out.println("Screen saver");break;
							default: System.out.println("Invalid Input");break;	
        }
                      Strings Settings = """
			    		            
        1. Call setting
        2. Phone setting
        3. Security settings
        4. Restore factory settings
	      """ ;         
	      case 6:	System.out.println("Settings"); 
	      System.out.println("Settings");
				int settingsMenuChoice = input.nextInt();
						switch(settingsMenuChoice){
						case 1: System.out.println ("call Settings");break;
						case 1: System.out.println ("Phone setting");break;
						case 1: System.out.println ("Security settings");break;
						case 1: System.out.println ("Restore factory setting");break;
						default:System.out.print("invalid input"); break;
						        
						            String callSettingsMenu = """
						        
		    1. Automatic redial
        2. Speed dialing
        3. Call waiting options
        4. Own number sending
        5. Phone line in use
        6. Automatic answer 
		    """ ;			 
		
		           System.out.println("call Settings");
						int callSetsMenuChoice = input.nextInt();
						switch(callsettingMenuChoice){		
						  case 1: System.out.println("Automatic redial");break;
							case 2: System.out.println("Speed dialing"); break;
							case 3: System.out.println("Call waiting options"); break;
							case 4. System.out.println("Own number sending"):break;
							case 5: System.out.println("Speed dialing"); break;
							case 6: System.out.println("Phone line in use"); break;
							case 7. System.out.println("Automatic answer "):break;
							default: System.out.println("Invalid Input");break;	
							}
							
						}
							break
							
				System.out.println("Phone Setting"):
	      int settingMenuChioce = .nextInt();
	          Swicth(settingsMenuchoice){
	            case 2. System.out.println("phone Settings");
			        
			        String PhoneSettingsMenue = """
			    	    
			      1. Language
            2. Cell info display
            3. Welcome note
            4. Network selection
            5. Confirm SIM service actions
            6. Change access codes
			      """ ;  
			         System.out.println("phonwstephen");
				    		switch(callsettingMenuChoice){		
						  case 1: System.out.println("Language");break;
							case 2: System.out.println("Cell info display"); break;
							case 3: System.out.println("Welcome note"); break;
							case 4. System.out.println("Network selection"):break;
							case 5: System.out.printl("Confirm SIM service actions"); break;
							case 6: System.out.println("Change access codes"); break;
							default: System.out.println("Invalid Input");break;	
						 						
						break;
					      
			   
			  break;
			case 7:	System.out.println("Call di vert"); break;
			case 8:	System.out.println("Music");break;
						        String Music = """
						        
      1. Music player
      2. Radio
      3. Recorder
      4. Track list		
            
            System.out.println("Music");
						int musicMenuChoice = input.nextInt();
						switch(musicMenuChoice){		
						  case 1: System.out.println("Automatic redial");break;
							case 2: System.out.println("Radio"); break;
							case 3: System.out.println("Call waiting options");break;
							case 4. System.out.println("Recorder");break;
							case 5: System.out.println("Track list"); break;
							default: System.out.println("Invalid Input");break;	
			
			      break;
			  case 9:	System.out.println("Games"); break;
			  case 10:System.out.println("Calculator"); break;
			  case 11:System.out.println("Reminder"); break;
			  case 12:System.out.println("Clock"); 
			      Stringes Clock = """
       
       1. Alarm clock
       2. Clock settings
       3. Date setting
       4. Stopwatch
       5. Countdown timer
       6. Auto update of date and time
			""" ;
			            System.out.println("Clock");
				          int clockMenuChoice = input.nextInt();
				              switch(clockMenuChoice){		
						            case 1: System.out.println("Alarm clock");break;
							          case 2: System.out.println("Clock settings"); break;
							          case 3: System.out.println("Date setting"); break;
							          case 3: System.out.println("Stopwatch"); break;
							          case 4. System.out.println("Countdown timer");break;
							          case 5: System.out.println("Track list");break;
							          case 5: System.out.println("Auto update of date and time");break;
							          default System.out.println("Invalid Input");break;	
			
			  break;
			  case 13:System.out.println("Profile");break;
			  case 14:System.out.println("Service"); break;
			  case 15:System.out.println("SIM Service"); break;
			  default: System.out.println("Invalid"); break;
		  }
	  }	
}	

