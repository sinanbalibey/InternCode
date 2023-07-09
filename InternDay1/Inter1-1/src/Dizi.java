public class Dizi {
    private int array[];
    private int size;
    public Dizi(){

        array=new int[0];
        size=0;

    }

    void Add(int x){

        int[] newArray=new int[size+1];

        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }

        newArray[size]=x;
        array=newArray;
        size++;

    }
    void Sil(int x){
        /**
         * Yeni diziyi oluştur boyutunu bir azalt
         * Silmek istediğin elemanı Find() ile bul
         * Eğer -1 gelirse silmek istediğimiz değer dizide yok
         * Varsayalım n değeri geri döndü.Dizinin 0.elemanından n-1. elemanına kadar yeni diziye eşitle
         * Sonra newArrayı[i]=array[i+1];
         * arr
         *
         * * */
        int[] newArray=new int[size-1];
        int n=Find(x);//n silinecek değerin yeri

        if(n==-1){
            System.out.println();
            System.out.println("Silmek istediğin değer dizide yok");

        } else if (true) {
            for(int i=0;i<=n;i++) {
                newArray[i] = array[i];
            }
        } else {
            for(int i=n;i<size-1;i++){
                newArray[i]=array[i+1];
            }
        }

        array=newArray;
        size--;


    }

    int Find(int value){

        for(int i=0;i< array.length;i++){
            if(array[i]==value){
                return i;
            }
        }


       return -1;
    }

     int Boyut(){
        return size;
    }
    void Print(){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }


}
