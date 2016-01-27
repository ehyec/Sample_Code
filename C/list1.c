#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <assert.h>
#include <string.h>
#include "list1.h"

struct Node *prepend(struct Node *list, char *s)
{
	struct Node *node = (struct Node *)malloc(sizeof(struct Node));
	if (node == NULL)
		return NULL;
	
	node->next = list;
	strcpy_upto(node->data, s, 5);
	node->len = strlen(node->data);	
	return node;
		
}

void strcpy_upto(char *t, const char *s, int n)
{
	if (strlen(s) <= n) {
		strcpy(t, s);
	} else {	
		strncpy(t, s, n);
		t[n] = 0; 
	}

}


void print(struct Node *list)
{	
    	struct Node *node = list;
        while(node != NULL) 
	{
		printf("->[%hi:%s]",node->len,node->data);
		node = node->next;
	}
	printf("\n");
}

	

void deallocate_list(struct Node *list)
{
	struct Node *rest = NULL;
	while(list) {
		rest = list->next;
		free(list);
		list = rest;
	}
	
}



