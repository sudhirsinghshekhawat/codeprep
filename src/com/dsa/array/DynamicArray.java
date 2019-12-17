package com.dsa.array;

public class DynamicArray<String> {
    Object[] data;
    int initialCapacity;
    int size;

    DynamicArray(int initialCapacity)
    {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index)
    {
        return (String)data[index];
    }

    public void set(int index,String value)
    {
        data[index] = value;
    }

    public int size()
    {
        return  size;
    }

    public boolean isEmpty()
    {
        return  size==0;
    }


    public void resize()
    {
        Object[] newData = new Object[initialCapacity*2];
        for(int i=0;i<initialCapacity;i++)
            newData[i] = data[i];
        data = newData;
        initialCapacity = initialCapacity*2;
    }

    public boolean contains(String value)
    {
        for(int i=0;i<size;i++)
        {
            if (data[i].equals(value))
                return  true;
        }

        return  false;

    }

    public void insert(int index,String value)
    {
        //resize
        if (size==initialCapacity)
            resize();

        //copy up
        for(int j=size;j>index;j--)
        {
            data[j] = data[j-1];
        }

        data[index] = value;
        size++;

    }


    public void delete(int index)
    {
        for(int j = index;j<size-1;j++)
        {
            data[j] = data[j+1];
        }
        size--;

    }




}
