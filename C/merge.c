#include <stdio.h>
#include <stdlib.h>
#include "merge.h"
void merge(
        char a1[], int n1,
        char a2[], int n2,
        char output[]) //merge_sort(a,m);
{
	int count1 = 0;
	int count2 = 0;
	int outputSlot = 0;

	while (count1 < n1 && count2 < n2 && outputSlot < n1 + n2) {
		if (a1[count1] < a2[count2]) {
			output[outputSlot] = a1[count1];
			count1++;
		} else {
			output[outputSlot] = a2[count2];
			count2++;
		}
			outputSlot++;
	
	}
	if (count1 >= n1) {
		for (; count2 < n2 && outputSlot < n1 + n2; count2++, outputSlot++) {
			output[outputSlot] = a2[count2];
		}
	} else {	
		for (; count1 < n1 && outputSlot < n1 + n2; count1++, outputSlot++) {
			output[outputSlot] = a1[count1];
		}
	}
}
	
	



