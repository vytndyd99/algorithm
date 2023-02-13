import collections

def solution(maps):
    answer = 0
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    
    def BFS(start):
        q = collections.deque([(start)])
        while q:
            y, x = q.popleft()
            for s in range(4):
                newX = x + dx[s]
                newY = y + dy[s]
                if(newX < 0 or newX >= len(maps[0]) or newY < 0 or newY >= len(maps)):
                    continue
                if(maps[newY][newX] == 0):
                    continue
                if(maps[newY][newX] == 1):
                    maps[newY][newX] = maps[y][x] + 1
                    q.append((newY, newX))
        if(maps[len(maps) - 1][len(maps[0]) - 1] == 1):
            return -1
        else:
            return maps[len(maps) - 1][len(maps[0]) - 1]
    
    answer = BFS((0,0)) 
    
    return answer