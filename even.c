int main()
{
int num;
printf("\nEnter a number:");
scanf("%d",&num);
num=num & 1;
if(num==0)
printf("\nNumber is Even");
else
printf("\nNumber is Odd");
}
