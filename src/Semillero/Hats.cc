//ackage Semillero;

#include <iostream>
#include <cstdio>

int denominador(int n);

int main()
{

    int num[] = {1, 2, 9, 44, 265, 1854, 14833, 133496, 1334961, 14684570, 176214841};

    int t, n, dem;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%d", &n);
        dem = denominador(n);
        printf("%d/%d\n", num[n - 2], dem);
    }
    return 0;
}

int denominador(int n)
{
    if (n == 0)
    {
        return 1;
    }
    else
        return n * denominador(n - 1);
}