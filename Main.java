public class Main {
    public static void main(String[] args) {
    
        
        Client Mikhail = new Client("Михаил", "Лапенко","Витальевич", "Москва, ул. Профсоюзная, д. 118В", +7 (495)276-15-21);
        System.out.println("Имя:"+ Mikhail.name+ "\nФамилия"+ Mikhail.surname+ "\nОтчество:" + Mikhail.reporting+" "\nАдрес:"+ Mikhail.adress+"\nНомер телефона(+79):"+ Mikhail.phone);
        
        Detail det= new Detail("BREMBO", 1 411 300, "2P9.8002A", "Отличное");
        System.out.println("\nМарка:"+det.designation+"\nЦена (руб):"+det.pay+"\nМодель:"+det.sum+"\nКачество:"+det.designation");
        
        Shop sho= new Shop(0023, 6239, 131392);
        System.out.println("\nID Поставщика:"+ sho.sum+"\nID Клиента:"+sho.sum+"\nНомер заказа:"+sho.sum+);
        
}
}
