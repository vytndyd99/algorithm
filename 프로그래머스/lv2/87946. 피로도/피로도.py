import sys
sys.setrecursionlimit(10 ** 8)

def solution(k, dungeons):
    answer = []
    visited = [False for i in range(len(dungeons))]
    
    def DFS(K, count):
        for i in range(len(dungeons)):
            if(visited[i] == False and K >= dungeons[i][0]):
                visited[i] = True
                DFS(K - dungeons[i][1], count + 1)
                visited[i] = False
        answer.append(count)
        return
        
    count = 0
    DFS(k, count)
    answer = max(answer)
    
    return answer