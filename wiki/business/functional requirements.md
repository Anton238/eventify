# Functional Requirements

## Business Goals  

Create a new system for displaying events and selling tickets for them. 
The system should handle many users and be stable during an influx of users (f.e, when a lot of people want to buy tickets for some rare event).

## Stakeholders

**SH-1: Event Provider:**    
 - Events organizer
 - A company or person that provides events and sells tickets for them

**SH-2: Event Customer:**  
 - A person who attend events and buy tickets for them

**SH-3**: Manager:  
 - A person who check and change events info
 - Block/unblock users

## UseCases

**UC-1: Customer registration:**  
 - Customer may register their profile, credit cart 

**UC-2: Provider registration:**  
 - Provider may register their profile 

**UC-3: My account:**
- Customer/Provider may observe and change their personal data
- Customer may observe order history
- Customer may add payment method
- Provider may observe list of created events
- Provider may create a new event

**UC-4: Events creation:**
 - Provider may create events using site UI
 - Provider may upload events through available API

**UC-5: Customer checkout workflow:**  
 - Customer may select event, pay for the ticket

**UC-6: Notifications:**  
 - Customer may receive an email invoice after ticket purchase
 - Provider may receive an email notification after event creation
 - Customer may receive a week digest with recommended events
 - Provider may receive a week digest about purchases

**UC-7: Events search:**
- Events might be searched by keywords in title or description

**UC-8: Backoffice:**
- Manager may observe events data in backoffice
- Manager may change events data
- Manager may change Customer/Provider personal data
- Manager may block/unblock Customer/Provider

**UC-9: Reports:**
- Manager may observe event statistics

**UC-10: Recommendations:**  
 - Customer may observe Top 100 Events page
 - Customer may observe personally selected events