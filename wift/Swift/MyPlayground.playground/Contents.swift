//: Playground - noun: a place where people can play

import UIKit

var bit = [1,0,1,1,0,1]


var i = 0
var c = 1
var cut = 0
while bit[cut] == 1 {
    print(bit[cut] , "bit at cut")
    cut += 1
    i = i + 1
    print(i , "i")
    c = c + 1
    print(c , "c")
    if c > cut {
        break
    }
}

print("end")
print(i, "i")
print(c , "c")

