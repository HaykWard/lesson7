package lesson7;

public class User<T>{
        T id;
        T card_number;

        User(T id, T card_number){
            this.id = id;
            this.card_number = card_number;
        }

        public T getId(){return id;}

        public T getCardNumber(){return card_number;}

        public static void main(String [] args){

            User user1 = new User(123444, "ajd");
            User user2 = new User(123, 123);
            User user3 = new User(123, "909jjj");
            User user4 = new User("123", "adwawd");


            System.out.println("User1 Id: "+user1.getId());
            System.out.println("User1 card number: "+user1.getCardNumber());

        }
}