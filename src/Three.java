public class Three {

    static BankAccount.Builder builder;
    public static void main(String[] args) {
        builder = new BankAccount.Builder();
        builder.setAccountNumber(10);
        builder.setName("hello");
        BankAccount bankAccount = builder.build();


        new BankAccount.Builder().setAccountNumber(10).setName("name").build();
    }
}
class BankAccount {
    String name;
    int accountNumber;

    public BankAccount (String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public static class Builder {
        private String builderName;
        private int builderAccountNumber;

        public Builder setAccountNumber(int accountNumber) {
            this.builderAccountNumber = accountNumber;
            return this;
        }

        public Builder setName(String name) {
            this.builderName = name;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(builderName, builderAccountNumber);
        }
    }
}