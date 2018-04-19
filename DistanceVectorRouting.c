#include <stdio.h>
#include <ctype.h>

int graph[12][12], e[12][12];
int ad[12], no, id, adc, small, chosen;
char nodes[12]={'a','b','c','d','e','f','g','h','i','j','k','l'};

int main() {
	int i,j,k,ch1,ch2=0;
	adc=0;
	printf("Enter the number of nodes : ");
	scanf("%d",&no);
	printf("Enter the value for adjacency matrix : \n");
	for(i=0;i<no;i++)
		for(j=0;j<no;j++){
			printf("Enter the values for %d %d position : ",(i+1),(j+1));
			scanf("%d",&graph[i][j]);
		}
	printf("Enter the initial estimates : \n");
	for(i=0;i<no;i++){
		printf("Estimate for node %c\n",nodes[i]);
		for(j=0;j<no;j++){
			printf("To node %c\t",nodes[j]);
			scanf("%d",&e[i][j]);
		}
	}
	do {
		printf("\n Menu:\n 1.Routing info for node\n 2.Estimated table\n Enter the choice(1 or 2) : ");
		scanf("%d",&ch1);
		switch(ch1) {
			case 1: printf("Which node should routing table be built (1-a)(2-b)... ");
					scanf("%d", &id);
					id--;
					adc=0;
					printf("Neighbors for particular node ");
					for(i=0;i<no;i++) {
						if(graph[id][i]==1) {
							ad[adc]=i;
							adc++;
							printf("%c ",nodes[i]);
						}
					}
					for(i=0;i<no;i++) {
						if(id!=i){
							small = 100;
							chosen = -1;
							for(j=0;j<adc;j++){
								int total = e[ad[j]][i]+e[id][ad[j]];
								if(total<small) {
									small = total;
									chosen = j;
								}
							}
							e[id][i] = small;
							printf("\n Shortest estimate to %c is %d\n", nodes[i],small);
							printf(" Next hop is %c",nodes[ad[chosen]]);
						}
						else 
							e[id][i]=0;
					}
					break;
			
			case 2: printf("\n");
					for(i=0;i<no;i++){
						for(j=0;j<no;j++)
							printf("%d\t",e[i][j]);
						printf("\n");
					}
					break;
		}
		printf("\n Do you want to continue (1-Yes, 2-No) ");
		scanf("%d",&ch2);
	} while(ch2==1);
	return 0;
}
