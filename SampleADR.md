Title: 

Limit the EC2 instances spinups on Production when user load is more than 500 users Accessing website between 00:00Am to 08:00Am

Status:

Approved 
  
  
Context:

It has been observed that the user load has been increased during non-business hours which seems automated brute force attack on some features where rate limit or Throttling is not possible. These EC2 instances are unnecessary and increase the overall infrastructure budget. Also, end users won't use our application outside of business hours. So limiting load is a legit option.
  

Decision:

Stop EC2 spinup up once the user load reaches 500 users and present a friendly message for all users once the user load reaches 500 users 
  

Consequences:

Bad user experience for real users in cases they are working out of office hours
