sources = {
    "Roku Smart Toaster": (),
    "Amazon Smart Water Bottle": (),
    "Bluetooth-Enabled Cheez-It Box": (),
    "Rum Bottles": (),
    "Non-Gluten-Free People": (),
    "Logitech HD 1080p Webcam": (),
    "A Broken AC Unit": (),
    "Donny J's Tears": (),
    "2005 Pontiac Aztek": (),
    "Patrick Mahomes' Super Bowl Ring": ()
}


def getApi(sourceOption):
    auth = tweepy.OAuthHandler(sources[sourceOption][0], sources[sourceOption][1])
    auth.set_access_token(sources[sourceOption][1], sources[sourceOption][2])
    api = tweepy.API(auth)

    return api