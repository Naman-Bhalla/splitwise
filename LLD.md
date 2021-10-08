- User
- Expense
- Group
- Transaction


-----
G1 (A, B, C, D)

100 A
A B C D

50 B
A B D

80 C
B C D

Settle Up
A -> B = 50
B -> C = 20
C -> D = 11
---

Expenses
100
A: 30 B: 20 C : 10 D: 40
A: 25 B: 25 C: 25 D: 25


User: bcrypt
- name
- phone number
- password // we should salt + hash the password

Expense:
- name
- map<users, int> contributors
- map<users, int> participants
- Strategy - EQUAL, MANUAL
- Group

Group
- name
- list<users>
- isSettled
- admin
- list<expense>
- list<transaction>


Transaction
- payee
- recipient
- amount
- Group {lazy-load}



Expense Z that was created by user A in which
A: 30 B: 20 C : 10 D: 40, E: 0

Anubhav goes to a restaurant (500)
A - Aloo Parantha + Curd (300)
B - Paneer Parantha (100)
C - Lassi + Paneer Parantha (100)
D - Salad
A - 200, B - 200, C - 70, D - 30



Backend 
- Frontend can show whatever it wants to show. When it
- calls my API just give me the final calculation

if (sum of all contributions == sum of al;l participants == totalMoneyInvco)
Frontend

// common libraries

API where we will allow people to send a list of participants and contributots?

Should backend implement multiple API
or should frontend implement

Backend will multiple an API where forntend says

2 APIS

1.) /expense/manual

{
amount
contributors - map
participants - map

}

2.) /expense/equal
{
amount
contributors - map
list<participants>
}
