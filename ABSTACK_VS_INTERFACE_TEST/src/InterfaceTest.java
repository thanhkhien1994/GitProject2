//Trong interface mặc định mọi phương thức và các trường dữ liệu thì
//phạm vi truy cập đều là public
public interface InterfaceTest {
    //thuộc tính
    // trường dữ liệu khai báo mặc định đều phải là final
    //mặc định phạm vi truy cập của các trường vẫn là public
    String NAME = "name";
    int AGE = 0;

    //Hàm khởi tạo
    //không thể khởi tạo đối tượng nên không có hàm khởi tạo

    //phương thức
    //các phương thức không có phần thân
    //mặc định phạm vi truy cập vẫn là public
    // để cho các lớp con ghi đè
    void run();

    void noise();
    //mọi phương thức của inteface đều là abstract nên không cần khai báo;
    void go();
    
}
