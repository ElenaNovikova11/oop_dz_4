class Pair<T, U > {
    T first;
    U second;
    
    // Конструктор класса Pair, принимающий два объекта совместимых типов.
    Pair(T a, U b) {
    first = a;
    second = b;
    }
    
    // Методы для получения первого и второго объектов.
    T getFirst() {
    return first;
    }
    
    U getSecond() {
    return second;
    }

    T setFirst(T first){// setFirst(T first): метод для установки значения первого элемента пары.
        return first;
    }
    
    U setSecond(U second){
        return second;// setSecond(U second): метод для установки значения второго элемента пары.
    }
    }
