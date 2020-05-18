package Main;
import ContactManager.ContactManager;
import ContactManager.Show;
import ContactManager.Add;
import ContactManager.Delete;
import ContactManager.Edit;
import ContactManager.Find;
import ContactManager.ReadContact;
import ContactManager.SaveContact;
import java.util.Scanner;

public class Main {
    public static void mainRun(){
        Scanner scan = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        int key = -1;
        while (key != 0){
            System.out.println("---------- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ --------");
            System.out.println("Chọn chức năng theo số để tiếp tục: ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng: ");
            int num = scan.nextInt();
            scan.nextLine();
            switch (num){
                case 1:
                    Show show = new Show(contactManager);
                    show.excute();
                    break;
                case 2:
                    Add add = new Add(contactManager);
                    add.excute();
                    break;
                case 3:
                    System.out.println("Nhập tên hoặc số để sửa: ");
                    String contentEdit = scan.nextLine();
                    Edit edit = new Edit(contactManager, contentEdit);
                    Find find1 = new Find(contactManager, contentEdit);
                    if(!find1.findProduct()){
                        System.out.println("không tìm được danh bạ, vui lòng nhập lại");
                        System.out.println("Nhập tên hoặc số để sửa: ");
                        contentEdit = scan.nextLine();
                        if(contentEdit == null){
                            mainRun();
                        }
                    }
                    edit.excute();
                    break;
                case 4:
                    System.out.println("Nhập tên hoặc số để xóa: ");
                    String content = scan.nextLine();
                    if(content == null){
                        mainRun();
                    }
                    Delete delete = new Delete(contactManager, content);
                    delete.excute();
                    break;
                case 5:
                    System.out.println("Nhập tên hoặc số để tìm kiếm: ");
                    String content1 = scan.nextLine();
                    Find find = new Find(contactManager, content1);
                    find.excute();
                    break;
                case 6:
                    System.out.println("Nhập link file CSV: ");
                    String link = scan.nextLine();
                    ReadContact readContact = new ReadContact(contactManager, link);
                    readContact.excute();
                    break;
                case 7:
                    System.out.println("Nhập link file để lưu: ");
                    String link1 = scan.nextLine();
                    SaveContact saveContact = new SaveContact(contactManager, link1);
                    saveContact.excute();
                    break;
                case 8:
                    System.exit(8);
                    break;
                default: System.out.println("not available");
            }
        }
    }
    public static void main(String[] args) {
        mainRun();
    }
}
