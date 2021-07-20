package ex_problema_de_josephus;
public class Person {
    private String name,phone,address,cpf;
    private int code;
    
    public Person(String name,String phone,String address,String cpf,int code){
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.cpf=cpf;
        this.code=code;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s%nTelefone: %s%nEndereço: %s%nCPF: %s%n"
                + "Código: %d%n",
                this.name,this.phone,this.address,this.cpf,this.code);
    }
}
