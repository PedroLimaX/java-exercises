# -*- coding: utf-8 -*-
"""
Created on Wed Sep 14 22:31:05 2022

@author: pedro
"""

# Vernam cypher demo
# T Street 2015-10-16

def makeVernamCypher( text, key ):
    """ Returns the Vernam Cypher for given string and key """
    answer = "" # the Cypher text
    p = 0 # pointer for the key
    for char in text:
        answer += chr(ord(char) ^ ord(key[p]))
        p += 1
        if p==len(key):
            p = 0
    return answer

                      
MY_KEY = "cvwopslweinedvq9fnasdlkfn2"
while True:
    print("\n\n---Vernam Cypher---")
    PlainText = input("Enter text to encrypt: ")
    # Encrypt
    Cypher = makeVernamCypher(PlainText, MY_KEY)
    print("Cypher text: "+Cypher)
    # Decrypt
    decrypt = makeVernamCypher(Cypher, MY_KEY)
    print("Decrypt: "+decrypt)