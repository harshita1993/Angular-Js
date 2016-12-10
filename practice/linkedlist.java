public class linklistaddition{

public node add(Node n1,Node n2)
{
int carry=0;
Node newhead=null;
Node curr=null;
while(n1!=null && n2!=null)
{
int a=n1.data;
int b=n2.data;
int total=a+b+carry;
if(total>=10)
{
carry=1;
total=total-10;
}
if(newHead==null)
{
newhead=new node(total)
curr=newhead;
}
else
node n=new node(total)
curr.next=n;
curr=n
curr=newhead;
}

n1=n1.next;
n2=n2.next;
}

while(n1!=null){
int x=n1.data+carry;
node n=new node(x);
curr.next=n;
curr=curr.next;
n1=n1.next;
carry=0;
}
while(n2!=null)
{
int x=n2.data+carry;
node n=new node(x);
curr.next=n;
curr=curr.next;
n2=n2.next;
carry=0;
}

if(carry>0)
{
node n=new node(1);
curr.next=n;
curr=curr.next;
}

return newhead;
}

public static display(node head)
{
node currnode=head;
while(currnode!=null){
System.out.println(""+currnode.data);
currnode=currnode.next;
}
}
public void displayreverse(node head){
node currnode=head;
if(node==null){
return;
}
display(head.next)
System.out.println(head.data);
}

public  void main(String args[]){
linklistaddition l = new linklistaddition();
node n1 = new node(6);
n1.next= new node(9);
n1.next.next = new node(6);
n1.next.next.next = new node(7);
System.out.print("First Number in REVERSE order: ");
l.display(n1);
node n2 = new node(4);
n2.next= new node(5);
System.out.print("\n Second Number in REVERSE order : ");
l.display(n2);
node x = l.add(n2, n1);
System.out.print("\n Addition in REVERSE order : ");
l.display(x);
System.out.print("\n Actual Result in FORWARD ORDER  : ");
l.displayReverse(x);
}
}
class node{
	public int data;
	public node next;
	public node(int data){
		this.data = data;
		this.next = null;
	}
}	




