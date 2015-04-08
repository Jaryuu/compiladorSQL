##Universidad del Valle de Guatemala
##Bases de datos
##Laboratorio 11
##Julio Ayala 12362
##Ricardo Zepeda 12311

from random import *

tupla = "INSERT INTO recibo VALUES ( "

file = open("reciboInsert.sql","w")

for i in range(10000):
    values = tupla+str(randint(1,10))+", "+str(randint(1,10))+", "+str(round(uniform(10.0,500.0),2))+","+str(i)+")"
    file.write(values+";\n")
file.close()



