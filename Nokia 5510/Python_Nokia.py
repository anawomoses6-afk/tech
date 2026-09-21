menu_functionality = """
1. Phone book 
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
"""
    
print(menu_functionality)
user_input = int(input("Enter number: "))

match(user_input):
    case 1: 
        print("Phone book")
    
        phone_book_guard = """ 
1. Search
2. Service Nos.
3. Add name
4. Erase
5. Edit
6. Copy
7. Assign tone
8. Send b’card 
9. Options
10.Speed Dials
11.Voice tags 
"""
        print(phone_book_guard)
        phone_number = int(input("Enter number: "))

        match(phone_number):
            case 1:  
                print("Search")
            case 2:  
                print("Service Nos")
            case 3:  
                print("Add name")
            case 4:  
                print("Erase")
            case 5:  
                print("Edit")
            case 6:  
                print("Copy")
            case 7:  
                print("Assign tone")
            case 8:  
                print("Send b'card")
            case 9:  
                print("Options")
            case 10: 
                print("Speed dials")
            case 11: 
                print("Voice tags")
            case _:  
                print("invalid selection")
    
    case 2: 
        print("Message")
        message_book_guard = """

1.Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7.Message settings
8. Info Service
9. Voice mailbox number
10. Service command editor"""

        print(message_book_guard)
        print()
        message_input = int(input("Enter Option: "))
        
        match(message_input):
            case 1: 
                print("Write messages")
            case 2: 
                print("Inbox")
            case 3: 
                print("Outbox")
            case 4: 
                print("Picture")
            case 5: 
                print("Templetes")
            case 6: 
                print("Smileys")
            case 73: 
                print("Message settings")
            case 8:
 
                print("Info Service")
            case 9: 
                print("Voice mailbox number")
            case 10: 
                print("Service command editor")
            
            
             
    
    case 3: 
        print("Chat")
    case 4: 
        print("Call register")
        chat_book_guard = """

1. Missed Calls
2. Received calls
3. Dialled numbers
4. Erase recent lists
5. Show call duration
6. Recent call lists"""
                    
        print(chat_book_guard)
        print()
        chat_input = int(input("Enter Option: "))
        match(chat_input):
    
          case 1: 
               print("Missed Calls")
          case 2: 
               print("Received call")
          case 3: 
               print("Dialled numbers")
          case 4: 
               print("Erase recent call lists")
          case 5: 
               print("Recent call lists")
          case 6: 
               print("Show call duration")
            


    case 5: 
        print("Tones")
        message_book_guard = """
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Message alert tone
5. Keypad tones
6. Warning tones
7. Vibrating alert
8. Screen saver"""

        print(chat_book_guard)
        print()
        chat_input = int(input("Enter Option: "))
        match(chat_input):
          case 1: 
               print("Ringing tone")
          case 2: 
               print("Ringing volume")
          case 3: 
               print("Incoming call alert")
          case 4: 
               print("Message alert tone")
          case 5: 
               print("Keypad tones")
          case 6: 
               print("Warning tones")
          case 7: 
               print("Vibrating alert")
          case 8: 
               print("Screen saver")

        
    case 6: 
        print("Settings")
        print("Tones")
        message_book_guard = """
1. Call settings
2. phone settings
3. Security settings
4. Restore factory settings"""

        print(settingsneed_book_guard)
        print()
        settingsneed_input = int(input("Enter Option: "))
        match(settingsneed_input):
          case 1: 
               print("Call settings")
               call_book_guard = """
1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer"""

        print(call_setting_guard)
        print()
        call_input = int(input("Enter Option: "))
        match(call_input):
        
          case 1: 
               print("Automatic redial")
          case 2: 
               print("Speed dialling")
          case 3: 
               print("Call waiting options")
          case 4: 
               print("Own number sending")
          case 1: 
               print("Phone line in use")
          case 2: 
               print("Automatic answer")
         
               
                           
               
               
          case 2: 
               print("phone settings")
               phone_setting_guard = """

1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Confirm SIM service actions"""
               
        print(phonel_setting_guard)
        print()
        phone_input = int(input("Enter Option: "))
        match(phone_input):
        
          case 1: 
               print("Language")
          case 2: 
               print("Cell info display")
          case 3: 
               print("Welcome note")
          case 4: 
               print("Network selection")
          case 3: 
               print("Confirm SIM service actions")


          case 3: 
               print("Security settings")
               phone_setting_guard = """

1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Security level
6. Change access codes"""

        print(security_setting_guard)
        print()
        security_input = int(input("Enter Option: "))
        match(security_input):
               
          case 1: 
               print(PIN code request")
          case 2: 
               print("Call barring service")
          case 3: 
               print("Fixed dialling")
          case 4: 
               print("Closed user group")
          case 3: 
               print("Security level")
          case 4: 
               print("Change access codes")       
        
        
        
          case 4: 
               print("Restore factory settings")
    
        
        
        case 7: 
        print("Call divert")
    case 8: 
        print("Music")
         phone_setting_guard = """
        
1. Music player
2. Radio
3. Recorder
4. Track list"""

        print(security_setting_guard)
        print()
        security_input = int(input("Enter Option: "))
        match(security_input):

          case 1: 
               print("Music player")
          case 2: 
               print("Radio")
          case 3: 
               print("Recorder")
        
               
               
    case 9: 
        print("Games")
    case 10: 
        print("Calculator")
    case 11: 
        print("Reminder")
    
    case 12: 
        print("Clock")
        phone_setting_guard = """
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time"""
                      
        print(clock_setting_guard)
        print()
        clock_input = int(input("Enter Option: "))
        match(clock_input):
               
          case 1: 
               print("Alarm clock")
          case 2: 
               print("Clock settings")
          case 3: 
               print("Date setting")
          case 4: 
               print("Stopwatch")  
          case 5: 
               print("Date setting")
          case 6: 
               print("Stopwatch")
          case 7: 
               print("Countdown timer")  
          case 8: 
               print("Date setting")
          case 9: 
               print("Auto update of date and time")
        
        
    case 13: 
        print("Profile")
    case 14: 
        print("Service")
    case 15: 
        print("SIM Service")
    case _: 
        print("Invalid")
    
    
    
    
    
    
    
    
    
