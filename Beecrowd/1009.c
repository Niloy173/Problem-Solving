#include<stdio.h>
int main()
{
char name[20];
double fixed_salary,per_month_salary,total_salary;
scanf("%s %lf %lf", &name, &fixed_salary, &per_month_salary);
total_salary = fixed_salary + (per_month_salary *15)/100;

printf("TOTAL = R$ %.2lf\n",total_salary);
return 0;

}