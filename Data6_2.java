class Data6_2 {
    Data6_3 data2 = new Data6_3(); // 참조형
}

class Data6_3 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_2Main {
    public static void main(String[] args) {
        Data6_2 data = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);
        System.out.println();

        //changeParameter() 메서드의 매개변수에 Data6_2의 참조형 변수인 data2 입력
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.data2);
        System.out.println();

        // changeParameter의 data.data2는 참조형 변수이기에 data2의 주소값이 넘어감
        // changeParameter의 매개변수 data.data2와 changeParameter의 지역변수 data2는 주소값이 같기에 같은 값을 가리킴
        // changeParameter에서 data2.x 와 data2.y를 바꾸면 실제 data.data2의 변수값들도 바뀜
        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);
    }
    static void changeParameter(Data6_3 data2) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값을 변경 한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
    }
}