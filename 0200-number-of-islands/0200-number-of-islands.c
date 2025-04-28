
int n, m,i,j;
bool inside(int i, int j) {
    return (0<=i)&&(i<n)&&(0<=j)&&(j<m);
}
void dfs(int i, int j, char** grid){
    if (!inside(i, j)) return;
    if (grid[i][j]=='1'){
        grid[i][j]++;
        dfs(i+1,j, grid);
        dfs(i,j+1, grid);
        dfs(i-1,j, grid);
        dfs(i,j-1, grid);
    }           
}
int numIslands(char** grid, int gridSize, int* gridColSize) {
    n=gridSize;
    m=*gridColSize;
    int num=0;
    for( int i=0; i<n; i++)
        for( int j=0; j<m; j++){
            if(grid[i][j]=='1'){
                num++;
                dfs(i, j, grid);   
            }
        }
    return num;  
}