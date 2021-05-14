import tweepy
from ApiCreator import getApi


def post(contents, source):
    api = getApi(source)
    api.update_status(status=(contents))


def reply(contents, source, original):
    api = getApi(source)
    api.update_status(tweet, in_reply_to_status_id=tweetid)
