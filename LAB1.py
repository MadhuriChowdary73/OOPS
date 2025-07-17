a=[5,3,8,1,9]

#transversing
print("elements of the list are:")
for i in range(len(a)):
    print(a[i])

#inserting
print("inserting 7 at index 2:")
a.insert(2,7)
print(a)

#deleting an element at given index
print("deleting an element from index 1:")
a.pop(1)
print(a)

#searching(linearsearch)
print("seaching for element 8:")
def linear_search(list,element):
  for i in range(len(a)):
     if a[i]==8:
      print("element is at the index:",i)
linear_search(a,8)

#Update
print("updating index 3 to 4:")
a[3]=4
print(a)
    