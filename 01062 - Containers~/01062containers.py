#!/usr/bin/env python
# -*- coding: utf-8 -*-
import sys

xin=input()
data = []

while(xin !="end"):
  for i in range (len(xin)):
    flag = 1;
    if(i == 0):
        data.append([xin[i],1,0])
    for j in range (len(data)):
      if(data[j][0] == xin[i]):
        data[j][1] += data[j][2]
        data[j][2] = 0
        flag = 0
      else:
        data[j][2] += 1
    if(flag == 1):
      data.append([xin[i],1,0])

  x = 0
  for i in range(len(data)):
    if(x < data[i][1]):
      x = data[i][1]
  print (x)
  data = []
  xin=input()
