#include <iostream>
#include <math.h>
#include <string.h>
#include <algorithm>
#include <stdio.h>
using namespace std;
int main()
{
	double l1,l2,a;
	while (cin>>l1>>l2>>a)
	{
		double b=a/180.0*M_PI;
		l1/=2;
		l2/=2;
		double temp=(l1+l2+sqrt(l1*l1+l2*l2-2*l1*l2*cos(b)))/2;
		double ans=temp*temp*M_PI;
		printf("%.10f\n",ans);
	}
	return 0;
}