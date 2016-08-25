# coding:utf-8

def bubble_sort(list):
	# 冒泡排序
	num = len(list)
	for i in range(num):
		for j in range(i , num):
			if list[i] > list[j]:
				tmp = list[i]
				list[i] = list[j]
				list[j] = tmp
	return list

def insert_sort(list):
    # 插入排序
    count = len(lists)
    for i in range(1, count):
        key = lists[i]
        j = i - 1
        while j >= 0:
            if lists[j] > key:
                lists[j + 1] = lists[j]
                lists[j] = key
            j -= 1
    return list

def quick_sort(list, left, right):
	#  快速排序
	if left >= right:
		return list
	bench = list[left]
	low = left
	high = right5
	while left < right:
		while left < right and list[right] >= bench:
			right -= 1 
		list[left] = list[right]
		while left < right and list[left] <= bench:
			left += 1
		list[right] = list[left]
	list[right] = bench
	quick_sort(list, low, left - 1)
	quick_sort(list, left + 1 ,high)
	return list



test = [1, 3, 4, 5, 2]
print(quick_sort(test, 0 ,4))
