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


def sink(a, k, n): #自顶向下堆化，从k开始堆化 
	N = n - 1;
	while 2 * k <= N:
		j = 2 * k
		if j < N and a[j] < a[j + 1]: # 选出左右节点较大的一个
			j += 1 
		if a[k] < a[j]:
			a[k], a[j] = a[j], a[k]
			k = j
		else:
			break

def heap_sort(list):
	n = len(list) - 1
	for i in range(n//2, 0 , -1):
		sink(list, i, len(list))   # sink前n/2个实现一个大顶堆

	while n > 1:
		list[1], list[n] = list[n], list[1] # 依次把最大的元素放入最后
		sink(list, 1, n)    # 重新下沉，构建大顶堆
		n -= 1
	return list






test = [1, 3, 4, 5, 2]
print(heap_sort(test))
