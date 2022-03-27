middle find karo, mid.next ko newhead banao, nhead ko reverse karne ke liye bhej do, phir 4 pointer leke dono me link banao |/ aise
​
f1=c1.next;
f2=c2.next;
//link
c1.next=c2;
c2.next=f1;
//move
c1=f1;
c2=f2;