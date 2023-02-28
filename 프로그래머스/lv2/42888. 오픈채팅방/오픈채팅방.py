def solution(record):
    answer = []
    dic = {}
    
    for s in record:
        if(s.split(" ")[0] == "Enter"):
            dic[s.split(" ")[1]] = s.split(" ")[2]
        if(s.split(" ")[0] == "Change"):
            dic[s.split(" ")[1]] = s.split(" ")[2]
            
    for s in record:
        if(s.split(" ")[0] == "Enter"):
            answer.append(dic[s.split(" ")[1]] + "님이 들어왔습니다.")
        elif(s.split(" ")[0] == "Leave"):
            answer.append(dic[s.split(" ")[1]] + "님이 나갔습니다.")
            
    return answer