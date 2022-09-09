#include<stdio.h>
int main()
{

double A, B, C, pi, tri, c, tra, s, r;
scanf("%lf %lf %lf", &A, &B, &C);
pi = 3.14159;
tri = .5 * A * C;
c = pi * C * C;
tra = .5 * (A+B) * C;
s = B * B;
r = A * B;
printf("TRIANGULO: %.3lf\n",tri);
printf("CIRCULO: %.3lf\n",c);
printf("TRAPEZIO: %.3lf\n",tra);
printf("QUADRADO: %.3lf\n",s);
printf("RETANGULO: %.3lf\n",r);
return 0;
}