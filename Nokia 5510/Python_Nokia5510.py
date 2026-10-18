while(True):       
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
    0.  Exit
    """ 
    print(menu_functionality)
    user_input = int(input("Enter number: "))

    

    ---------------------------------------------                  
            
        case 7: 
            print("Call divert")
        case 8: 
            print("Music")
            music_setting_guard = """
            1. Music player
            2. Radio
            3. Recorder
            4. Track list
            99.Home
            0. Exist
            """

            print(music_setting_guard)
            print()
            music_input = int(input("Enter Option"))
            match(music_input):

              case 1: 
                   print("Music player")
              case 2: 
                   print("Radio")
              case 3: 
                   print("Recorder")
              case 4:
                    print("Track list")
              case 99: 
                   print("Home")
              case 0:
                   print("Exist")
                   break
              case _: 
                   print("Invalid")

                   
                   
        case 9: 
            print("Games")
        case 10: 
            print("Calculator")
        case 11: 
            print("Reminder")
        
        case 12: 
            print("Clock")
            while(True):
                phone_setting_guard = """
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                0. Exit
                """
                              
                print(phone_setting_guard )
                print()
                clock_input = int(input("Enter Option"))
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
                  case 99:
                       print("Home")
                  case 0:
                       print("Exiting...")
                       break
                  case _: 
                       print("Invalid")
            
            
        case 13: 
            print("Profile")
        case 14: 
            print("Service")
        case 15: 
            print("SIM Service")
        case 99:
            print("Home")
        case 0:
            print("Exit")
            break
        case _: 
            print("Invalid")
        
    
    
    
    
    
    
    
    
