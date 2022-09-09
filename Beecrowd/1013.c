#include<stdio.h>
int main()
{
    int a,b,c,maximum_value;
    scanf("%d %d %d",&a, &b, &c);

    maximum_value = a;
    if(b > maximum_value)
        maximum_value = b;
    if(c > maximum_value)
        maximum_value = c;
    printf("%d eh o maior\n",maximum_value);
    return 0;

}
