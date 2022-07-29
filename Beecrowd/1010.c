#include<stdio.h>
int main()
{
int x1,y1,x2,y2;
double prize_per_product1,prize_per_product2, value_to_pay;
scanf("%d %d %lf",&x1, &y1, &prize_per_product1);
scanf("%d %d %lf",&x2, &y2, &prize_per_product2);
value_to_pay = (y1 * prize_per_product1) + (y2 * prize_per_product2);


printf("VALOR A PAGAR: R$ %.2lf\n",value_to_pay);
return 0;
}