# -*- coding: utf-8 -*-
"""
Created on Thu Sep 15 15:18:48 2022

@author: pedro
"""
def vernam(key,message):
    message = str(message)
    m = message.upper().replace(" ","") # Convert to upper case, remove whitespace
    encrypt = ""
    try:
        key = int(key)           # if the key value is not a number, then run with key = 0
    except ValueError:
        key = 0
    for i in range(len(m)):
        letter = ord(m[i])-65      # Letters now range 0-25
        letter = (letter + key)%25 # Alphanumeric + key mod 25 = 0-25
        letter +=65
        

        encrypt = encrypt + chr(letter) # Concatenate message
        
    return encrypt

""" * TEST CASES * """
vernam(9,"hello world")
vernam(14,"TEST_CASE 34!")
vernam("test","test")