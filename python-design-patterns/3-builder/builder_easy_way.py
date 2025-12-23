class NetworkService:
    def __init__(self, url:str="", auth:str="", cache:int=0):
        self.components = {}
        if url:
            self.components["URL"] = url
        if auth: 