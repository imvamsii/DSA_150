class Solution {

    public int romanToInt(String s) {
        int integer = 0; //output
        int prev = 0;

        for(int i=s.length()-1; i>=0; i--){
            int currentValue = getValue(s.charAt(i));

            if(currentValue >= prev) integer += currentValue;
            else integer -= currentValue;
            prev = currentValue;
        }
        return integer;
    }

    public int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default  : return 0;
        }
    }
}

//Start from the last 
//find the character at that position 
//get the integer value for that roman using switch case
//now compare the current value of int with prev
//if current > prev then add
//if not subtract

//LVIII   58
//50 5 1 1 1

//MCMXCIV   1994
//1000 100 1000 10 100 1 5

//tc = O(n), sc = O(1)
