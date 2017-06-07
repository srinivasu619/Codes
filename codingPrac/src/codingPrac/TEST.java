package codingPrac;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
abstract class category
{
	abstract void display_items();
	abstract String name_info(int i);
	abstract int price_info(int i);
}
class mobiles extends category
{
	String mob_name[]=new String[5];
	int mob_price[]=new int[5];
	String agreement_statement;
	mobiles()
	{
		mob_price[0]=30000;
		mob_price[1]=13500;
		mob_price[2]=56000;
		mob_price[3]=9000;
		mob_price[4]=10000;
		mob_name[0]="Nexus 5";
		mob_name[1]="Moto G4";
		mob_name[2]="iPhone 6s";
		mob_name[3]="Mi 3sPrime";
		mob_name[4]="Samsung J7";
	}
	void display_items()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("MODEL NAME: "+mob_name[i]+"  PRICE: Rs. "+mob_price[i]);
			i++;
		}
	}
	String name_info(int i)
	{return mob_name[i-1];}
	int price_info(int i)
	{return mob_price[i-1];}
	double discount_info(int serial)
	{ Scanner scan=new Scanner(System.in);
	int ch;
	double discount=0.0;
	System.out.println("DISCOUNT OFFERS (If you select 'airtel' as an operator)");
	System.out.println("Do you want to tahe the offer?('1' for YES and '0' for NO)");
	ch=scan.nextInt();
	if(ch==1)
	{
		System.out.println("*******************PLANS*******************");
		System.out.println("1. 6-month contract(5% Discount on MRP.)");
		System.out.println("2. 12-month contract(10% Discount on MRP.) ");
		System.out.println("3. 18-month contract(12% Discount on MRP.) ");
		System.out.println("Selct the plan no. from above");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1:discount=0.05*mob_price[serial-1];
		agreement_date(serial);
		break;
		case 2:discount=0.10*mob_price[serial-1];
		agreement_date(serial);
		break;
		case 3:discount=0.12*mob_price[serial-1];
		agreement_date(serial);
		break;
		}
	}
	else{
		discount=0;
	}
	return discount;
	}
	String agr()
	{
		return agreement_statement;
	}
	String return_date(int days)
	{
		Date date=new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		String s="";
		s+=cal.getTime();
		return s;
	}
	void agreement_date(int i)
	{
		int days=30;
		if(i==1)
		{
			days*=6;
			agreement_statement="Your agreement will expire on :"+return_date(days);
		}
		if(i==2)
		{
			days*=12;
			agreement_statement="Your agreement will expire on :"+return_date(days);
		}
		if(i==3)
		{
			days*=18;
			agreement_statement="Your agreement will expire on :"+return_date(days);
		}
	}
}
class laptops extends category
{
	String lap_name[]=new String[5];
	int lap_price[]=new int[5];
	String Warranty_Statement="";
	laptops()
	{
		lap_price[0]=30000;
		lap_price[1]=45500;
		lap_price[2]=56000;
		lap_price[3]=50000;
		lap_price[4]=40000;
		lap_name[0]="HP Pavallion";
		lap_name[1]="Dell Inspiron 5558";
		lap_name[2]="Lenovo Yoga";
		lap_name[3]="Asus Notebook";
		lap_name[4]="Acer Notebook";
	}
	void display_items()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("MODEL NAME: "+lap_name[i]+"  PRICE: Rs. "+lap_price[i]);
			i++;
		}
	}
	String name_info(int i)
	{return lap_name[i-1];}
	int price_info(int i)
	{return lap_price[i-1];}
	String agr()
	{
		Date date=new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,365);
		Warranty_Statement+=cal.getTime();
		return Warranty_Statement;
	}

}

class TEST
{

	public static void main(String args[])
	{
		int serial,total_cost=0,cart_count=0,ch,choice,ans,lap_no=0,mob_no=0;
		double total_discount=0,temp;
		String product_name[]=new String[10];
		int product_cost[]=new int[10];
		char type[]=new char[10];
		double discount[]=new double[10];
		String Warranty[]=new String[10];
		String agreement_stm[]=new String[10];
		Scanner sc=new Scanner(System.in);
		do
		{System.out.println("TWO CATEGORIES \n1.MOBILES\n2.LAPTOPS\nENTER THE CHOICE");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	System.out.println("MOBILE PRODUCTS");
		mobiles mob=new mobiles();
		mob.display_items();
		do {
			System.out.println("Which mobile do you want to buy?('0' for not buying any of the product)");
			serial=sc.nextInt();
			if(serial==0)
			{
				System.out.println("Your cart is empty.");
				break;
			}
			else
			{ cart_count++;
			mob_no++;
			total_cost+=mob.price_info(serial);
			temp=mob.discount_info(serial);
			total_discount+=discount[cart_count-1]=temp;
			product_name[cart_count-1]=mob.name_info(serial);
			product_cost[cart_count-1]=mob.price_info(serial);
			agreement_stm[mob_no-1]=mob.agr();
			type[cart_count-1]='M';
			System.out.println("YOUR CART INFO:");
			System.out.println("   PRODUCT NAME\t\tPRODUCT COST\t\tDISCOUNT\t\tNET PRICE");
			for(int i=0;i<cart_count;i++)
			{
				System.out.println(i+1+".  "+product_name[i]+"              \t\t\t"+product_cost[i]+"      \t"+discount[i]+"      \t"+(double)(product_cost[i]-discount[i]));
			}
			}
			System.out.println("Do you want to continue?('1' for YES or '0' for No)");
			ch=sc.nextInt();
		} while (ch==1);
		break;
		case 2:laptops lap=new laptops();
		lap.display_items();
		do {
			System.out.println("Which laptop do you want to buy?('0' for not buying any of the product)");
			serial=sc.nextInt();
			if(serial==0)
			{
				System.out.println("Your cart is empty.");
				break;
			}
			else
			{ cart_count++;
			lap_no++;
			total_cost+=lap.price_info(serial);
			product_name[cart_count-1]=lap.name_info(serial);
			product_cost[cart_count-1]=lap.price_info(serial);
			Warranty[lap_no-1]=lap.agr();
			type[cart_count-1]='L';
			System.out.println("YOUR CART INFO:");
			System.out.println("   PRODUCT NAME\t\tPRODUCT COST");
			for(int i=0;i<cart_count;i++)
			{
				System.out.println(i+1+".  "+product_name[i]+"              \t\t\t"+product_cost[i]);
			}
			}
			System.out.println("Do you want to continue?('1' for YES or '0' for No)");
			ch=sc.nextInt();
		} while (ch==1);
		break;
		}
		System.out.println("DO WANT TO CHECKOUT AND PAY?('1' for YES or '0' for No(FOR MORE SHOPPING))");
		ans=sc.nextInt();
		}while(ans==0);
		System.out.println("*************************************************************************************");
		System.out.println("                      THE TOTAL SUMMARY OF YOUR PURCHASE IS");
		System.out.println("   PRODUCT NAME      PRODUCT COST    DISCOUNT");
		for(int i=0;i<cart_count;i++)
		{
			System.out.println(i+1+".  "+product_name[i]+"\t"+product_cost[i]+"\t\t\t"+discount[i]);
		}
		System.out.println("TOTAL AMOUNT TO PAY: Rs. "+(double)(total_cost-total_discount));
		System.out.println("**************************************************************************************");
		System.out.println("EXTRAS:");
		int j=0,k=0;
		for(int i=0;i<cart_count;i++)
		{
			if(type[i]=='M')

				{
				System.out.println("FOR MOBILE MODEL: "+product_name[i]+"\t"+agreement_stm[j]);
				j++;
				}
			if(type[i]=='L')
			{
			System.out.println("FOR LAPTOP MODEL: "+product_name[i]+"\t"+Warranty[k]);
		k++;
			}
		}


	}
}
