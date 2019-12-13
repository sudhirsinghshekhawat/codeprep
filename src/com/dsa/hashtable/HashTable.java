package com.dsa.hashtable;

public class HashTable {

    private int INITIAL_SIZE = 16;
    private HashEntry[] data;

    class HashEntry {
        String key;
        String value;
        HashEntry next;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    HashTable()
    {
        data = new HashEntry[INITIAL_SIZE];
    }


    private int getIndex(String key)
    {
        int hashcode = key.hashCode();
        System.out.println("hashcode : "+hashcode);

        int index = hashcode%INITIAL_SIZE;
        System.out.println("index : "+index);
        return  index;
    }


    public void put(String key,String value)
    {
        int index = getIndex(key);
        HashEntry hashEntry = new HashEntry(key,value);
        if (data[index]==null)
            data[index]=hashEntry;
        else
        {
            HashEntry startEntry = data[index];
            while (startEntry.next!=null && !startEntry.key.equals(key))
            {
                startEntry = startEntry.next;
            }
            startEntry.next = hashEntry;

        }
    }


    public String get(String key)
    {
        int index = getIndex(key);
        HashEntry starEntry = data[index];

        if(starEntry!=null)
        {
            while(!starEntry.key.equals(key) && starEntry.next!=null)
            {
                starEntry = starEntry.next;
            }
            return  starEntry.value;
        }
        return  null;
    }
















}
