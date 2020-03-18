//package cryptography;
//
////Convenience class to:
////* break a byte into nibbles
////* merge the nibbles to reform the byte
//
//class ByteManager
//{
//    //static method:
//    //* accessible without object
//    //* all inputs are as parameters and outputs as return
//    //* doesnt update the data members of the class
//    //* can update the static data members of the class
//    //* cannot directly access the non static methods
//
//    static int[] byteToNibble(int x)
//    {//‭104‬ ---> ‭[0110,1000‬]
//        int arr[] = new int[2];
//        arr[0] = (x & 255) >> 4;//higher nibble
//        arr[1] = x & 15;//lower nibble
//        return arr;
//    }
//
//    static int nibblesToByte(int nibbles[])
//    {//‭[0110,1000‬] ---> 104
//        return ((nibbles[0]&15)<<4)| (nibbles[1]&15);
//    }
//}
package cryptography;
class ByteManager{
      static int[] byteToNibble(int x){
          int nibble[]=new int[2];
          nibble[0]=(x)>>4;
          nibble[1]=(x&15);
         // System.out.println(nibble[0]+" "+nibble[1]);
          return nibble;
      }
      static int nibbleToByte(int []nibble)
      {
          return ((nibble[0])<<4|nibble[1]);
      }
}