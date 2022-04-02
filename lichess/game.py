import requests


class Game:
    def __init__(self, id) -> None:
        self.id
        self.states = []

    def make_move(self, move):
        pass

    def resign(self):
        pass

    def abort(self):
        pass

    def handle_draw_offer(self, accept=False):
        pass

    def getState(self):
        res = requests.get
        pass
