def nokia_5510_main():
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
    
    match(user_input):
        case 1:
            phone_book_function()
        case 2:
            message_function()
        case 3:
            chat_function()

            
# COMPONENT FUNCTIONS

# Phone book function...
def phone_book_function():
    print("Phone book")
    while(True):
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
        10. Speed Dials
        11. Voice tags 
        0. Exit
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
            case 0:
                print("Exiting...")
                break
            case _:  
                print("invalid selection")
  
# Message function... 
def message_function():
    print("Message")
    while(True):
        message_book_guard = """
        1. Write messages
        2. Inbox
        3. Outbox
        4. Picture messages
        5. Templates
        6. Smileys
        7. Message settings
        8. Info Service
        9. Voice mailbox number
        10. Service command editor
        0. Exit
        """       
        print(message_book_guard)
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
                print("Templates")
            case 6: 
                print("Smileys") 
            case 7: 
                print("Message settings")
            case 8:
                print("Info Service")
            case 9: 
                print("Voice mailbox number")
            case 10: 
                print("Service command editor")
            case 0:
                print("Exiting...")
                break
            case _:  
                print("invalid selection")
        
# Chat function...        
def chat_function():
    print("Chat")
    while(True):
        chat_call_guard = """
        1. Last call duration
        2. All calls’ duration
        3. Received calls’ duration
        4. Dialed calls’ duration
        5. Clear timers
        0. Exit
        """
        print(chat_call_guard)
        chat_input = int(input("Enter input: "))
        match(chat_input):
            case 1: 
                print("Last call duration")
            case 2: 
                print("All calls’ duration")
            case 3: 
                print("Received calls’ duration")
            case 4: 
                print("Erase recent call lists")
            case 5: 
                print("Clear timers")
            case 0:
                print("Exit")
                break
            case _:
                print("Invalid selection")
