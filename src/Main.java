import java.util.Arrays;
public static void main(String[] args) {
    int[] arr = new int[10]; //00000000
    int size = 4;
    int[] arr2 = new int[arr.length];
    //Якщо потрібно збільшити розмір масиву
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    int addElement = 7;
    int arraySize = arr.length + 1;
    int[] array_2 = new int[arraySize];
    for (int i = 0; i < arraySize - 1; i++) {
        array_2[i] = arr[i];
    }
    array_2[arraySize - 1] = addElement;
    System.out.println(Arrays.toString(array_2));

    // Додавання елементів
    arr[size] = 3;
    arr[0] = 5;
    arr[1] = 1;
    arr[2] = 7;
    // Вивід елементів
    System.out.println(Arrays.toString(arr));
    System.out.print("Початковий масив: " + Arrays.toString(arr));

    System.out.println();

    // Зміна елемента (індекс 1 на 10)

    arr[1] = 10;

    // Видалення елемента за індексом 2
    int indexToRemove = 2;
    for (int i = 0; i <= arr.length - 1; i++) {
        if (i == indexToRemove) {
            arr[i] = 0;
        }
    }
    System.out.println("Масив після видалення елементу за індексом" + Arrays.toString(arr));
    // Видалення дублікатів

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] != 0 && arr[i] == arr[j]) {
                arr[j] = 0;
            }
        }
    }



    // Вивід прямий

    System.out.println("Масив після видалення дублікатів" + Arrays.toString(arr));



    System.out.println("Масив після змін і видалення дублікатів: " + Arrays.toString(arr));


    System.out.println();

    // Вивід зворотній
    for (int j = 0; j < arr.length; j++) {
        arr2[j] = arr[arr.length - 1 - j];
    }
    System.out.println("Масив у зворотному порядку: " + Arrays.toString(arr2));

    // Перемішування
    for (int i = arr.length - 1; i > 0; i--) {
        int j = (int)(Math.random() * (i + 1));
        int arr3 = arr[i];
        arr[i] = arr[j];
        arr[j] = arr3;
    }
    // Вивід після перемішування
    System.out.print("Масив після перемішування: ");
    System.out.println(Arrays.toString(arr));

}
