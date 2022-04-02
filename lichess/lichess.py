import requests
TOKEN = "lip_YYx13tyCIf1PEvNWVOQq"

headers = {"authorization": f"Bearer {TOKEN}"}
class lichess:

    headers = {"authorization": f"Bearer {TOKEN}"}

    def __init__(self, token=TOKEN) -> None:
        self.token = token

    def challange_ai(ai_level=1, clock_limit=300, clock_increment=1, days=1, variant="standard") -> str:
        data = {"level": ai_level, "clock.limit": clock_limit, "clock.increment": clock_increment, "days": days, "variant": variant}
        res = requests.post("https://lichess.org/api/challenge/ai", data=data, headers=headers)
        print(res.text)
        return res.text["id"]

    def make_move():
        raise NotImplemented

        
        