class Main{
    public Static int linearSearch(int number[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }


    return-1;
    }
    public static void main(String[]args){
        int numbers[]={10,20,30,40,50};
        int key=20;

        int index=linearSearch(numbers,key);
        System.out.println("Element not Found...");
    } else {
        System.out.println("index of"+key+"is"+index);
    }
    }
}