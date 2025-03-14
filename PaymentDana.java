    public class PaymentDana extends Payment {
        private String phonenumber;
        private String danaid;
        
    
        public PaymentDana(String customerId, String phonenumber, String danaid) {
            super(customerId);
            this.phonenumber = phonenumber;
            this.danaid = danaid;
        }
    
        public void pay(double amount) {
            System.out.println("transfer dana dengan nominal " + amount + " Atas Nama " + danaid + " dengan Nomor " + phonenumber +" Berhasil");
        }
    }


